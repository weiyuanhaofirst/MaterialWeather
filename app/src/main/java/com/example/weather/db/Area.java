package com.example.weather.db;

import org.litepal.crud.LitePalSupport;


/*
区
 */
public class Area extends LitePalSupport {

    private int id;

    private String areaName;//地区名字

    private int weatherId;//地区天气id

    private int cityId;//地区所属城市id



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
