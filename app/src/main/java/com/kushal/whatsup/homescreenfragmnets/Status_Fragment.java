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

public class Status_Fragment extends Fragment {

    public static Status_Fragment newInstance(){

        Bundle arguments = new Bundle();
        Status_Fragment status_fragment = new Status_Fragment();
        status_fragment.setArguments(arguments);
        return status_fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragmnet_status , container , false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
