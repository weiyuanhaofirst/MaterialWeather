package com.example.weather.db;

import org.litepal.crud.LitePalSupport;
/*
省
 */
public class Province extends LitePalSupport {
    private int id;

    private String provinceName;//省的名字

    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
