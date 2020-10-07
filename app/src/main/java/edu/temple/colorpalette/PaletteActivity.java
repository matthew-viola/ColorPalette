package edu.temple.colorpalette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {
    ArrayList<String> colors;
    GridView gv;
    public static final String c = "test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this, CanvasActivity.class);
        colors = new ArrayList<>();
        colors.add("lightgray");
        colors.add("blue");
        colors.add("yellow");
        colors.add("magenta");
        colors.add("green");
        colors.add("cyan");
        colors.add("gray");
        colors.add("red");
        colors.add("white");
        colors.add("darkgray");

        gv = findViewById(R.id.palette);

        final BaseAdapter color = new PaletteAdaptor(this, colors);
        gv.setAdapter(color);

       gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               intent.putExtra(c, colors.get(position));
               startActivity(intent);
           }
       });
    }
}
