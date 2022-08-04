/*
* Nama : Argya Aulia Fauzandika
* NIM  : 10119035
* Kelas : IF1
* */

package com.demoradev.tugasbesarakbif1demoradev.models;

public class toursModel {
    public int id;
    public String district;
    public String imageUrl;
    public String lat;
    public String lng;
    public String name;

    public toursModel(int id, String district, String imageUrl, String lat, String lng, String name) {
        this.id = id;
        this.district = district;
        this.imageUrl = imageUrl;
        this.lat = lat;
        this.lng = lng;
        this.name = name;
    }
}
