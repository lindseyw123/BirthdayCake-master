package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.Switch;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        // reference to CakeView object
        CakeView cakeView = findViewById(R.id.cakeview);
        // make controller object
        CakeController cakeController = new CakeController(cakeView);
        // reference to "Blow out" button
        Button blowOutButton = findViewById(R.id.button);
        // set on click listener for button
        blowOutButton.setOnClickListener(cakeController);
        // reference to "Candles" switch
        Switch candlesSwitch = findViewById(R.id.switch2);
        // set on checked change listener for switch
        candlesSwitch.setOnCheckedChangeListener(cakeController);
        // reference to "How many candles?" seek bar
        SeekBar howManyCandlesSeekBar = findViewById(R.id.seekBar);
        // set on seek bar change listener for how many candles
        howManyCandlesSeekBar.setOnSeekBarChangeListener(cakeController);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
