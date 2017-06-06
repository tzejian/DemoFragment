package com.example.a127107.demofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static com.example.a127107.demofragment.R.id.tvFrag1;
import static com.example.a127107.demofragment.R.id.tvFrag2;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {
    Button btnAddText;
    TextView tvFrag2;


    public FragmentSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        tvFrag2 = (TextView)view.findViewById(R.id.tvFrag2) ;
        btnAddText = (Button)view.findViewById(R.id.btnAddTextFrag2);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag2.getText().toString() + "\n" + "New Data";
                tvFrag2.setText(data);
            }
        });
        return view;





    }

}

