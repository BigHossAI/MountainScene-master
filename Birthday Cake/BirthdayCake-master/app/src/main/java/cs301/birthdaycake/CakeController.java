package cs301.birthdaycake;

import android.util.*;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView m_cakeView;
    private CakeModel m_cakeModel;

    public CakeController(CakeView cakeView){

        m_cakeView = cakeView;
        m_cakeModel = cakeView.getCakeModel();

    }


    @Override
    public void onClick(View view) {
        Log.d("BLOW OUT", "GET LIT");
        Button getLitButton = (Button) view;


        m_cakeModel.isCandleLit = !(m_cakeModel.isCandleLit);
        m_cakeView.invalidate();
        if(m_cakeModel.isCandleLit) {
            getLitButton.setText("BLOW OUT");
        }
        else{
            getLitButton.setText("GET LIT");
        }




    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        m_cakeModel.isCandleOn = !(m_cakeModel.isCandleOn);
        m_cakeView.invalidate();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        m_cakeModel.numCandles = i;
        m_cakeView.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}


