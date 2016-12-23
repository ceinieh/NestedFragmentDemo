package com.example.android.nestedfragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.nestedfragmentsdemo.R;

import layout.ChildFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CharentFragment extends Fragment {


    public CharentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ChildFragment childFragment = new ChildFragment();
        ft.replace(R.id.f_parentfragent_frame, childFragment);
        ft.addToBackStack(null);
        ft.commit();

        return inflater.inflate(R.layout.fragment_charent, container, false);
    }

}
