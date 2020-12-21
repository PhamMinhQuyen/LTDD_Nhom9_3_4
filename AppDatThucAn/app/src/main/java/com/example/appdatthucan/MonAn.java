package com.example.appdatthucan;

public class MonAn {
    public String name;
    public String address;
    public String km;
    public float start;
    public String image;
    public String phone;
    public String poster;
    MonAn(){

    }

    public MonAn(String name, String address, String km, float start, String image, String phone, String poster) {
        this.name = name;
        this.address = address;
        this.km = km;
        this.start = start;
        this.image = image;
        this.phone = phone;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

}
