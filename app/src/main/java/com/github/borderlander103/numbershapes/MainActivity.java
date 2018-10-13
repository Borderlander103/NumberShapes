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

        Toast.makeText(this, mGuessString, Toast.LENGTH_SHORT).show();

    }

}
