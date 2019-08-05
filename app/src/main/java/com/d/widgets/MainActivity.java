package com.d.widgets;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;

    private EditText edtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);

        String title = tvTitle.getText().toString();

        tvTitle.setText("My name is Huy Nguyen");

        edtUsername = findViewById(R.id.edtUsername);

        String text = edtUsername.getText().toString();

        edtUsername.setText("Hello MotoBike!!");


        edtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("text", s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void openToast(View view) {

        Toast.makeText(this,"LOGIN CLICKED",Toast.LENGTH_SHORT).show();
    }
}
