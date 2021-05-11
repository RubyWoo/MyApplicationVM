package com.example.myapplicationvm;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ProfileFragment extends Fragment {

    // Tenemos una referencia de la clase ProfileViewModel al igual
    // que el otro Fragmento
    private ProfileViewModel mViewModel;
    private EditText editText;

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.profile_fragment, container, false);

        editText = v.findViewById(R.id.edit_text);
        Button button = v.findViewById(R.id.button_ok);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Con nuestro ViewModel ya instanciado llamamos al
                // método que modifica la variable text
                mViewModel.setTextViewModel(editText.getText());
            }
        });



        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Obtenemos en onActivityCreated una referencia de ViewModelProviders
        mViewModel = ViewModelProviders.of(getActivity()).get(ProfileViewModel.class);

    }

}
