package com.example.dul.androideatitserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dul.androideatitserver.Common.Common;
import com.example.dul.androideatitserver.Interface.ItemClickListner;
import com.example.dul.androideatitserver.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener

{

    public TextView food_name;
    public ImageView food_image;

    private ItemClickListner itemClickListner;


    public FoodViewHolder(View itemView) {

        super(itemView);

        food_name = (TextView) itemView.findViewById(R.id.food_name);
        food_image = (ImageView) itemView.findViewById(R.id.food_image);

        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);

    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }

    @Override
    public void onClick(View view) {

        itemClickListner.onClick(view,getAdapterPosition(),false);

    }

    @Override
    public void onCreateContextMenu(ContextMenu Contextmenu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        Contextmenu.setHeaderTitle("Select the action");

        Contextmenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        Contextmenu.add(0,1,getAdapterPosition(), Common.DELETE);

    }
}
