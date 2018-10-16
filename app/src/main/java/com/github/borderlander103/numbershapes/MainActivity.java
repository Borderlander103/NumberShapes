package com.github.borderlander103.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        String mGuessString = mGuessView.getText().toString();

        int mGuessInt = Integer.parseInt(mGuessString);

        Number myNumber = new Number();

        myNumber.number = mGuessInt;

        String answer;

        answer = Boolean.toString(myNumber.isTriangular());

        Toast.makeText(this, answer, Toast.LENGTH_SHORT).show();

    }

    class Number {

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


    }


}
