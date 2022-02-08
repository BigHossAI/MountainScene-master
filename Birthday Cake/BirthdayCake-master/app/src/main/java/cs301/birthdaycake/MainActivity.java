package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cake;
        cake = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cake);

        Button buttonView = findViewById(R.id.button2);
        buttonView.setOnClickListener(cakeController);

        Switch candleView = findViewById(R.id.switch1);
        candleView.setOnCheckedChangeListener(cakeController);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(cakeController);

    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
        finishAffinity();

    }
}
