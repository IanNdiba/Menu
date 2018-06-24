package com.example.ian.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textView = (TextView) findViewById(R.id.menu_item_1);
        String viewOneMessage = textView.getText().toString();

        // Find first menu item TextView and print the text to the logs
        TextView textView2 = (TextView) findViewById(R.id.menu_item_2);
        String viewTwoMessage = textView.getText().toString();

        // Find first menu item TextView and print the text to the logs
        TextView textView3 = (TextView) findViewById(R.id.menu_item_3);
        String viewThreeMessage = textView.getText().toString();

        Log.i("EnterpriseActivity.java", "View 1" + viewOneMessage + "\n View 2" + viewTwoMessage + "\n View 3" + viewThreeMessage);


    }
}
