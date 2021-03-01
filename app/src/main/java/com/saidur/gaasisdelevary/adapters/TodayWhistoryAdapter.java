package com.saidur.gaasisdelevary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saidur.gaasisdelevary.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayWhistoryAdapter extends RecyclerView.Adapter<TodayWhistoryAdapter.TodayWhistoryVH>  {
   Context context;
    @NonNull
    @Override
    public TodayWhistoryVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.rec_item_todaywork_history,parent,false);
        TodayWhistoryVH vh=new TodayWhistoryVH(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodayWhistoryVH holder, int position) {

      //  holder.todayHtime.setText(parseDateandTime(class.getCreated(), "hh:mm a"));
      //  holder.created.setText(parseDateandTime(class.getCreated(), "dd MMM yyyy"));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TodayWhistoryVH extends RecyclerView.ViewHolder {
        private TextView todayHupozila,todayHstore,todayHtime;
         public TodayWhistoryVH(@NonNull View v) {
            super(v);
             todayHupozila=v.findViewById(R.id.rec_history_upozilaId);
             todayHstore=v.findViewById(R.id.rec_history_storenameId);
             todayHtime=v.findViewById(R.id.rec_history_timeId);
        }
    }
    //for time and date formatting
    public String parseDateandTime(String time, String outputPattern) {
        String inputPattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

        Date date = null;
        String str = null;

        try {
            date = inputFormat.parse(time);
            str = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }
}
