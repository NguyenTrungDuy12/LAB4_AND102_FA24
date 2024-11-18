package com.example.lab4_and102_fa24.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.lab4_and102_fa24.R;


public class Fragment2 extends Fragment {
    EditText edtContent2;
    Button btnsend2;

    public Fragment2() {
        // Required empty public constructor
    }


    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        edtContent2 = view.findViewById(R.id.etdContent);
        btnsend2 = view.findViewById(R.id.btnsend1);

        btnsend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content2 = edtContent2.getText().toString().trim();
                FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();

                Fragment1 fragment1 = (Fragment1) fragmentManager2.findFragmentById(R.id.frm1);
                fragment1.tvContent1.setText(content2);
            }
        });

        return view;
    }
}