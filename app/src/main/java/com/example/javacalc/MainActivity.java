package com.example.javacalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    double lastNumber = 0.0;
    Operation currentOperation;
    TextView text_result, text_show_operation;
    Button btn_plus, btn_minus, btn_multiply, btn_divid,
            btn_clear, btn_Mod, btn_Eqwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addCallbacks();

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
        btn_clear = findViewById(R.id.btn_clear);
    }

    public void onNumberClicked(View v) {
        Button button = (Button) v;
        String newNumber = button.getText().toString();
        String oldNumber = text_result.getText().toString();
        String newResult = oldNumber + newNumber;
        text_result.setText(newResult);
    }

    public void addCallbacks() {
        onClear();
        onPlus();
        onMinus();
        onMultiply();
        onDivid();
        onEqual();
    }

    enum Operation {
        Plus,
        Minus,
        Multiply,
        Divid,
    }

    private void onClear() {
        btn_clear.setOnClickListener(view -> text_result.setText(""));
    }

    private void prepareOperation(Operation operation){
        lastNumber = Double.parseDouble(text_result.getText().toString());
        onClear();
        currentOperation = operation;
    }

    private double doCurrentOperation(){
        double secondNumber = Double.parseDouble(text_result.getText().toString());
        double result = 0.0;
        switch (currentOperation){

            case Plus: result = lastNumber + secondNumber ;
                break;
            case Minus: result = lastNumber - secondNumber ;
                break;
            case Multiply: result = lastNumber * secondNumber ;
                break;
            case Divid: result = lastNumber / secondNumber ;
                break;
        }
        return result ;
    }


    private void onPlus() {
        btn_plus.setOnClickListener(view -> {
            prepareOperation(Operation.Plus);
        });
    }

    private void onMinus() {
        btn_minus.setOnClickListener(view -> {
            prepareOperation(Operation.Minus);
        });
    }

    private void onMultiply() {
        btn_multiply.setOnClickListener(view -> {
            prepareOperation(Operation.Multiply);
        });
    }

    private void onDivid() {
        btn_divid.setOnClickListener(view -> {
            prepareOperation(Operation.Divid);
        });
    }

    private void onEqual() {
        btn_Eqwal.setOnClickListener(view -> {
            double result = doCurrentOperation();
            text_result.setText(String.valueOf(result));
        });
    }
}