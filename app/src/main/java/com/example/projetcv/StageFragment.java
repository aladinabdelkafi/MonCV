package com.example.projetcv;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetcv.ui.competance.CompetanceViewModel;
import com.example.projetcv.ui.stage.StageAdapter;
import com.example.projetcv.ui.stage.StageItem;
import com.example.projetcv.ui.stage.StageViewModel;

import java.util.ArrayList;
import java.util.List;

public class StageFragment extends Fragment {
public StageFragment(){}
    private StageViewModel stageViewModel;
    private RecyclerView stageRecyclerview;
    private StageAdapter stageAdapter;
    private List<StageItem> mData= new ArrayList<>();
    public View onCreateView( LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        stageViewModel =
                ViewModelProviders.of(this).get(StageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_stage, container, false);

        stageRecyclerview = root.findViewById(R.id.news_rv);
        mData.add(new StageItem("proximedia","dans ce stage j'ai appris à réparer les ordinateurs .","2016",R.drawable.proxi));
        mData.add(new StageItem("SifoConsulting","dans ce stage , j'ai développé une application mobile avec framework cordova et ionic ","2017",R.drawable.sifo));
        mData.add(new StageItem("SBS Consulting","dans ce stage j'ai développé une application de gestion de stock avec la langage de programmation c# et base de données SQL Server","2017",R.drawable.sbs));
        mData.add(new StageItem("SiFAST","dans ce stage j'ai développé une application web JAVAEE pour la reconnaissance des formes et  des textes en utilisant l'intelligence artificielle (OMR,OCR),spring,hibernate,primefaces","2018",R.drawable.sifast));

        SharedPreferences pref = this.getContext().getApplicationContext().getSharedPreferences("myPref",0x0000);
        boolean isDark = pref.getBoolean("isDark",false) ;





        stageAdapter = new StageAdapter(mData,isDark);
        stageRecyclerview.setAdapter(stageAdapter);
         LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        stageRecyclerview.setLayoutManager(layoutManager);

        return root;

    }

}