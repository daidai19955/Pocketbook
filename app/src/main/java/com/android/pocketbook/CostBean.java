package com.android.pocketbook;

import java.io.Serializable;

public class CostBean implements Serializable {
    public String costTitle;
    public String costData;
    public String costMoney;

    @Override
    public String toString() {
        return "CostBean{" +
                "costTitle='" + costTitle + '\'' +
                ", costData='" + costData + '\'' +
                ", costMoney='" + costMoney + '\'' +
                '}';
    }

    public String getCostData() {
        return costData;
    }
    public void setCostData(String costData) {
        this.costData = costData;
    }

    public String getCostMoney() {
        return costMoney;
    }
    public void setCostMoney(String costMoney) {
        this.costMoney = costMoney;
    }

    public String getCostTitle() {
        return costTitle;
    }
    public void setCostTitle(String costTitle) {
        this.costTitle = costTitle;
    }
}
