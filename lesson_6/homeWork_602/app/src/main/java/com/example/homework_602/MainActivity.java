package com.example.homework_602;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private TextView displayNum;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnPlusMinus,
            btnPercent, btnDiv, btnMultiply, btnMinus, btnPlus, btnEqual, btnDot;

    Double firstValue = 0.0;
    String operation = "+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        //нажатие на кнопку "0"
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("0");
            }
        });
        //нажатиен на кнопку "1"
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("1");
            }
        });

        //нажатиен на кнопку "2"
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("2");
            }
        });

        //нажатиен на кнопку "3"
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("3");
            }
        });

        //нажатиен на кнопку "4"
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("4");
            }
        });

        //нажатиен на кнопку "5"
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("5");
            }
        });

        //нажатиен на кнопку "6"
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("6");
            }
        });

        //нажатиен на кнопку "7"
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("7");
            }
        });

        //нажатиен на кнопку "8"
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("8");
            }
        });

        //нажатиен на кнопку "9"
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                checkDisplay("9");
            }
        });

        //нажатиен на кнопку "dot"
        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + ".");
            }
        });

        //нажатиен на кнопку "clear"
        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText("0");
            }
        });

        //нажатиен на кнопку "+/-"
        btnPlusMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstValue = Double.parseDouble((String) displayNum.getText());
                displayNum.setText("");
                operation = "+/-";
            }
        });

        //нажатиен на кнопку "%"
        btnPercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstValue = Double.parseDouble((String) displayNum.getText());
                displayNum.setText("");
                operation = "%";
            }
        });

        //нажатиен на кнопку "/"
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstValue = Double.parseDouble((String) displayNum.getText());
                displayNum.setText("");
                operation = "/";
            }
        });

        //нажатиен на кнопку "X"
        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstValue = Double.parseDouble((String) displayNum.getText());
                displayNum.setText("");
                operation = "*";
            }
        });

        //нажатиен на кнопку "-"
        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstValue = Double.parseDouble((String) displayNum.getText());
                displayNum.setText("");
                operation = "-";
            }
        });

        //нажатиен на кнопку "+"
        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstValue = Double.parseDouble((String) displayNum.getText());
                displayNum.setText("");
                operation = "+";
            }
        });

        //нажатиен на кнопку "="
        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Double secondValue = Double.parseDouble((String) displayNum.getText());
                if("+/-".equals(operation)){
                    double changeSign = 1.0;
                    displayNum.setText((firstValue * changeSign) + "");
                }
                if("%".equals(operation)){
                    double onePercent = 100.0;
                    displayNum.setText((firstValue / onePercent) + "");
                }
                if("+".equals(operation)){
                    displayNum.setText((firstValue + secondValue) + "");
                }
                if("-".equals(operation)){
                    displayNum.setText((firstValue - secondValue) + "");
                }
                if("*".equals(operation)){
                    displayNum.setText((firstValue * secondValue) + "");
                }
                if("/".equals(operation)){
                    displayNum.setText((firstValue / secondValue) + "");
                }

                firstValue = 0.0;
                operation = "+";
            }
        });

    }

    private void initViews(){
        displayNum = findViewById(R.id.displayNum);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        btnClear = findViewById(R.id.btnClear);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);
        btnPercent = findViewById(R.id.btnPercent);
        btnDiv = findViewById(R.id.btnDiv);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);
    }

    private void checkDisplay(String num){
        if (displayNum.getText().equals("0")){
            displayNum.setText(num);
        } else {
            displayNum.setText(displayNum.getText() + num);
        }
    }

}