/*
 *   NIM : 10119035
 *   NAMA : ARGYA AULIA FAUZANDIKA
 *   KELAS : IF-1
 *   Tanggal Pengerjaan : 30 Juli 2022
 * */

package com.demoradev.tugasbesarakbif1demoradev.ui.profile_tim;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demoradev.tugasbesarakbif1demoradev.R;
import com.demoradev.tugasbesarakbif1demoradev.models.teamModel;

import java.util.ArrayList;
import java.util.List;

public class profileTimFragment extends Fragment {
    RecyclerView recyclerView;
    profileTimAdapter adapter;
    List<teamModel> teamList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_tim, container, false);
        recyclerView = view.findViewById(R.id.profile_tim_recyclerView);

        teamList = new ArrayList<>();

        int[] image = {R.drawable.ivan_akb, R.drawable.fiona_akb, R.drawable.tommy_akb, R.drawable.argya_akb, R.drawable.pandya_akb};
        String[] nama = {"Ivan Faathirza", "Fiona Avila Putri", "Muhammad Khatami", "Argya Aulia Fauzandika", "Alfyandi Pandya"};
        String[] nim = {"10119003", "10119013", "10119026", "10119035", "10119007"};

        for (int i=0; i< image.length; i++){
            teamModel item = new teamModel(image[i], nama[i], nim[i]);
            teamList.add(item);
        }

        adapter = new profileTimAdapter(getActivity(), teamList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}