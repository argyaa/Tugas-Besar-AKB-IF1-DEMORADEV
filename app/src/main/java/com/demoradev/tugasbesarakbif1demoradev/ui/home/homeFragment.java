/*
 * Nama : Argya Aulia Fauzandika
 * NIM  : 10119035
 * Kelas : IF1
 * Tanggal Pengerjaan : 4 Agustus 2022
 * */

package com.demoradev.tugasbesarakbif1demoradev.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demoradev.tugasbesarakbif1demoradev.R;
import com.demoradev.tugasbesarakbif1demoradev.models.toursModel;
import com.demoradev.tugasbesarakbif1demoradev.services.tourServices;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class homeFragment extends Fragment {
    RecyclerView rv;
    tourServices db = new tourServices();
    ArrayList<toursModel> tourList = new ArrayList<>();
    homeAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rv = view.findViewById(R.id.home_recycleView);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        getData();

        return view;
    }

    private void getData(){
        db.get().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot item : snapshot.getChildren()){
                    toursModel tour = item.getValue(toursModel.class);
                    tourList.add(tour);
                }

                System.out.println(tourList.size());

                adapter = new homeAdapter(getActivity(), tourList);
                rv.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}