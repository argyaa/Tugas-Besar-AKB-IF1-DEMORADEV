/*
 * Nama : Argya Aulia Fauzandika
 * NIM  : 10119035
 * Kelas : IF1
 * */

package com.demoradev.tugasbesarakbif1demoradev.services;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class tourServices {
    DatabaseReference ref;

    public tourServices(){
        ref = FirebaseDatabase.getInstance().getReference();
    }

    public Query get() { return  ref.child("Tours");}
}
