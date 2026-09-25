package com.example.redgreen;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setText("قرمز");
        button.setTextColor(Color.WHITE);
        button.setBackgroundColor(Color.RED);

        button.setOnClickListener(v -> {
            button.setBackgroundColor(Color.GREEN);
            button.setText("سبز");
        });

        setContentView(button);
    }
}
