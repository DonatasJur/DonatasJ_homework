package lt.vcs.donatasj_homework;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondViewActivity extends AppCompatActivity {

    Button myButton;
    private static final String LOG_TAG = "log_2nd_activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
        printStatus(":----------");
        printStatus(": onCreate");

    }

    private void setupUI() {
        setContentView(R.layout.activity_second);
        myButton = findViewById(R.id.buttonTwo);
        onButtonClick();
    }


    private void printStatus(String statusName) {
        Log.i(LOG_TAG, "2nd activity " + statusName);
    }

    private void onButtonClick() {
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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
