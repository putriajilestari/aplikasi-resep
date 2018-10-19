package com.example.user.resepmasakan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AdapterMasakan extends AppCompatActivity {

    Context context;

    public AdapterMasakan (Context c) {context = c;}

    public int [] masakan = {
            R.drawable.bibimbap, R.drawable.bulgogi, R.drawable.kimbap,
            R.drawable.ramyeon, R.drawable.tteokbokki, R.drawable.kimchi
    };

    @Override
    public  int getCount ()
    {
        return masakan.length;
    }

    @Override
    public Object getItem (int position)
    {
        return masakan(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView im = new ImageView(context);
    }



}
