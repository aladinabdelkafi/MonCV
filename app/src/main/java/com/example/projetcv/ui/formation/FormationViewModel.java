package com.example.projetcv.ui.formation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is event fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}