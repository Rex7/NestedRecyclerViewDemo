package com.example.regischarles.nestedrecyclerviewdemo;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.Viewholders> {
    Context ctx;
    ArrayList<ChildModel>childModels;
    public ChildAdapter(ArrayList<ChildModel> childModels,Context ctx){
        this.ctx=ctx;
        this.childModels=childModels;
    }


    @NonNull
    @Override
    public Viewholders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_childrow,viewGroup,false);

        return new Viewholders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholders viewholders, int i) {
        viewholders.gameName.setText(childModels.get(i).getName());
        viewholders.data.setText(childModels.get(i).getAppSize());
        Glide.with(ctx).load(childModels.get(i).getIcon()).into(viewholders.imageView);


    }

    @Override
    public int getItemCount() {
        return childModels.size();
    }

    class Viewholders extends RecyclerView.ViewHolder{
        TextView gameName,data;
        ImageView imageView;

        public Viewholders(@NonNull View itemView) {
            super(itemView);
            gameName=itemView.findViewById(R.id.gameName);
            data=itemView.findViewById(R.id.data);
            imageView=itemView.findViewById(R.id.ImageViewVertical);
        }
    }

}
