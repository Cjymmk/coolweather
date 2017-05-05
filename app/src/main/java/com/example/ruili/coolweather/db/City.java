package com.example.ruili.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ruili on 2017/5/4.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
}
