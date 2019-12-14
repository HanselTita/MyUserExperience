package com.softhans.myuserexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE ="com.softhans.myuserexperience.extra.MESSAGE";

    FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFloatingActionButton = findViewById(R.id.floatingActionButton);


        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });
    }

    public void chooseCake(View view) {
        Toast.makeText(this, "You choose cakes", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(MESSAGE, "You choose cakes");
        startActivity(intent);
    }

    public void choosePufPuf(View view) {
        Toast.makeText(this, "You choose puf puf and beans", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(MESSAGE, "You choose puf puf and beans");
        startActivity(intent);
    }

    public void chooseFries(View view) {
        Toast.makeText(this, "You choose French fries", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(MESSAGE, "You choose French fries");
        startActivity(intent);
    }

    public void hornCake(View view) {
        Toast.makeText(this, "You choose horn-cakes", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(MESSAGE, "You choose horn-cakes");
        startActivity(intent);
    }

    public void chosePap(View view) {
        Toast.makeText(this, "You choose puff puf and pap", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(MESSAGE, "You choose puff puf and pap");
        startActivity(intent);
    }



}
