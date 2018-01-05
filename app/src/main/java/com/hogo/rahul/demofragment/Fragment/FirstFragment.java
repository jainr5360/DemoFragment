package com.hogo.rahul.demofragment.Fragment;

import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hogo.rahul.demofragment.R;


public class FirstFragment extends Fragment {

    Button button;
    EditText etData;
    String etdata;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        button = (Button) view.findViewById(R.id.button2);
        etData = (EditText) view.findViewById(R.id.et_data);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etdata = etData.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("message", etdata);
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                SecondFragment fragobj = new SecondFragment();

                fragmentTransaction.add(R.id.Second_content_layout, fragobj, "s");
                fragmentTransaction.detach(fragobj);
                fragmentTransaction.attach(fragobj);
                fragobj.setArguments(bundle);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}
