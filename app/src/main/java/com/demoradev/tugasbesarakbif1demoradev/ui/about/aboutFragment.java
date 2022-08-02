//NIM   : 10119013
//NAMA  : FIONA AVILA PUTRI
//KELAS : IF-1

package com.demoradev.tugasbesarakbif1demoradev.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.demoradev.tugasbesarakbif1demoradev.R;
import com.demoradev.tugasbesarakbif1demoradev.models.aboutItemModel;

import java.util.ArrayList;
import java.util.List;

public class aboutFragment extends Fragment {
    ViewPager2 viewPager2;
    List<aboutItemModel> aboutList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        viewPager2 = view.findViewById(R.id.viewpager);
        aboutList = new ArrayList<>();

        int[] image = {R.drawable.version, R.drawable.info, R.drawable.group};
        String[] judul = {"Version", "About", "Made by"};
        String[] desc = {"1.0.0", "Tugas ini dibuat untuk memenuhi tugas besar mata kuliah Aplikasi Komputer Bergerak. Aplikasi ini akan menampilkan profil tempat wisata yang berada di area Bandung Raya beserta dengan lokasi tempat wisata pada peta.", "10119001-Ivan\n10119013-Fiona\n10119016-Khatami\n10119035-Argya\n10119007-Alfiyandi"};

        for (int i=0; i < image.length; i++){
            aboutItemModel item = new aboutItemModel(image[i], judul[i], desc[i]);
            aboutList.add(item);
        }

        viewPagerAboutAdapter adapter = new viewPagerAboutAdapter(aboutList);

        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}