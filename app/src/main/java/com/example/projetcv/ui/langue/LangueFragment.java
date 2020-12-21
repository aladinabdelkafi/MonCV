package com.example.projetcv.ui.langue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.projetcv.R;

public class LangueFragment extends Fragment {

    private LangueViewModel langueViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        langueViewModel =
                ViewModelProviders.of(this).get(LangueViewModel.class);
        View root = inflater.inflate(R.layout.fragment_langue, container, false);

        return root;
    }
}