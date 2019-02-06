package com.example.weather.db;

import org.litepal.crud.LitePalSupport;
/*

市
 */
public class City extends LitePalSupport {

    private int id;

    private String cityName;//城市名字

    private int cityCode;//城市所属id

    private int provinceId;//城市所属省的id

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
