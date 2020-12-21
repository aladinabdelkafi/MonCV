package com.example.projetcv.ui.competance;

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

import com.example.projetcv.R;

public class CompetanceFragment extends Fragment {

    private CompetanceViewModel competanceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        competanceViewModel =
                ViewModelProviders.of(this).get(CompetanceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_competance, container, false);

        return root;
    }
}