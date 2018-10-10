package com.example.wolverine.greco_romanwrestling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerA_score = 0;
    int playerB_score = 0;
    TextView scoreA_txt;
    TextView scoreB_txt;
    TextView result_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA_txt = (TextView)findViewById(R.id.player_a_score);
        scoreB_txt = (TextView)findViewById(R.id.player_b_score);
        result_txt = (TextView)findViewById(R.id.result_txt);
    }
    /**
     *
     * Player B Buttons Event
     */
    public void threePoints_playerA(View view) {
        playerA_score = playerA_score + 3;
        scoreA_txt.setText(Integer.toString(playerA_score));
    }

    public void twoPoints_playerA(View view) {
        playerA_score = playerA_score + 2;
        scoreA_txt.setText(Integer.toString(playerA_score));
    }

    public void onePoints_playerA(View view) {
        playerA_score = playerA_score + 1;
        scoreA_txt.setText(Integer.toString(playerA_score));
    }

    public void warnning_playerA(View view) {
        playerA_score = playerA_score -2;
        scoreA_txt.setText(Integer.toString(playerA_score));
    }
    /**
     *
     * Player B Buttons Event
     */
    public void threePoints_playerB(View view) {
        playerB_score = playerB_score + 3;
        scoreB_txt.setText(Integer.toString(playerB_score));
    }

    public void twoPoints_playerB(View view) {
        playerB_score = playerB_score + 2;
        scoreB_txt.setText(Integer.toString(playerB_score));
    }

    public void onePoints_playerB(View view) {
        playerB_score = playerB_score + 1;
        scoreB_txt.setText(Integer.toString(playerB_score));
    }

    public void warnning_playerB(View view) {
        playerB_score = playerB_score -2;
        scoreB_txt.setText(Integer.toString(playerB_score));
    }

    public void reset(View view) {
        playerA_score = 0;
        playerB_score = 0;
        result_txt.setText("");
        scoreA_txt.setText(Integer.toString(playerA_score));
        scoreB_txt.setText(Integer.toString(playerB_score));
    }

    public void Time_out(View view) {
        if(playerA_score > playerB_score)
        {
            result_txt.setText("Player A Winns");
        }else if(playerA_score == playerB_score)
        {
            result_txt.setText("It`s Draw");
        }else
        {
            result_txt.setText("Player B Winns");
        }
    }
}
