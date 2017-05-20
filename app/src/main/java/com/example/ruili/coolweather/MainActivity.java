package com.example.ruili.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String[] data=new String[]{"北京","浙江","江苏"};
    private String[] citybj = new String[]{"北京"};
    private String[] cityzj = new String[]{"杭州", "温州", "绍兴", "湖州", "衢州", "金华", "台州", "嘉兴", "舟山", "宁波", "丽水"};
    private String[] cityjs = new String[]{"南京", "苏州", "无锡", "常州", "镇江", "南通", "泰州", "扬州", "盐城", "淮安", "连云港"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button=(Button) findViewById(R.id.button);
        button.setVisibility(View.GONE);
        final ListView listView= (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                button.setVisibility(View.VISIBLE);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
                        listView.setAdapter(adapter);
                        button.setVisibility(View.GONE);
                    }
                });
                Toast.makeText(MainActivity.this, data[position], Toast.LENGTH_SHORT).show();
                String  data[]=null;
                if ("北京".equals(MainActivity.this.data[position])) {
                    ArrayAdapter adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,citybj);
                    listView.setAdapter(adapter);
                } else if("浙江".equals(MainActivity.this.data[position])){
                    ArrayAdapter adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,cityzj);
                    listView.setAdapter(adapter);
                }
                else {
                    ArrayAdapter adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,cityjs);
                    listView.setAdapter(adapter);
                }
            }
        });
    }
}

