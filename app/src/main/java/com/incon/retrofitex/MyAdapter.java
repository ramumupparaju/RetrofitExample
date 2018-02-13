package com.incon.retrofitex;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by PC on 2/12/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>  {

    List<Hero> heroLists;
    private Context context;

    public MyAdapter(List<Hero> heroLists, Context context) {

        this.heroLists = heroLists;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Hero hero=heroLists.get(position);
        holder.t1.setText(hero.getName());
        holder.t2.setText(hero.getRealname());
        Picasso.with(context).load(hero.getImageurl()).into(holder.imageView);


       // ApiClient.loadImageFromApi(holder.imageView.setImageResource(hero.getImageurl()));

    }

    @Override
    public int getItemCount() {
        return heroLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView t1,t2;
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.text1);
            t2=(TextView)itemView.findViewById(R.id.text2);
            imageView=(ImageView)itemView.findViewById(R.id.image);
        }
    }
}
