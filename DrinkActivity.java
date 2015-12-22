package com.example.mohammed.starbuzzapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.bsubba.starbuzzapp.R.*;

/**
 * Created by user on 29/10/2015.
 */
public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_drink);

        //get drink from the intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        //use the drinkNo to details of the drink the use choose
        Dr drink =Dr.dr[drinkNo];

        //populate the drink image
        ImageView photo = (ImageView) findViewById(id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
        //populate the drink name
        TextView name = (TextView) findViewById(id.name);
        name.setText(drink.getName());
        //populate the drink description
        TextView description = (TextView) findViewById(id.description);
        description.setText(drink.getDescription());
    }
}
