package com.designpatterns.prototype;

public abstract class MobilePhone implements Cloneable{

    private long IMInumber;
    private String ModelNumber;
    private String AndroidVersion;

    public long getIMInumber() {
        return IMInumber;
    }

    public void setIMInumber(long IMInumber) {
        this.IMInumber = IMInumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String modelNumber) {
        ModelNumber = modelNumber;
    }

    public String getAndroidVersion() {
        return AndroidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        AndroidVersion = androidVersion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
