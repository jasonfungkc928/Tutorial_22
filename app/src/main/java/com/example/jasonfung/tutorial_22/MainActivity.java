 package com.example.jasonfung.tutorial_22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity();
            }

        });
    }
    public void openDetailActivity() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);

        Intent intent1 = new Intent (this, DetailActivity.class);
        intent.putExtra("keyName","Hello");
        startActivity(intent);
        Log.d(TAG, "openDetailActivity: HERE");
    }

}