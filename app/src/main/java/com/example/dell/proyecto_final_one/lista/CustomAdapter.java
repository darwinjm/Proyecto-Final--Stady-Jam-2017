package com.example.dell.proyecto_final_one.lista;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dell.proyecto_final_one.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Contaduria> items;

    public CustomAdapter(Activity activity, ArrayList data) {
        this.context = activity;
        this.items = data;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_lista, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //Carga de las dos tipografias
        Typeface typeface_bold = Typeface.createFromAsset(
                context.getAssets(), "fonts/roboto_black.ttf");
        Typeface typeface_thin = Typeface.createFromAsset(
                context.getAssets(), "fonts/roboto_thin.ttf");

        //Asignacion de las tipografias a las vistas
        viewHolder.itemNombre.setTypeface(typeface_bold);
        viewHolder.itemTipo.setTypeface(typeface_thin);

        //Se recupera un objeto Contaduria en determinada posicion y lo seteamos al Holder para la lista
        Contaduria itemTemp = (Contaduria) getItem(position);
        viewHolder.itemNombre.setText(itemTemp.getNombre());
        viewHolder.itemTipo.setText(itemTemp.getTipo());
        return convertView;
    }

    private class ViewHolder {
        TextView itemNombre;
        TextView itemTipo;


        public ViewHolder(View view) {
            itemNombre = (TextView)view.findViewById(R.id.tvTitulo);
            itemTipo = (TextView) view.findViewById(R.id.tvSubtitulo);
        }
    }

}
