package lt.vcs.donatasj_homework;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    private final static String LOG_TAG = "1st_main_activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printStatus(":----------");
        printStatus(": onCreate");
        setupUI();
    }

    private void setupUI() {
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.buttonOne);
        onButtonClick();
    }


    private void printStatus(String statusName) {
        Log.i(LOG_TAG, "1st activity " + statusName);
    }

    private void onButtonClick() {
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openSecondActivity();}
        });

    }

    private void openSecondActivity() {
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }


    @Override
    protected void onStart() {
        super.onStart();
        printStatus(":--------");
        printStatus(": onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printStatus(":--------");
        printStatus(": onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printStatus(":--------");
        printStatus(": OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printStatus(":--------");
        printStatus(": onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printStatus(":--------");
        printStatus(": onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printStatus(":--------");
        printStatus(": onDestroy");
    }
}