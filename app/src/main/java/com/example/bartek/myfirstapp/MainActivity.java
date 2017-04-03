package com.example.bartek.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.bartek.myfirstapp.MESSAGE";

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sumNumbers(View view) {
        EditText e1 = (EditText) findViewById(R.id.number1);
        EditText e2 = (EditText) findViewById(R.id.number2);
        TextView textView = (TextView) findViewById(R.id.result);
        int first = Integer.parseInt(e1.getText().toString());
        int second = Integer.parseInt(e2.getText().toString());
        int sum = first + second;
        String result = Integer.toString(sum);
        textView.setText(result);
    }

    public void click(View view) {
        counter++;
        String text;

        TextView result = (TextView) findViewById(R.id.result);

        TextView textView = (TextView) findViewById(R.id.numberOfClicks);
        String count = Integer.toString(counter);
        textView.setText(count);
        if (counter == 1) {
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setBackgroundColor(Color.GRAY);
            textView1.setTypeface(null, Typeface.BOLD);
            text = "Brawo! Udalo Ci sie raz kliknac!";
            result.setText(text);
        }
        if(counter == 10) {
            TextView textView10 = (TextView) findViewById(R.id.textView10);
            textView10.setBackgroundColor(Color.BLUE);
            textView10.setTypeface(null, Typeface.BOLD);
            text = "UUU, pędzisz jak rakieta :)";
            result.setText(text);
        }
        if(counter == 50) {
            TextView textView50 = (TextView) findViewById(R.id.textView50);
            textView50.setBackgroundColor(Color.MAGENTA);
            textView50.setTypeface(null, Typeface.BOLD);
            text = "DEWEJ JUZEF!!!";
            result.setText(text);
        }
        if(counter == 100) {
            TextView textView100 = (TextView) findViewById(R.id.textView100);
            textView100.setBackgroundColor(Color.CYAN);
            textView100.setTypeface(null, Typeface.BOLD);
            text = "SETA!!! SZYBSZY NIZ HUSAJN BOLT";
            result.setText(text);
        }
        if(counter == 500) {
            TextView textView500 = (TextView) findViewById(R.id.textView500);
            textView500.setBackgroundColor(Color.GREEN);
            textView500.setTypeface(null, Typeface.BOLD);
            text = "MISZCZ. Maklowicz approves. Dasz rade ubic 10k?";
            result.setText(text);
        }
        if(counter == 500) {
            TextView textView10000 = (TextView) findViewById(R.id.textView10000);
            textView10000.setBackgroundColor(Color.RED);
            textView10000.setTypeface(null, Typeface.BOLD);
            text = "WYGRALES 2 ZIEMNIAKI. PO ODBIOR PROSZE ZGLOSIC SIE DO WYKLADOWCY PO ZAJECIACH";
            result.setText(text);
        }
    }
}
