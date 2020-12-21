package com.example.projetcv.ui.parcours;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.projetcv.MainActivity;
import com.example.projetcv.R;

public class ParcoursFragment extends Fragment {

    private ParcoursViewModel parcoursViewModel;
    private ViewPager sViewPager;
    private LinearLayout dotsLayout;
    private TextView txt1;
    private TextView txt2;
    private TextView dots[];
private ConstraintLayout Relativ_parc;
    SliderAdapter sliderAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_parcours, container, false);
        View root1 = inflater.inflate(R.layout.slide_layout, container, false);
        txt1 = (TextView) root1.findViewById(R.id.tvHeading);
        txt2 = (TextView) root1.findViewById(R.id.tvDescription);
        sViewPager = (ViewPager) root.findViewById(R.id.sViewPager);
        dotsLayout = (LinearLayout) root.findViewById(R.id.layoutDots);
        Relativ_parc= root.findViewById(R.id.Relativ_parc);
        // create Adapter object
        sliderAdapter = new SliderAdapter(this.getContext());
        // set adapter in ViewPager
        sViewPager.setAdapter(sliderAdapter);
        // set PageChangeListener
        sViewPager.addOnPageChangeListener(viewPagerPageChangeListener);
        // adding bottom dots -> addBottomDots(0);
//      addDotIndicator(0);
        addBottomDots(0);




        return root;
    }

    // viewPagerPage ChangeListener according to Dots-Points
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);

            // changing the next button text 'NEXT' / 'GOT IT'
            if (position == sliderAdapter.image_slide.length - 1) {
                // last page. make button text to GOT IT

            } else {
                // still pages are left

            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };



    // add dot indicator
    public void addDotIndicator(){
        dots = new TextView[3];
        for (int i=0; i<dots.length; i++){
            dots[i] = new TextView(this.getContext());
            dots[i].setText(Html.fromHtml("&#8266;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.colorWhite));

            dotsLayout.addView(dots[i]);
        }
    }

    // set of Dots points
    private void addBottomDots(int currentPage) {
//        dots = new TextView[layouts.length];
        dots = new TextView[3];
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this.getContext());
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.colorWhite));  // dot_inactive
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(getResources().getColor(R.color.colorAccent)); // dot_active
    }

}