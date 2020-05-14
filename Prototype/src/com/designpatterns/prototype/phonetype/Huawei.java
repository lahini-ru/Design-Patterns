package com.designpatterns.prototype.phonetype;

import com.designpatterns.prototype.MobilePhone;

public class Huawei extends MobilePhone {

    private String HuaweiModel;

    public String getHuaweiModel() {
        return HuaweiModel;
    }

    public void setHuaweiModel(String huaweiModel) {
        HuaweiModel = huaweiModel;
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "HuaweiModel='" + HuaweiModel + '\'' +
                '}';
    }
}
