package com.example.mohammed.starbuzzapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by user on 29/10/2015.
 */
public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ListView listDrinks = getListView();
        ArrayAdapter<Dr> listAdapter = new ArrayAdapter<Dr>(
                this,
                android.R.layout.simple_list_item_1,
                Dr.dr);
        listDrinks.setAdapter(listAdapter);
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent =new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }
}
