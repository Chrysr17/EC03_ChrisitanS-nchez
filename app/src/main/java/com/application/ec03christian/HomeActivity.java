package com.application.ec03christian;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import com.application.ec03christian.Adaptador.ImageGalleryAdapter;

public class HomeActivity extends AppCompatActivity {
    GridView gridViewImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_EC03Christian);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        gridViewImages = findViewById(R.id.grid_view_images);
        gridViewImages.setAdapter(new ImageGalleryAdapter(this));
    }
}