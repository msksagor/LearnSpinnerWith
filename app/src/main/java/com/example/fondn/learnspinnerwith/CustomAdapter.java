package com.example.fondn.learnspinnerwith;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] country;
    String[] decrip;
    int[] flags;

    public CustomAdapter(Context context, String[] country, String[] decrip, int[] flags) {
        this.context = context;
        this.country = country;
        this.decrip = decrip;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.customlayout,null);
            TextView name,decc;
            ImageView imageView;

            name = convertView.findViewById(R.id.nametextID);
            decc = convertView.findViewById(R.id.desNameID);
            imageView = convertView.findViewById(R.id.imageID);

            name.setText(country[position]);
            decc.setText(decrip[position]);
            imageView.setImageResource(flags[position]);

        }
        return convertView;

    }
}
