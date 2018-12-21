package com.example.admin.exampleviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ViewPager viewPager;
    ImageView imageView_all,imageView_fav,imageView_other;
    TextView textView_all,textView_fav,textView_other;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        textView_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        textView_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        textView_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                Toast.makeText(MainActivity.this,""+i,Toast.LENGTH_SHORT).show();
                switch (i)
                {
                    case 0:
                        imageView_all.setVisibility(View.VISIBLE);
                        imageView_other.setVisibility(View.INVISIBLE);
                        imageView_fav.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        imageView_all.setVisibility(View.INVISIBLE);
                        imageView_fav.setVisibility(View.VISIBLE);
                        imageView_other.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        imageView_fav.setVisibility(View.INVISIBLE);
                        imageView_all.setVisibility(View.INVISIBLE);
                        imageView_other.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private void init()
    {
        viewPager = findViewById(R.id.ViewPager);

        imageView_all = findViewById(R.id.All_image);
        imageView_fav = findViewById(R.id.Fav_image);
        imageView_other = findViewById(R.id.Other_image);

        textView_all = findViewById(R.id.text_all);
        textView_fav = findViewById(R.id.text_fav);
        textView_other = findViewById(R.id.text_other);
    }
}
