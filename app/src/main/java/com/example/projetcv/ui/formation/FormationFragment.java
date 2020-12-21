package com.example.projetcv.ui.formation;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.projetcv.R;
import com.example.projetcv.ui.parcours.SliderAdapter;

public class FormationFragment extends Fragment {

    private FormationViewModel eventViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eventViewModel =
                ViewModelProviders.of(this).get(FormationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_formation, container, false);

        return root;

    }


}