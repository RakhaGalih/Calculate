package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private TextView info;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button clear;
    private Button equal;
    private int val1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + " + ");
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + " - ");
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + " * ");
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + " / ");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                int a = evaluteQuestion(info.getText().toString());

                    info.setText(info.getText().toString() + " = " + a);
                }catch (Exception e){}
            }
        });
    }

    private void setupUIViews() {

        one = (Button) findViewById(R.id.one);
        zero = (Button) findViewById(R.id.zero);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        info = (TextView)findViewById(R.id.info);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);
    }

    public static int evaluteQuestion(String question) {
        Scanner sc = new Scanner(question);

        // get the next number from the scanner
        int firstValue = Integer.parseInt(sc.findInLine("[0-9]*"));

        // get everything which follows and is not a number (might contain white spaces)
        String operator = sc.findInLine("[^0-9]*").trim();
        int secondValue = Integer.parseInt(sc.findInLine("[0-9]*"));
        switch (operator){
            case "+":
                return firstValue + secondValue;
            case "-":
                return firstValue - secondValue;
            case "/":
                return firstValue / secondValue;
            case "*":
                return firstValue * secondValue;
            case "%":
                return firstValue % secondValue;
            // todo: add additional operators as needed..
            default:
                throw new RuntimeException("unknown operator: "+operator);
        }
    }
}