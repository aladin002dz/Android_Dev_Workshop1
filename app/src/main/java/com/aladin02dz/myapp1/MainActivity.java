package com.aladin02dz.myapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void hello(View view)
    {
        String name;
        EditText et = (EditText) findViewById(R.id.name);
        name = et.getText().toString();
        Toast.makeText(this, "Hello "+ name, Toast.LENGTH_LONG).show();
    }

}
