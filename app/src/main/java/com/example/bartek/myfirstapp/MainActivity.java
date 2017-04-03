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

        TextView result = (TextView) findViewById(R.id.result);

        TextView textView = (TextView) findViewById(R.id.numberOfClicks);
        String count = Integer.toString(counter);
        textView.setText(count);
        if (counter == 1) {
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setBackgroundColor(Color.GRAY);
            textView1.setTypeface(null, Typeface.BOLD);
        }
    }
}
