package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class MenuDetailActivity extends AppCompatActivity {
    TextView itemHeading;
    TextView itemCost;
    ImageView itemImage;
    TextView itemDescription;
    Button add;
    Double cost;
    ElegantNumberButton itemQuantity;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detail);

        Intent intent = getIntent();

        int menuID = intent.getIntExtra("menuID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        final Menu menu = FakeDatabase.getMenuItemById((menuID));


        itemHeading = findViewById(R.id.itemHeading);
        itemCost = findViewById(R.id.itemCost);
        itemDescription = findViewById(R.id.itemDescription);
        itemQuantity = findViewById(R.id.itemQuantity);
        itemQuantity.setNumber("1");
        itemImage = findViewById(R.id.itemImage);

        itemHeading.setText(menu.getMenuHeading());
        cost = menu.getMenuCost();
        String costAsString = String.valueOf(cost);
        itemCost.setText("$" + costAsString);
        itemDescription.setText(menu.getMenuDescription());
        itemImage.setImageResource(menu.getMenuImage());

        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int quantity = Integer.parseInt(itemQuantity.getNumber());
                final String stringName = itemHeading.getText().toString();
                Order.myOrder.add(new Order(stringName , cost, quantity, menu.getMenuImage()));
                returnToMenu();
                Toast.makeText(MenuDetailActivity.this,"Item has been added to your order",Toast.LENGTH_SHORT).show();
            }
    });
}
    public void returnToMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
}
}
