package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView mStoryText;
    public TextView mBottomButton;
    public TextView mTopButton;
    public int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mBottomButton = (TextView) findViewById(R.id.buttonBottom);
        mTopButton = (TextView) findViewById(R.id.buttonTop);
        mStoryIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(1);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(2);
            }
        });


    }

    private void updateStory(int answer){

        if((mStoryIndex == 1  && answer == 1) || (mStoryIndex == 3  && answer == 1)) {
            mStoryText.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
            mStoryIndex = 2;
        } else if (mStoryIndex == 1  && answer == 2) {
            mStoryText.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
            mStoryIndex = 3;
        } else if(mStoryIndex == 2  && answer == 1) {
            mStoryText.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        } else if ((mStoryIndex == 2  && answer == 2) || (mStoryIndex == 4  && answer == 2)) {
            mStoryText.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }  else if (mStoryIndex == 3  && answer == 2) {
            mStoryText.setText(R.string.T4_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }  else if(mStoryIndex == 4  && answer == 1) {
            mStoryText.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }

    }

}
