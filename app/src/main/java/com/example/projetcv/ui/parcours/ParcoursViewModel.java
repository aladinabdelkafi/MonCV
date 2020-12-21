package com.example.projetcv.ui.parcours;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ParcoursViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ParcoursViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is parcours fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}