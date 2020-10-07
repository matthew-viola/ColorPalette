package edu.temple.colorpalette;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PaletteAdaptor extends BaseAdapter {

    Context context;
    ArrayList<String> colors;

    public PaletteAdaptor(Context context, ArrayList<String> colors){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount(){
        return colors.size();
    }

    @Override
    public Object getItem(int i){
        return colors.get(i);
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup p){

        TextView textview = new TextView(context);
        textview.setText(colors.get(pos));
        textview.setBackgroundColor(Color.parseColor(colors.get(pos)));
        return textview;


    }
}
