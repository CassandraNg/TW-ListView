package com.myapplicationdev.android.tw_listview;

class Module {

    String code;
    int icon;

    public Module(String code, int icon) {
        this.code = code;
        this.icon = icon;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", icon=" + icon +
                '}';
    }
}
