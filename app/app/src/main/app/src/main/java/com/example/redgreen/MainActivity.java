package com.example.redgreen;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setText("");
        button.setBackgroundColor(Color.RED);

        button.setOnClickListener(v -> {
            button.setBackgroundColor(Color.GREEN);
        });

        FrameLayout layout = new FrameLayout(this);
        layout.setGravity(Gravity.CENTER);
        layout.addView(button, new FrameLayout.LayoutParams(220, 120));

        setContentView(layout);
    }
}
