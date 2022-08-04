/*
* Nama : Muhammad Khatami
* NIM : 10119026
* Kelas : IF-1
* Tanggal Pengerjaan : 30 Juli 2022
* */

package com.demoradev.tugasbesarakbif1demoradev.ui.profile_tim;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demoradev.tugasbesarakbif1demoradev.R;
import com.demoradev.tugasbesarakbif1demoradev.models.teamModel;

import java.util.ArrayList;
import java.util.List;

public class profileTimAdapter extends RecyclerView.Adapter<profileTimAdapter.profileTimViewHolder> {

    private Activity activity;
    private List<teamModel> teamList = new ArrayList<>();

    public profileTimAdapter(Activity activity, List<teamModel> teamList) {
        this.activity = activity;
        this.teamList = teamList;
    }

    @NonNull
    @Override
    public profileTimViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = inflater.inflate(R.layout.team_item, parent, false);
        return new profileTimViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull profileTimViewHolder holder, int position) {
        holder.nama.setText(String.valueOf(teamList.get(position).nama));
        holder.nim.setText(String.valueOf(teamList.get(position).nim));
        holder.image.setImageResource(teamList.get(position).image);
    }

    @Override
    public int getItemCount() {
        if (teamList != null) return teamList.size();
        return 0;
    }

    class profileTimViewHolder extends RecyclerView.ViewHolder{

        TextView nama,nim;
        ImageView image;
        LinearLayout teamItem;

        public profileTimViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.team_name);
            nim = itemView.findViewById(R.id.team_nim);
            image = itemView.findViewById(R.id.team_image);
            teamItem = itemView.findViewById(R.id.team_item);
        }
    }
}
