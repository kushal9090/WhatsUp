package com.kushal.whatsup.homescreenfragmnets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kushal.whatsup.R;

/**
 * Created by kusha on 6/24/2017.
 */

public class Calls_Fragment extends Fragment {

    public static Calls_Fragment newInstance(){
        Bundle argument = new Bundle();
        Calls_Fragment calls_fragment = new Calls_Fragment();
        calls_fragment.setArguments(argument);
        return calls_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_calls, container , false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
