package com.orange.house.adapter;

/**
 * Created by Administrator on 2016/5/4.
 */
public class House {

    private String house_icon;
    private String house_title;
    private String house_content;


    public House(String house_title, String house_content) {
        this.house_title = house_title;
        this.house_content = house_content;
    }

    public House(String house_icon, String house_content, String house_title) {
        this.house_icon = house_icon;
        this.house_title = house_content;
        this.house_content = house_title;
    }

    public String getHouse_icon() {
        return house_icon;
    }

    public void setHouse_icon(String house_icon) {
        this.house_icon = house_icon;
    }

    public String getHouse_content() {
        return house_content;
    }

    public void setHouse_content(String house_content) {
        this.house_content = house_content;
    }

    public String getHouse_title() {
        return house_title;
    }

    public void setHouse_title(String house_title) {
        this.house_title = house_title;
    }
}
