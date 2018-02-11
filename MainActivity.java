package com.feedback.nick.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/* Goal: . */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleNewButtonClick(View view)
    {
        Intent intent = new Intent(this, ChooseSongActivity.class);
        startActivity(intent);
    }
}
