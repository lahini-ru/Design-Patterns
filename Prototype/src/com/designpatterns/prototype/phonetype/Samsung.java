package com.designpatterns.prototype.phonetype;

import com.designpatterns.prototype.MobilePhone;

public class Samsung extends MobilePhone {

    private String SamsungModel;

    public String getSamsungModel() {
        return SamsungModel;
    }

    public void setSamsungModel(String samsungModel) {
        SamsungModel = samsungModel;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "SamsungModel='" + SamsungModel + '\'' +
                '}';
    }
}
