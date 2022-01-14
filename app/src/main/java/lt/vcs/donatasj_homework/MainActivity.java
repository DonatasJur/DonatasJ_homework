package lt.vcs.donatasj_homework;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "log_main_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printStatus("--------");
        printStatus("onCreate");
        setUP();
    }
    private void setUP(){
        setContentView(R.layout.activity_main);
    }


    private void printStatus(String statusName) {
        Log.i(LOG_TAG, "1st activity " + statusName);

    }

    @Override
    protected void onStart() {
        super.onStart();
        printStatus("--------");
        printStatus("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printStatus("--------");
        printStatus("onResume");
    }

}