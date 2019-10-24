package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    private RecyclerView OrderRecyclerView;
    private RecyclerView.LayoutManager OrderLayoutManager;
    double totalAmount = 0.00;
    TextView totalAmountText;
    ArrayList<Order> displayList = Order.myOrder;
    Button confirmOrder;

    public void returnToMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);}


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        OrderRecyclerView = findViewById(R.id.orderRecycler);
        OrderLayoutManager = new LinearLayoutManager(this);
        OrderRecyclerView.setLayoutManager(OrderLayoutManager);
        OrderAdapter orderAdapter = new OrderAdapter();

        orderAdapter.setOrderData(FakeDatabase.getAllOrderItems());
        OrderRecyclerView.setAdapter(orderAdapter);

        for(int i=0; i<displayList.size(); i++){
            double amountSoFar = displayList.get(i).getPrice() * displayList.get(i).getQuantity();
            totalAmount = totalAmount + amountSoFar;
        }

        totalAmountText = findViewById(R.id.totalAmt);
        DecimalFormat decFormat = new DecimalFormat("##.00");
        totalAmountText.setText("Total Amount: $" + decFormat.format(totalAmount));

        confirmOrder = findViewById(R.id.confirmOrder);
        confirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Order.myOrder.clear();
                returnToMenu();
                Toast.makeText(OrderActivity.this,"Your order has been confirmed",Toast.LENGTH_SHORT).show();


            }
        });
    }

}



