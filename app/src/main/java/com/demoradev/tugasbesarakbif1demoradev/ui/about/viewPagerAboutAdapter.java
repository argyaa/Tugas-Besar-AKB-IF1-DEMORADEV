//NIM   : 10119013
//NAMA  : FIONA AVILA PUTRI
//KELAS : IF-1

package com.demoradev.tugasbesarakbif1demoradev.ui.about;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demoradev.tugasbesarakbif1demoradev.R;
import com.demoradev.tugasbesarakbif1demoradev.models.aboutItemModel;

import java.util.List;

public class viewPagerAboutAdapter extends RecyclerView.Adapter<viewPagerAboutAdapter.ViewHolder>{
    List<aboutItemModel> aboutList;

    public viewPagerAboutAdapter(List<aboutItemModel> aboutList) {
        this.aboutList = aboutList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewpager_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        aboutItemModel aboutItem = aboutList.get(position);
        holder.title.setText(aboutItem.title);
        holder.desc.setText(aboutItem.desc);
    }

    @Override
    public int getItemCount() {
        if(aboutList != null) return aboutList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title, desc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_about);
            title = itemView.findViewById(R.id.title_about);
            desc = itemView.findViewById(R.id.desc_about);
        }
    }
}
