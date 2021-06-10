package com.vedasitsolutions.Basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    TextView textViewmain , textViewanswer, textViewac , textViewseven ,
             textVieweight, textViewnine, textViewfour,
             textViewfive, textViewsix, textViewone ,
             textViewtwo, textViewthree , textViewdoublezero ,
             textViewzero , textViewdecimal ,textViewbracket , textViewequalsto ,
             textViewpercent , textViewdivide ,
             textViewmultiply , textViewminus , textViewplus ;

    String process;
    Boolean checkBracket = false;
    String pie = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewmain = findViewById(R.id.mainTextView);
        textViewanswer = findViewById(R.id.answerTextView);
        textViewac = findViewById(R.id.AC);
        textViewseven = findViewById(R.id.seven);
        textVieweight = findViewById(R.id.eight);
        textViewnine = findViewById(R.id.nine);
        textViewfour = findViewById(R.id.four);
        textViewfive = findViewById(R.id.five);
        textViewsix = findViewById(R.id.six);
        textViewone = findViewById(R.id.one);
        textViewtwo = findViewById(R.id.two);
        textViewthree = findViewById(R.id.three);
        textViewdoublezero = findViewById(R.id.doublezero);
        textViewzero = findViewById(R.id.zero);
        textViewdecimal = findViewById(R.id.decimal);
        textViewbracket = findViewById(R.id.bracket);

        textViewpercent = findViewById(R.id.percent);
        textViewdivide = findViewById(R.id.divide);
        textViewmultiply = findViewById(R.id.multiply);
        textViewminus = findViewById(R.id.minus);
        textViewplus = findViewById(R.id.plus);
        textViewequalsto = findViewById(R.id.equalsto);

        textViewac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewmain.setText("");
                textViewanswer.setText("");
            }
        });

        textViewzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "0");

            }
        });


        textViewone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "1");

            }
        });
        textViewtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText(process + "2");

            }
        });
        textViewthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText(process + "3");

            }
        });
        textViewfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "4");

            }
        });
        textViewfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "5");

            }
        });
        textViewsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "6");

            }
        });
        textViewseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "7");

            }
        });
        textVieweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "8");

            }
        });
        textViewnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "9");

            }
        });
        textViewdoublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "00");

            }
        });
        textViewdecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + ".");

            }
        });
        textViewbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if
                (checkBracket)
                {
                    process = textViewmain.getText().toString();
                    textViewmain.setText(process + ")");
                    checkBracket = false;

                }
                else
                    {

                    process = textViewmain.getText().toString();
                    textViewmain.setText(process + "(");
                    checkBracket = true;
                }

            }
        });

        textViewplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "+");

            }
        });

        textViewdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "÷");

            }
        });

        textViewminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "-");

            }
        });


        textViewmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "×");

            }
        });


        textViewpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                textViewmain.setText( process + "%");

            }
        });

        textViewequalsto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = textViewmain.getText().toString();
                process = process.replaceAll("×", "*");
                process = process.replaceAll("%", "/ 100 *");
                process = process.replaceAll("÷", "/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResult = "";
                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process,"javaScript" , 1,null).toString();
                }catch (Exception e) {
                    finalResult = "0";
                }
                textViewanswer.setText(finalResult);
            }
        });
    }
}