package com.example.ruili.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private String[]data={"北京","上海","浙江","天津","重庆","香港","澳门","台湾","黑龙江","吉林",
  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
             MainActivity.this, android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view,int position,long id){
                Toast.makeText(MainActivity.this,data[position],Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,City.class);
                intent.putExtra("p",data[position]);
               startActivity(intent);
            }
        });
    }
}
