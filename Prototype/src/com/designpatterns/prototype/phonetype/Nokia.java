package com.designpatterns.prototype.phonetype;

import com.designpatterns.prototype.MobilePhone;

public class Nokia extends MobilePhone {

    private long CompanyBatchNum;

    public long getCompanyBatchNum() {
        return CompanyBatchNum;
    }

    public void setCompanyBatchNum(long companyBatchNum) {
        CompanyBatchNum = companyBatchNum;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "CompanyBatchNum=" + CompanyBatchNum +
                '}';
    }
}
