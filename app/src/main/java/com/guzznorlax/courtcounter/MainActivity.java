// Add your package below
/* package com.example.android.justjava; */
package com.guzznorlax.courtcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.guzznorlax.courtcounter.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    int ScoreCountA = 0;
    int ScoreCountB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void reset(View view) {
        ScoreCountA = 0;
        ScoreCountB = 0;
        displayA(ScoreCountA);
        displayB(ScoreCountB);
    }

    public void ThrA(View view) {
        ScoreCountA = ScoreCountA + 3;
        displayA(ScoreCountA);
    }

    public void TwoA(View view) {
        ScoreCountA = ScoreCountA + 2;
        displayA(ScoreCountA);
    }

    public void OneA(View view) {
        ScoreCountA = ScoreCountA + 1;
        displayA(ScoreCountA);
    }

    public void ThrB(View view) {
        ScoreCountB = ScoreCountB + 3;
        displayB(ScoreCountB);
    }

    public void TwoB(View view) {
        ScoreCountB = ScoreCountB + 2;
        displayB(ScoreCountB);
    }

    public void OneB(View view) {
        ScoreCountB = ScoreCountB + 1;
        displayB(ScoreCountB);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView ScoreA = (TextView) findViewById(R.id.ScoreA);
        ScoreA.setText("" + number);
    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayB(int number) {
        TextView ScoreB = (TextView) findViewById(R.id.ScoreB);
        ScoreB.setText("" + number);
    }
}