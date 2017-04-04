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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setChecked(true);

    }

    public void click(View view) {
        counter++;
        TextView textView = (TextView) findViewById(R.id.numberOfClicks);
        String count = Integer.toString(counter);
        textView.setText(count);

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
//        CheckBox morePowerfulClicks = (CheckBox) findViewById(R.id.morePowerfulClicks);

        if (checkBox.isChecked()) {
            counter += 99;
            if (counter == 1) {
                changeDisplayOf(R.id.textView1, GRAY);
            }
            if (counter == 10) {
                changeDisplayOf(R.id.textView10, BLUE);
            }
            if (counter == 50) {
                changeDisplayOf(R.id.textView50, MAGENTA);
            }
            if (counter == 100) {
                changeDisplayOf(R.id.textView100, CYAN);
            }
            if (counter == 200) {
                changeDisplayOf(R.id.textView200, YELLOW);
            }
            if (counter == 500) {
                changeDisplayOf(R.id.textView500, GREEN);
            }
            if (counter == 10000) {
                changeDisplayOf(R.id.textView10000, RED);
            }
        } else {
            TextView result = (TextView) findViewById(R.id.result);
            String text;

            if (counter == 1) {
                changeDisplayOf(R.id.textView1, GRAY);
                text = "Brawo! Udalo Ci sie raz kliknac!";
                result.setText(text);
            }
            if (counter == 10) {
                changeDisplayOf(R.id.textView10, BLUE);
                text = "UUU, pędzisz jak rakieta :)";
                result.setText(text);
            }
            if (counter == 50) {
                changeDisplayOf(R.id.textView50, MAGENTA);
                text = "DEWEJ JUZEF!!!";
                result.setText(text);
            }
            if (counter == 100) {
                changeDisplayOf(R.id.textView100, CYAN);
                text = "SETA!!! SZYBSZY NIZ HUSAJN BOLT";
                result.setText(text);
            }
            if (counter == 200) {
                changeDisplayOf(R.id.textView200, YELLOW);
                text = "ANDRZEJ ZROBILES TO!!!ONE";
                result.setText(text);
            }
            if (counter == 500) {
                changeDisplayOf(R.id.textView500, GREEN);
                text = "MISZCZ. Maklowicz approves. Dasz rade ubic 10k?";
                result.setText(text);
            }
            if (counter == 10000) {
                changeDisplayOf(R.id.textView10000, RED);
                text = "WYGRALES 2 ZIEMNIAKI. PO ODBIOR PROSZE SIE ZGLOSIC 30 LUTEGO 2018";
                result.setText(text);
            }
        }
    }

    private void changeDisplayOf(int id, int color) {
        TextView textView1 = (TextView) findViewById(id);
        textView1.setBackgroundColor(color);
        textView1.setTypeface(null, BOLD);
    }
}
