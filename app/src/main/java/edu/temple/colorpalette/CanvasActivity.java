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
        int i = intent.getIntExtra("pos", 0);
        if (i == 0){
            v.setBackgroundColor(Color.LTGRAY);
        }
        else if (i == 1){
            v.setBackgroundColor(Color.BLUE);
        }
        else if (i == 2){
            v.setBackgroundColor(Color.YELLOW);
        }
        else if (i == 3){
            v.setBackgroundColor(Color.MAGENTA);
        }
        else if (i == 4){
            v.setBackgroundColor(Color.GREEN);
        }
        else if (i == 5){
            v.setBackgroundColor(Color.CYAN);
        }
        else if (i == 7){
            v.setBackgroundColor(Color.RED);
        }
        else if (i == 8){
            v.setBackgroundColor(Color.WHITE);
        }
        else if (i == 9){
            v.setBackgroundColor(Color.DKGRAY);
        }
    }
}
