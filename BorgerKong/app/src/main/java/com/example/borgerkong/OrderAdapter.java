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

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderItemViewHolder>  {

    private ArrayList<Order> orderItemstoAdapt;

    public void setOrderData(ArrayList<Order> orderItemstoAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.orderItemstoAdapt = Order.myOrder;
    }

    @NonNull
    @Override
    public OrderAdapter.OrderItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item, parent, false);
        OrderAdapter.OrderItemViewHolder holder = new OrderAdapter.OrderItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderItemViewHolder holder, int position) {

        final Order orderItemAtPosition = orderItemstoAdapt.get(position);

        holder.orderHeading.setText(orderItemAtPosition.getItemName());
        Double totalCost = orderItemAtPosition.getPrice() * orderItemAtPosition.getQuantity();
        String costAsString = String.valueOf(totalCost);
        holder.orderCost.setText("$" + costAsString);
        holder.orderImage.setImageResource(orderItemAtPosition.getImage());
        int quantity = orderItemAtPosition.getQuantity();
        String quantityAsString = String.valueOf(quantity);
        holder.orderQuantity.setText("qty: x" + quantityAsString);
    }

    @Override
    public int getItemCount() {
        return orderItemstoAdapt.size();
    }

    public static class OrderItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView orderHeading;
        public TextView orderCost;
        public ImageView orderImage;
        public TextView orderQuantity;

    public OrderItemViewHolder(View v) {
            super(v);
            view = v;
            orderHeading = v.findViewById(R.id.orderHeading);
            orderCost = v.findViewById(R.id.orderCost);
            orderImage = v.findViewById(R.id.orderImage);
            orderQuantity = v.findViewById(R.id.orderQuantity);
        }
    }
}


