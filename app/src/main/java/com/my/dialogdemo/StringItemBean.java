package com.my.dialogdemo;

public class StringItemBean {

    /**
     * ListView的Item内容
     */
    private String itemStr;

    public StringItemBean(String str){
        this.itemStr = str;
    }

    public String getItemStr() {
        return itemStr;
    }

    public void setItemStr(String itemStr) {
        this.itemStr = itemStr;
    }
}
