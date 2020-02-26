
package com.example.jasonfung.tutorial_22;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String data = (String) getIntent().getExtras().getString("keyName");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(data);
    }

    public void ShowVideo (View view){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_xaininqyEE")));
        }


    }


}

