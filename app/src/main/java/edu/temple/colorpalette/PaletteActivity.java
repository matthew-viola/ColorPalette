package edu.temple.colorpalette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
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
        Resources res = this.getResources();
        setTitle(res.getString(R.string.pa));

        colors = new ArrayList<>();
        colors.add(res.getString(R.string.lightgray));
        colors.add(res.getString(R.string.blue));
        colors.add(res.getString(R.string.yellow));
        colors.add(res.getString(R.string.magenta));
        colors.add(res.getString(R.string.green));
        colors.add(res.getString(R.string.cyan));
        colors.add(res.getString(R.string.gray));
        colors.add(res.getString(R.string.red));
        colors.add(res.getString(R.string.white));
        colors.add(res.getString(R.string.darkgray));

        gv = findViewById(R.id.palette);

        final BaseAdapter color = new PaletteAdaptor(this, colors);
        gv.setAdapter(color);

       gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int str = 0;
                intent.putExtra("pos", position);
               intent.putExtra(c, colors.get(position));

               startActivity(intent);
           }
       });
    }
}
