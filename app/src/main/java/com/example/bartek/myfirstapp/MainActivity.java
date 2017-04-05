package com.example.bartek.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.CYAN;
import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;
import static android.graphics.Typeface.BOLD;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.bartek.myfirstapp.MESSAGE";

    private int counter = 0;
    private boolean isCheatEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        if (isCheatEnabled) {
            counter += 100;
        } else {
            counter++;
        }

        TextView textView = (TextView) findViewById(R.id.clicksCount);
        String count = Integer.toString(counter);
        textView.setText(count);

        if (counter == 1) {
            changeDisplayOf(R.id.achievement1, GRAY);
        }
        if (counter == 5) {
            changeDisplayOf(R.id.achievement5, GRAY);
        }
        if (counter == 10) {
            changeDisplayOf(R.id.achievement10, GRAY);
        }
        if (counter == 20) {
            changeDisplayOf(R.id.achievement20, GRAY);
        }
        if (counter == 50) {
            changeDisplayOf(R.id.achievement50, GRAY);
        }
        if (counter == 75) {
            changeDisplayOf(R.id.achievement75, GRAY);
        }
        if (counter == 100) {
            changeDisplayOf(R.id.achievement100, GRAY);
        }
        if (counter == 200) {
            changeDisplayOf(R.id.achievement200, GRAY);
        }
        if (counter == 300) {
            changeDisplayOf(R.id.achievement300, GRAY);
        }
        if (counter == 400) {
            changeDisplayOf(R.id.achievement400, GRAY);
        }
        if (counter == 500) {
            changeDisplayOf(R.id.achievement500, GRAY);
        }
        if (counter == 1000) {
            changeDisplayOf(R.id.achievement1000, GRAY);
        }
        if (counter == 2000) {
            changeDisplayOf(R.id.achievement2000, GRAY);
        }
        if (counter == 3000) {
            changeDisplayOf(R.id.achievement3000, GRAY);
        }
        if (counter == 4000) {
            changeDisplayOf(R.id.achievement4000, GRAY);
        }
        if (counter == 5000) {
            changeDisplayOf(R.id.achievement5000, GRAY);
        }
        if (counter == 6000) {
            changeDisplayOf(R.id.achievement6000, GRAY);
        }
        if (counter == 7000) {
            changeDisplayOf(R.id.achievement7000, GRAY);
        }
        if (counter == 10000) {
            changeDisplayOf(R.id.achievement10000, GRAY);
        }
    }

    private void changeDisplayOf(int id, int color) {
        TextView textView1 = (TextView) findViewById(id);
        textView1.setBackgroundColor(color);
        textView1.setTypeface(null, BOLD);
    }
}
