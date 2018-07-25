package com.ryrj.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void fun1(){
        Toast.makeText(this, "fun1()", Toast.LENGTH_SHORT).show();
    }

    private void fun2(){
        Toast.makeText(this, "fun2()", Toast.LENGTH_SHORT).show();
    }
}
