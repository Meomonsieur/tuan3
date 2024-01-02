package com.example.fapplication.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class T32Adaprer<ViewAX> extends BaseAdapter {
    private ArrayList<T32Contact> ls;
    private Context context;

    public T32Adaprer(ArrayList<T32Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    // lay ve so luong item
    @Override
    public int getCount() {
        return ls.size();
    }
    //lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    // lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    // tao view
    // gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1 tao view
        ViewAx vax;
        //Neu chua co view tao view moi
        if (convertView == null) {
            vax = new ViewAx();
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item, null);
            // anh xa tung thanh phan trong layout
            vax.img_hinh = convertView.findViewById(R.id.t32ItemHinh);
            vax.tv_ten = convertView.findViewById(R.id.t32ItemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.t32ItemTuoi);
            //tao template de lan sau su dung
            convertView.setTag(vax);
        }
        //Neu da co view -> su dung lai view cu
        else {
            vax=(ViewAx) convertView.getTag();//lay view cu
        }
        //gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());

        return convertView;// tra ve ket qua
    }
    // dinh nghia view
    class ViewAx{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;

    }
}
