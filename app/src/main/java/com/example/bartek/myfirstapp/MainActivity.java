package com.example.bartek.myfirstapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.CYAN;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;
import static android.graphics.Typeface.BOLD;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.bartek.myfirstapp.MESSAGE";

    private int counter = 0;
    private boolean cheats = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        if (cheats) {
            counter += 100;
        } else {
            counter++;
        }

        TextView textView = (TextView) findViewById(R.id.clicksCount);
        String count = Integer.toString(counter);
        textView.setText(count);

        if (counter == 1) {
            changeDisplayOf(R.id.achievement1, Color.parseColor("#52be80"));
        }
        if (counter == 5) {
            changeDisplayOf(R.id.achievement5, Color.parseColor("#27ae60"));
        }
        if (counter == 10) {
            changeDisplayOf(R.id.achievement10, Color.parseColor("#229954"));
        }
        if (counter == 20) {
            changeDisplayOf(R.id.achievement20, Color.parseColor("#1e8449"));
        }
        if (counter == 50) {
            changeDisplayOf(R.id.achievement50, Color.parseColor("#196f3d"));
        }
        if (counter == 75) {
            changeDisplayOf(R.id.achievement75, Color.parseColor("#145a32"));
        }
        if (counter == 100) {
            changeDisplayOf(R.id.achievement100, Color.parseColor("#5dade2"));
        }
        if (counter == 200) {
            changeDisplayOf(R.id.achievement200, Color.parseColor("#3498db"));
        }
        if (counter == 300) {
            changeDisplayOf(R.id.achievement300, Color.parseColor("#2e86c1"));
        }
        if (counter == 400) {
            changeDisplayOf(R.id.achievement400, Color.parseColor("#2874a6"));
        }
        if (counter == 500) {
            changeDisplayOf(R.id.achievement500, Color.parseColor("#21618c"));
        }
        if (counter == 1000) {
            changeDisplayOf(R.id.achievement1000, Color.parseColor("#1b4f72"));
        }
        if (counter == 2000) {
            changeDisplayOf(R.id.achievement2000, RED);
        }
        if (counter == 3000) {
            changeDisplayOf(R.id.achievement3000, Color.parseColor("#FFA500"));
        }
        if (counter == 4000) {
            changeDisplayOf(R.id.achievement4000, YELLOW);
        }
        if (counter == 5000) {
            changeDisplayOf(R.id.achievement5000, GREEN);
        }
        if (counter == 6000) {
            changeDisplayOf(R.id.achievement6000, BLUE);
        }
        if (counter == 7000) {
            changeDisplayOf(R.id.achievement7000, Color.parseColor("#9B30FF"));
        }
        if (counter == 10000) {
            changeDisplayOf(R.id.achievement10000, CYAN);
        }
    }

    private void changeDisplayOf(int id, int color) {
        TextView textView1 = (TextView) findViewById(id);
        textView1.setBackgroundColor(color);
        textView1.setTypeface(null, BOLD);
    }

    public void toggleCheats(View view) {
        this.cheats = !cheats;
    }
}
