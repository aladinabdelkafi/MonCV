package com.example.projetcv.ui.certif;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CertifViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CertifViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is event fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}