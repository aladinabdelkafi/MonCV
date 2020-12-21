package com.example.projetcv.ui.evenement;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetcv.MainActivity;
import com.example.projetcv.R;
import com.example.projetcv.ui.stage.StageAdapter;
import com.example.projetcv.ui.stage.StageItem;

import java.util.ArrayList;
import java.util.List;

public class EventFragment extends Fragment {

    private EventViewModel eventViewModel;
    private RecyclerView eventRecyclerview;
    private EventAdapter eventAdapter;
    private List<EventItem> mData= new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eventViewModel =
                ViewModelProviders.of(this).get(EventViewModel.class);
        View root = inflater.inflate(R.layout.fragment_event, container, false);

        eventRecyclerview = root.findViewById(R.id.event_rv);
        mData.add(new EventItem("meilleur Site industrie 4.0","IIT    deuxième  place","2019"));
        mData.add(new EventItem("Nasa space app challenge","technopole sfax     première place","2019"));
        mData.add(new EventItem("Nasa space app challenge","technopole sfax     cinquième place ","2018"));
        mData.add(new EventItem("Tunisian Collegiate         Programming Contest","ipsas ","2019"));
        mData.add(new EventItem("StartUp connect"," JCI gremda sfax"," 26 27 28/10/2018 "));
        mData.add(new EventItem("Hacking Health                                Sfax"," technopole sfax","13 14 15/10/2018"));
        mData.add(new EventItem("DevFest Smart                                 City","siib sfax","28 29 30/09/2018 "));
        mData.add(new EventItem("TechFest Smart                                City"," Iset Sousse","24 25/10/2018 "));
        mData.add(new EventItem("Coding_Party","IIT"," 22 23/2/2019 "));
        mData.add(new EventItem("HashCode","IIT"," 28/2/2019"));

        SharedPreferences pref = this.getContext().getApplicationContext().getSharedPreferences("myPref",0x0000);
        boolean isDark = pref.getBoolean("isDark",false) ;


        if(isDark) {
            // dark theme is on
            eventRecyclerview.setBackgroundColor(getResources().getColor(R.color.black));
        }
        else
        {
            // light theme is on
            eventRecyclerview.setBackgroundColor(getResources().getColor(R.color.white));
        }


        eventAdapter = new EventAdapter(mData,isDark);
        eventRecyclerview.setAdapter(eventAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        eventRecyclerview.setLayoutManager(layoutManager);

        return root;
    }
}