package com.hfad.restaurante;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


public class CategoryDetailActivity extends AppCompatActivity {

    public static final String EXTRA_CATEGORY_ID = "categoryId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);

        //Set the toolbar as the activity's app bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Display details of the category
        int categoryId = (Integer)getIntent().getExtras().get(EXTRA_CATEGORY_ID);
        String categoryName = Category.categories[categoryId].getName();
        TextView textView = (TextView)findViewById(R.id.category_text);
        textView.setText(categoryName);
        int categoryImage = Category.categories[categoryId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.category_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, categoryImage));
        imageView.setContentDescription(categoryName);
    }
}

