package com.example.regischarles.nestedrecyclerviewdemo;

public class ChildModel {
    private String name,appSize,popularity;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    private int icon;
    public ChildModel(String name,String appSize,String populatrity,int icon){
        this.name=name;
        this.appSize=appSize;
        this.popularity=populatrity;
        this.icon=icon;
    }
    public ChildModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
}
