package com.malviya.demoprogressbar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.malviya.demoprogressbar.DashBoard;
import com.malviya.demoprogressbar.R;
import com.malviya.demoprogressbar.model.DashBoardDataModel;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by 23508 on 10/14/2016.
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<DashBoardDataModel> mlist;

    public CustomRecyclerViewAdapter(Context pContext, List<DashBoardDataModel> list) {
        mContext = pContext;
        mlist = list;
    }

    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.dashboard_row , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
      //  holder.title.setText(mlist.get(position).getTitle());
    }




    @Override
    public int getItemCount() {
        return 0;
    }

    private class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.textview_title);
        }
    }
}
