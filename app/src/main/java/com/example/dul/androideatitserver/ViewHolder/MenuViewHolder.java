package com.example.dul.androideatitserver.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dul.androideatitserver.Common.Common;
import com.example.dul.androideatitserver.Interface.ItemClickListner;
import com.example.dul.androideatitserver.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener

{

    public TextView txtMenuName;
    public ImageView imageView;

   private ItemClickListner itemClickListner;


    public MenuViewHolder(View itemView) {

        super(itemView);

        txtMenuName = (TextView) itemView.findViewById(R.id.menu_name);
        imageView = (ImageView) itemView.findViewById(R.id.menu_image);

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
