package com.kushal.whatsup;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.kushal.whatsup.adapter.ViewpagerAdapter;
import com.kushal.whatsup.homescreenfragmnets.Calls_Fragment;
import com.kushal.whatsup.homescreenfragmnets.ChatsFragment;
import com.kushal.whatsup.homescreenfragmnets.Status_Fragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){

        initToolbar();
        initFabbtn();
        initViewpager();
        initTab();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    private void initFabbtn(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
   private ViewPager mViewpager ;
   private void initViewpager(){

       mViewpager = (ViewPager) findViewById(R.id.viewPager);
       List<String> tabname = new ArrayList<String>();
       tabname.add("Chats");
       tabname.add("Status");
       tabname.add("Calls");
       ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager() , getFragments() , tabname);
       mViewpager.setAdapter(viewpagerAdapter);
   }
   private void initTab(){
       TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
      tabLayout.setupWithViewPager(mViewpager);
   }
    private List<Fragment> mFragment;
    private List<Fragment> getFragments(){

   mFragment = new ArrayList<Fragment>();
        mFragment.add(ChatsFragment.newInstance(""));
        mFragment.add(Status_Fragment.newInstance( ));
        mFragment.add(Calls_Fragment.newInstance());
       return  mFragment;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
