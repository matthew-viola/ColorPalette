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

        if (pos == 0){
            textview.setBackgroundColor(Color.LTGRAY);
        }
        else if (pos == 1){
            textview.setBackgroundColor(Color.BLUE);
        }
        else if (pos == 2){
            textview.setBackgroundColor(Color.YELLOW);
        }
        else if (pos == 3){
            textview.setBackgroundColor(Color.MAGENTA);
        }
        else if (pos == 4){
            textview.setBackgroundColor(Color.GREEN);
        }
        else if (pos == 5){
            textview.setBackgroundColor(Color.CYAN);
        }
        else if (pos == 7){
            textview.setBackgroundColor(Color.RED);
        }
        else if (pos == 8){
            textview.setBackgroundColor(Color.WHITE);
        }
        else if (pos == 9){
            textview.setBackgroundColor(Color.DKGRAY);
        }
        return textview;


    }
}
