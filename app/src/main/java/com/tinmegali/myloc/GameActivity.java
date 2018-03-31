package com.tinmegali.myloc;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tinmegali.myloc.adapters.TabPageViewAdapter;
import com.tinmegali.myloc.fragments.CameraFragment;
import com.tinmegali.myloc.fragments.MapFragment;

import butterknife.ButterKnife;

public class GameActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);
        viewPager = findViewById(R.id.vpQuestions);
        tabLayout = findViewById(R.id.tabLayoutQuestions);
        setupViewPager();
        setupTabLayout();
    }

    private void setupViewPager() {
        TabPageViewAdapter adapter = new TabPageViewAdapter(getSupportFragmentManager());
        adapter.addFragment(new MapFragment(),"MAP");
        adapter.addFragment(new CameraFragment(),"CAMERA");
        viewPager.setAdapter(adapter);
    }

    private void setupTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
    }
}
