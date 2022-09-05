package com.example.javacalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    char operator = ' ';
    String numberOne = "";
    String numberTwo = "";
    boolean isOperatorClicked = false;
    AppCompatTextView text_result, text_show_operation;
    AppCompatButton btn_plus, btn_minus, btn_multiply, btn_divid, btn_NumberSeven, btn_NumberEghit,
            btn_NumberNine, btn_clear, btn_NumberFour, btn_NumberFive, btn_NumberSix, btn_NumberOne,
            btn_NumberTwo, btn_NumberThree, btn_Mod, btn_NumberZero, btn_Dote, btn_Eqwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        OnClick();
    }

    public void initView() {
        text_show_operation = findViewById(R.id.text_show_operation);
        btn_Eqwal = findViewById(R.id.btn_Eqwal);
        text_result = findViewById(R.id.text_result);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divid = findViewById(R.id.btn_divid);
        btn_plus = findViewById(R.id.btn_plus);
        btn_Mod = findViewById(R.id.btn_Mod);
        btn_NumberOne = findViewById(R.id.btn_NumberOne);
        btn_NumberTwo = findViewById(R.id.btn_NumberTwo);
        btn_NumberThree = findViewById(R.id.btn_NumberThree);
        btn_NumberFour = findViewById(R.id.btn_NumberFour);
        btn_NumberFive = findViewById(R.id.btn_NumberFive);
        btn_NumberSix = findViewById(R.id.btn_NumberSix);
        btn_NumberSeven = findViewById(R.id.btn_NumberSeven);
        btn_NumberEghit = findViewById(R.id.btn_NumberEghit);
        btn_NumberNine = findViewById(R.id.btn_NumberNine);
        btn_NumberZero = findViewById(R.id.btn_NumberZero);
        btn_Dote = findViewById(R.id.btn_Dote);
        btn_clear = findViewById(R.id.btn_clear);
    }

    private void OnClick() {
        btn_NumberZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("0");
                if (operator != ' ') {
                    numberTwo += 0;
                } else {
                    numberOne += 0;
                }
            }
        });

        btn_NumberOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("1");
                if (operator != ' ') {
                    numberTwo += 1;
                } else {
                    numberOne += 1;
                }
            }
        });

        btn_NumberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("2");
                if (operator != ' ') {
                    numberTwo += 2;
                } else {
                    numberOne += 2;
                }
            }
        });

        btn_NumberThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("3");
                if (operator != ' ') {
                    numberTwo += 3;
                } else {
                    numberOne += 3;
                }
            }
        });

        btn_NumberFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("4");
                if (operator != ' ') {
                    numberTwo += 4;
                } else {
                    numberOne += 4;
                }
            }
        });
        btn_NumberFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("5");
                if (operator != ' ') {
                    numberTwo += 5;
                } else {
                    numberOne += 5;
                }
            }
        });
        btn_NumberSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("6");
                if (operator != ' ') {
                    numberTwo += 6;
                } else {
                    numberOne += 6;
                }
            }
        });

        btn_NumberSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("7");
                if (operator != ' ') {
                    numberTwo += 7;
                } else {
                    numberOne += 7;
                }
            }
        });
        btn_NumberEghit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("8");
                if (operator != ' ') {
                    numberTwo += 8;
                } else {
                    numberOne += 8;
                }
            }
        });
        btn_NumberNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("9");
                if (operator != ' ') {
                    numberTwo += 9;
                } else {
                    numberOne += 9;
                }

            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = text_show_operation.getText().toString();
                text_show_operation.append("+");
                operator = '+';
                text_result.setText(String.valueOf(numberOne));
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("-");
//                if (operator != ' ') {
//                    operator += '-';
//                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("*");
//                if (operator != ' ') {
//                    operator += '*';
//                }
            }
        });
        btn_divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("/");
//                if (operator != ' ') {
//                    operator += '/';
//                }
            }
        });
        btn_Dote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append(".");
            }
        });

        btn_Mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.append("%");
//                if (operator != ' ') {
//                    operator += '%';
//                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_show_operation.setText(" ");
            }
        });

        btn_Eqwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}