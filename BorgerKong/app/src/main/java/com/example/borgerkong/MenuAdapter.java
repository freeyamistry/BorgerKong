package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuItemViewHolder> {

    private ArrayList<Menu> menuItemstoAdapt;

    public void setMenuData(ArrayList<Menu> menuItemstoAdapt) {
        this.menuItemstoAdapt = menuItemstoAdapt;
    }

    @NonNull
    @Override
    public MenuAdapter.MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu, parent, false);
        MenuItemViewHolder holder = new MenuItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuItemViewHolder holder, int position) {

        final Menu menuItemAtPosition = menuItemstoAdapt.get(position);

        holder.menuHeading.setText(menuItemAtPosition.getMenuHeading());
        Double cost = menuItemAtPosition.getMenuCost();
        String costAsString = String.valueOf(cost);
        holder.menuCost.setText("$" + costAsString);
        holder.menuImage.setImageResource(menuItemAtPosition.getMenuImage());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, MenuDetailActivity.class);
                intent.putExtra("menuID", menuItemAtPosition.getMenuID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuItemstoAdapt.size();
    }

    public static class MenuItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView menuHeading;
        public TextView menuCost;
        public ImageView menuImage;

        public MenuItemViewHolder(View v) {
            super(v);
            view = v;
            menuHeading = v.findViewById(R.id.menuHeading);
            menuCost = v.findViewById(R.id.menuCost);
            menuImage = v.findViewById(R.id.menuImage);
        }
    }
}

