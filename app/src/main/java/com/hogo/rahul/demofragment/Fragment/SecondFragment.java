package com.hogo.rahul.demofragment.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hogo.rahul.demofragment.R;


public class SecondFragment extends Fragment {
    TextView textView;
    String strtext1, strtext2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        strtext1 = getArguments().getString("message");
//
//        Toast.makeText(getActivity(), "" + strtext, Toast.LENGTH_SHORT).show();
//        strtext2 = strtext1;

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        textView = (TextView) view.findViewById(R.id.tv_data);
        textView.setText(strtext1);

//        if (strtext1.equals(strtext2)) {
//            textView.setText("");
//        } else {
//
//
//        }

        return view;
    }


}
