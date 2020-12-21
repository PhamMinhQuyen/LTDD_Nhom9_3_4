package com.example.appdatthucan;

public class product_khuyenmai {
    int image;
    String title,chi_tiet,time;

    public product_khuyenmai(int image, String title, String chi_tiet, String time) {

        this.image = image;
        this.title = title;
        this.chi_tiet = chi_tiet;
        this.time = time;
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
