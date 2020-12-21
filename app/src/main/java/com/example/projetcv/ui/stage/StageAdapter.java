package com.example.projetcv.ui.stage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.projetcv.R;
import java.util.List;

public class StageAdapter extends RecyclerView.Adapter<StageAdapter.StageViewHolder>  {




    List<StageItem> mDataFiltered ;
    boolean isDark = false;
private ViewGroup viewGro;

    public StageAdapter( List<StageItem> mDataFiltered, boolean isDark) {

        this.mDataFiltered = mDataFiltered;
        this.isDark = isDark;

    }



    @Override
    public StageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGro=viewGroup;
        View layout;
        layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_news,viewGroup,false);
        return new StageViewHolder(layout);
    }

    @Override
    public void onBindViewHolder( StageViewHolder StageViewHolder, int position) {


        StageViewHolder.img_user.setAnimation(AnimationUtils.loadAnimation(viewGro.getContext(),R.anim.fade_transition_animation));
        StageViewHolder.container.setAnimation(AnimationUtils.loadAnimation(viewGro.getContext(),R.anim.fade_scale_animation));
        StageViewHolder.tv_title.setText(mDataFiltered.get(position).getSte());
        StageViewHolder.tv_content.setText(mDataFiltered.get(position).getContent());
        StageViewHolder.tv_date.setText(mDataFiltered.get(position).getDate());
        StageViewHolder.img_user.setImageResource(mDataFiltered.get(position).getUserPhoto());

    }

    @Override
    public int getItemCount() {
        return mDataFiltered.size();
    }



    public class StageViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title,tv_content,tv_date;
        ImageView img_user;
        RelativeLayout container;


        public StageViewHolder( View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.container);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_content = itemView.findViewById(R.id.tv_description);
            tv_date = itemView.findViewById(R.id.tv_date);
            img_user = itemView.findViewById(R.id.img_user);
            if (isDark) {
                setDarkTheme();
            }
        }
        private void setDarkTheme() {

            container.setBackgroundResource(R.drawable.card_bg_dark);

        }
    }
}
