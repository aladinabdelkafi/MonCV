package com.example.projetcv.ui.competance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CompetanceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CompetanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is competance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}