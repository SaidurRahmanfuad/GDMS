package com.saidur.gaasisdelevary.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saidur.gaasisdelevary.R;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


public class AllDelarAdapter extends RecyclerView.Adapter<AllDelarAdapter.AlldelarVH> {
    Context context;
    @NonNull
    @Override
    public AlldelarVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.rec_alldelar,parent,false);
        return new AlldelarVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlldelarVH holder, int position) {

        holder.allDcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setFlags(FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_USER_ACTION);
                callIntent.setData(Uri.parse("tel://" + Class.getMobile()));
                context.startActivity(callIntent);

            }
        });
        holder.allDmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Manual choosing Map Location
                //String  url = "https://www.google.com/maps/dir/?api=1&destination=" + bRequest.getLatitude()+"("+ bRequest.getFullName() + ")&iwloc=A&hl=es";
                String url = "https://www.google.com/maps/dir/?api=1&destination=" + Class.getLatitude() + "," + bRequest.getLongitude() + "&travelmode=driving";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AlldelarVH extends RecyclerView.ViewHolder {
        private TextView allDcLocation,allDname,allDstore;
        private CircleImageView allDimg;
        Button allDcall,allDmap;
        public AlldelarVH(@NonNull View v) {
            super(v);
            allDcLocation=v.findViewById(R.id.alldelarCurlocationId);
            allDname=v.findViewById(R.id.alldelarNameId);
            allDstore=v.findViewById(R.id.alldelarStoreId);
            allDimg=v.findViewById(R.id.alldelarImgId);
            allDcall=v.findViewById(R.id.alldelarCallId);
            allDmap=v.findViewById(R.id.alldelarMapId);
        }
    }
}
