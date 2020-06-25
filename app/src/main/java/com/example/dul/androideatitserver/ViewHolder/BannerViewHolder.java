package com.example.dul.androideatitserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dul.androideatitserver.Common.Common;
import com.example.dul.androideatitserver.Interface.ItemClickListner;
import com.example.dul.androideatitserver.R;

public class BannerViewHolder extends RecyclerView.ViewHolder implements

        View.OnCreateContextMenuListener

{

    public TextView banner_name;
    public ImageView banner_image;




    public BannerViewHolder(View itemView) {

        super(itemView);

        banner_name = (TextView) itemView.findViewById(R.id.banner_name);
        banner_image = (ImageView) itemView.findViewById(R.id.banner_image);

        itemView.setOnCreateContextMenuListener(this);


    }




    @Override
    public void onCreateContextMenu(ContextMenu Contextmenu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        Contextmenu.setHeaderTitle("Select the action");

        Contextmenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        Contextmenu.add(0,1,getAdapterPosition(), Common.DELETE);

    }
}
