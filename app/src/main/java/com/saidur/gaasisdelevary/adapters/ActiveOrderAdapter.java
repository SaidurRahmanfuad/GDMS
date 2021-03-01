package com.saidur.gaasisdelevary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saidur.gaasisdelevary.R;

public class ActiveOrderAdapter extends RecyclerView.Adapter<ActiveOrderAdapter.ActiveOrderVH>  {
   Context context;
    @NonNull
    @Override
    public ActiveOrderVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.rec_activeorder_option,parent,false);

        return new ActiveOrderVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ActiveOrderVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ActiveOrderVH extends RecyclerView.ViewHolder {
        private TextView activeOzilla,activeOupozilla,activeOstorenumber,activeOdetails;
        public ActiveOrderVH(@NonNull View v) {
            super(v);
            activeOzilla=v.findViewById(R.id.activeorder_zillaId);
            activeOupozilla=v.findViewById(R.id.activeorder_upozillaId);
            activeOstorenumber=v.findViewById(R.id.activeorder_shopnumberId);
            activeOdetails=v.findViewById(R.id.activeorder_detailsId);
        }
    }
}
