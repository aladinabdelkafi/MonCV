package com.example.projetcv.ui.stage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StageViewModel extends ViewModel  {

    private MutableLiveData<String> mText;

    public StageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is stage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }


}