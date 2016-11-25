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

import model.NewsEntity;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class NewsAdapter extends BaseAdapter {
    private Context context;
    private List<NewsEntity> lsNewsEntities;

    public NewsAdapter(Context context, List<NewsEntity> originalData) {
        this.context = context;
        //this.originalData = originalData;
        this.lsNewsEntities = originalData;
    }

    @Override
    public int getCount() {
        return lsNewsEntities.size();
    }

    @Override
    public Object getItem(int i) {
        return lsNewsEntities.get(i);
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
            v = inflater.inflate(R.layout.row_new, null);
            ViewHolder holder = new ViewHolder();
            holder.tviTitle = (TextView)v.findViewById(R.id.tviTitle);
            holder.tviNotice = (TextView)v.findViewById(R.id.tviNotice);
            holder.iviLogo = (ImageView) v.findViewById(R.id.iviImage);
            v.setTag(holder);
        }
        NewsEntity entry = lsNewsEntities.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            holder.tviTitle.setText(entry.getTitle());
            holder.tviNotice.setText(entry.getNotice());
            holder.iviLogo.setImageResource(entry.getImage());
        }

        return v;
    }

    static class ViewHolder
    {
        ImageView iviLogo;
        TextView tviTitle;
        TextView tviNotice;
    }
}
