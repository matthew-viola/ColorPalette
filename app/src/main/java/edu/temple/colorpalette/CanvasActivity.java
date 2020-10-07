package edu.temple.colorpalette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();

        TextView tv = findViewById(R.id.txtColor);
        String color = intent.getStringExtra(PaletteActivity.c);
        tv.setText(color);
        View v = tv.getRootView();
        v.setBackgroundColor(Color.parseColor(color));
    }
}
