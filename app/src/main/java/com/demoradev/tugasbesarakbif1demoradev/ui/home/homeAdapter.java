/*
 * Nama : Argya Aulia Fauzandika
 * NIM  : 10119035
 * Kelas : IF1
 * */

package com.demoradev.tugasbesarakbif1demoradev.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.demoradev.tugasbesarakbif1demoradev.R;
import com.demoradev.tugasbesarakbif1demoradev.models.toursModel;
import com.demoradev.tugasbesarakbif1demoradev.ui.map.MapsActivity;

import java.util.List;

public class homeAdapter extends RecyclerView.Adapter<homeAdapter.homeViewHolder> {
    private Context context;
    private Activity activity;
    private List<toursModel> tourList;

    public homeAdapter(Activity activity, List<toursModel> tourList) {
        this.activity = activity;
        this.tourList = tourList;
    }

    @NonNull
    @Override
    public homeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = inflater.inflate(R.layout.tour_card, parent, false);
        context = parent.getContext();
        return new homeAdapter.homeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeViewHolder holder, int position) {
        final toursModel data = tourList.get(position);
        holder.title.setText(String.valueOf(data.name));
        holder.district.setText(String.valueOf(data.district));
        Glide.with(context)
                .load(data.image)
                .into(holder.image);

        holder.tourCard.setOnClickListener(view -> {
            Intent intent = new Intent(activity, MapsActivity.class);
            intent.putExtra("title", String.valueOf(data.name));
            intent.putExtra("lat", String.valueOf(data.lat));
            intent.putExtra("long", String.valueOf(data.lng));
            activity.startActivityForResult(intent, 1);
        });
    }

    @Override
    public int getItemCount() {
        return tourList.size();
    }

    class homeViewHolder extends RecyclerView.ViewHolder{

    TextView title, district;
    ImageView image;
    CardView tourCard;

    public homeViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.tour_title);
        image = itemView.findViewById(R.id.tour_image);
        district = itemView.findViewById(R.id.tour_district);
        tourCard = itemView.findViewById(R.id.tour_card);
    }
}
}
