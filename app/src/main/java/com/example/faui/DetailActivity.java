package com.example.faui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.faui.databinding.ActivityDetailBinding;

@SuppressWarnings("ALL")
public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding detail;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       detail = ActivityDetailBinding.inflate(getLayoutInflater());
        View view1 = detail.getRoot();
        setContentView(view1);

        this.configureToolbar();

    }


    private void configureToolbar(){
        //Get the toolbar (Serialise)
         toolbar =  findViewById(R.id.toolbar);
        //Set the toolbar
        setSupportActionBar(toolbar);
        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }


}