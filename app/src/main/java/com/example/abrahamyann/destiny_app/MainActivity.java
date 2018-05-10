package com.example.abrahamyann.destiny_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView storyTextView;

    private Button topBtn;

    private Button btmBtn;

    private int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * wiring up the 3 views from the layout to the member variables
         */
        storyTextView = (TextView) findViewById(R.id.T1_Story);

        topBtn = (Button) findViewById(R.id.btnTop);

        btmBtn = (Button) findViewById(R.id.btmBtn);

        /**
         * set listener on the top button
         */
        topBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    storyTextView.setText(R.string.T3_Story);

                    topBtn.setText(R.string.T3_Ans1);

                    btmBtn.setText(R.string.T3_Ans2);

                    mStoryIndex = 3;
                } else {

                    storyTextView.setText(R.string.T6_End);
                    //hiding buttons
                    topBtn.setVisibility(View.GONE);
                    btmBtn.setVisibility(View.GONE);
                }

            }
        });
        /**
         * set a listener on the bottom button
         */
        btmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);

                    topBtn.setText(R.string.T2_Ans1);

                    btmBtn.setText(R.string.T2_Ans2);

                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    storyTextView.setText(R.string.T4_End);

                    topBtn.setVisibility(View.GONE);
                    btmBtn.setVisibility(View.GONE);
                }
                else {
                    storyTextView.setText(R.string.T5_End);

                    topBtn.setVisibility(View.GONE);
                    btmBtn.setVisibility(View.GONE);
                }
            }
        });

    }
}
