package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textviewHelloWorld;
    private TextView textviewHelloWorld1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviewHelloWorld = this.findViewById(R.id.text_view_hello_world);
        textviewHelloWorld1 = this.findViewById(R.id.text_view_hello_world1);

        Button button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View view) {
                if (i % 2 == 0) {
                    textviewHelloWorld.setText(R.string.andriod1);
                    textviewHelloWorld1.setText(R.string.andriod);
                } else {
                    textviewHelloWorld.setText(R.string.andriod);
                    textviewHelloWorld1.setText(R.string.andriod1);
                }
                i++;
            }
        });
    /*button_1.setOnClickListener(new button_1Listener());
}
private class button_1Listener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
            textviewHelloWorld.setText("你");
            textviewHelloWorld1.setText("好");
    }*/
    }
}

