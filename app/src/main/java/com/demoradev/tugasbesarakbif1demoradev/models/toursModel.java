/*
* Nama : Argya Aulia Fauzandika
* NIM  : 10119035
* Kelas : IF1
* Tanggal Pengerjaan : 30 Juli 2022
* */

package com.demoradev.tugasbesarakbif1demoradev.models;

public class toursModel {
    public int id;
    public String district;
    public String image;
    public String lat;
    public String lng;
    public String name;
    public String created_at;
    public String updated_at;
    public String place_id;

    public toursModel(){}

    public toursModel(int id, String district, String image, String lat, String lng, String name, String created_at, String updated_at, String place_id) {
        this.id = id;
        this.district = district;
        this.image = image;
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.place_id = place_id;
    }
}
