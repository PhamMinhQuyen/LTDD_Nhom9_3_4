package com.example.appdatthucan;

public class detailShop_Model {
    public String namefood;
    public String imagefood;
    public String pricefood;
    public String likefood;

    detailShop_Model(){

    }

    public detailShop_Model(String namefood, String imagefood, String pricefood, String likefood) {
        this.namefood = namefood;
        this.imagefood = imagefood;
        this.pricefood = pricefood;
        this.likefood = likefood;
    }

    public String getnamefood() {
        return namefood;
    }

    public void setnamefood(String namefood) {
        this.namefood = namefood;
    }

    public String getimagefood() {
        return imagefood;
    }

    public void setimagefood(String imagefood) {
        this.imagefood = imagefood;
    }

    public String getpricefood() {
        return pricefood;
    }

    public void setpricefood(String pricefood) {
        this.pricefood = pricefood;
    }

    public String getlikefood() {
        return likefood;
    }

    public void setlikefood(String likefood) {
        this.likefood = likefood;
    }
}
