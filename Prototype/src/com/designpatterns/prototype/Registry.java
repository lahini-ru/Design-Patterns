package com.designpatterns.prototype;

import com.designpatterns.prototype.phonetype.*;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<PhoneBrand, MobilePhone> mobilePhones=new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public MobilePhone getBrand(PhoneBrand phoneBrand){

        MobilePhone mobilePhone=null;
        try {
            mobilePhone=(MobilePhone) mobilePhones.get(phoneBrand).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mobilePhone;
    }

    private void initialize() {

        Samsung samsung=new Samsung();
        samsung.setIMInumber(1000);
        samsung.setModelNumber("M1000");
        samsung.setAndroidVersion("7.0");
        samsung.setSamsungModel("Galaxy");

        Nokia nokia=new Nokia();
        nokia.setIMInumber(2000);
        nokia.setModelNumber("M2000");
        nokia.setAndroidVersion("7.5");
        nokia.setCompanyBatchNum(5050);

        Huawei huawei=new Huawei();
        huawei.setIMInumber(3000);
        huawei.setModelNumber("M3000");
        huawei.setAndroidVersion("7.2");
        huawei.setHuaweiModel("nova");

        mobilePhones.put(PhoneBrand.SAMSUNG,samsung);
        mobilePhones.put(PhoneBrand.NOKIA,nokia);
        mobilePhones.put(PhoneBrand.HUAWEI,huawei);

    }
}
