package com.example.bartek.myfirstapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.graphics.Color.*;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.CYAN;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;
import static android.graphics.Typeface.BOLD;
import static com.example.bartek.myfirstapp.R.*;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private boolean cheats = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    public void click(View view) {

        if (cheats) {
            counter += 100;
        } else {
            counter++;
        }

        TextView textView = (TextView) findViewById(id.clicksCount);
        String count = Integer.toString(counter);
        textView.setText(count);

        if (counter >= 1) {
            changeDisplayOf(id.achievement1, parseColor("#52be80"));
        }
        if (counter >= 5) {
            changeDisplayOf(id.achievement5, parseColor("#27ae60"));
        }
        if (counter >= 10) {
            changeDisplayOf(id.achievement10, parseColor("#229954"));
        }
        if (counter >= 20) {
            changeDisplayOf(id.achievement20, parseColor("#1e8449"));
        }
        if (counter >= 50) {
            changeDisplayOf(id.achievement50, parseColor("#196f3d"));
        }
        if (counter >= 75) {
            changeDisplayOf(id.achievement75, parseColor("#145a32"));
        }
        if (counter >= 100) {
            changeDisplayOf(id.achievement100, parseColor("#5dade2"));
        }
        if (counter >= 200) {
            changeDisplayOf(id.achievement200, parseColor("#3498db"));
        }
        if (counter >= 300) {
            changeDisplayOf(id.achievement300, parseColor("#2e86c1"));
        }
        if (counter >= 400) {
            changeDisplayOf(id.achievement400, parseColor("#2874a6"));
        }
        if (counter >= 500) {
            changeDisplayOf(id.achievement500, parseColor("#21618c"));
        }
        if (counter >= 1000) {
            changeDisplayOf(id.achievement1000, parseColor("#1b4f72"));
        }
        if (counter >= 2000) {
            changeDisplayOf(id.achievement2000, RED);
        }
        if (counter >= 3000) {
            changeDisplayOf(id.achievement3000, parseColor("#FFA500"));
        }
        if (counter >= 4000) {
            changeDisplayOf(id.achievement4000, YELLOW);
        }
        if (counter >= 5000) {
            changeDisplayOf(id.achievement5000, GREEN);
        }
        if (counter >= 6000) {
            changeDisplayOf(id.achievement1, parseColor("#1f92f2"));
        }
        if (counter >= 7000) {
            changeDisplayOf(id.achievement7000, parseColor("#9B30FF"));
        }
        if (counter >= 10000) {
            changeDisplayOf(id.achievement10000, CYAN);
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
