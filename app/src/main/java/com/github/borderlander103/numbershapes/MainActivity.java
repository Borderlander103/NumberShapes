package com.github.borderlander103.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkNumberButton(View view) {

        EditText mGuessView = findViewById(R.id.editText);

        if (TextUtils.isEmpty(mGuessView.getText().toString())) {
            Toast.makeText(this, "Please enter a number.", Toast.LENGTH_SHORT).show();
            return;
        }

        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(mGuessView.getText().toString());

        String myAnswer;

        if (myNumber.isTriangular()) {
            myAnswer = "is Triangular.";
        } else if (myNumber.isSquare()) {
            myAnswer = "is Square.";
        } else {
            myAnswer = "is neither Triangular or Square.";
        }

        Toast.makeText(this, "Your number " + myAnswer, Toast.LENGTH_LONG).show();

    }

    public class Number {

        int number;

        public boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber <= number) {
                if (triangularNumber == number) {
                    return true;
                } else {
                    x ++;
                    triangularNumber += x;
                }
            }
            return false;
        }
        public boolean isSquare() {
            int x = 1;
            int squareNumber = 1;
            while (squareNumber <= number) {
                if (squareNumber == number) {
                    return true;
                } else {
                    x += 2;
                    squareNumber += x;
                }
            }
            return false;
        }
    }

}
