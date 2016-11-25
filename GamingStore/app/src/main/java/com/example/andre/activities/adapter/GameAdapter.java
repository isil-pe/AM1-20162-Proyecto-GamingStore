package com.example.andre.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andre.activities.R;

import java.util.List;

import model.GameEntity;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class GameAdapter extends BaseAdapter {
    private Context context;
    private List<GameEntity> lsGameEntities;

    public GameAdapter(Context context, List<GameEntity> originalData) {
        this.context = context;
        //this.originalData = originalData;
        this.lsGameEntities = originalData;
    }

    @Override
    public int getCount() {
        return lsGameEntities.size();
    }

    @Override
    public Object getItem(int i) {
        return lsGameEntities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_game, null);
            ViewHolder holder = new ViewHolder();
            holder.tviName = (TextView)v.findViewById(R.id.tviName);
            holder.tviDescription = (TextView)v.findViewById(R.id.tviDescription);
            holder.iviLogo = (ImageView) v.findViewById(R.id.iviLogo);
            v.setTag(holder);
        }
        GameEntity entry = lsGameEntities.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            holder.tviName.setText(entry.getName());
            holder.tviDescription.setText(entry.getDescription());
            holder.iviLogo.setImageResource(entry.getImage());
        }

        return v;
    }

    static class ViewHolder
    {
        ImageView iviLogo;
        TextView tviName;
        TextView tviDescription;
    }
}
