package com.example.projetcv.ui.langue;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LangueViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LangueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is langue fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}