package com.example.adriancardenasjimene.testretrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.SmallItemViewHolder> {
    private List<Hero> heroList;
    private Context context;

    public RecyclerAdapter(List<Hero> heroList, Context context) {
        this.heroList = heroList;
        this.context = context;
    }

    @NonNull
    @Override
    public SmallItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.small_item, parent, false);
        return new SmallItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SmallItemViewHolder holder, int position) {
        holder.nameHero.setText(heroList.get(position).getName());
        Glide.with(context)
                .load(heroList.get(position).getImageUrl())
                .into(holder.photoHero);
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class SmallItemViewHolder extends RecyclerView.ViewHolder {
        ImageView photoHero;
        TextView nameHero;
        public SmallItemViewHolder(View itemView) {
            super(itemView);

            photoHero = itemView.findViewById(R.id.photo_hero);
            nameHero = itemView.findViewById(R.id.name_hero);
        }
    }
}
