package com.example.appdatthucan;

public class product_tbao{
    int id,image;
    String title,chi_tiet,time;

    public product_tbao() {
        this.id = id;
        this.image = image;
        this.title = title;
        this.chi_tiet = chi_tiet;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChi_tiet() {
        return chi_tiet;
    }

    public void setChi_tiet(String chi_tiet) {
        this.chi_tiet = chi_tiet;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}