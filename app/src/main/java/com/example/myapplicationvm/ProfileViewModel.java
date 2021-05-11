package com.example.myapplicationvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/***
 *
 * ViewModel class
 *
 ***/

public class ProfileViewModel extends ViewModel {

    // Se trabaja sobre una variable CharSequence de nombre text
    // Además está encapsulada en un MutableLiveData para que
    // pueda ser observable
    private MutableLiveData<CharSequence> text = new MutableLiveData<>();


    // Métodos que permiten modificar y obtener la variable text
    public void setTextViewModel(CharSequence input){
        text.setValue(input);
    }
    public LiveData<CharSequence> getTextViewModel(){
        return text;
    }


}
