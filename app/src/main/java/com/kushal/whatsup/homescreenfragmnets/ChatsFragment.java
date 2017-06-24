package com.kushal.whatsup.homescreenfragmnets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kushal.whatsup.R;

import static com.kushal.whatsup.R.layout.*;

/**
 * Created by kusha on 6/24/2017.
 */

public class ChatsFragment extends Fragment {

    public static final String EXTRA_TAB_NAME = "tab_name";
    private String mTabName;

    public static ChatsFragment newInstance(String tabName){
        Bundle argumnets = new Bundle();
                argumnets.putString(EXTRA_TAB_NAME,tabName);
        ChatsFragment fragment = new ChatsFragment();
        fragment.setArguments(argumnets);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        mTabName = getArguments().getString(EXTRA_TAB_NAME);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
