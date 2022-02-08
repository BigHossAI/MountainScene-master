package cs301.birthdaycake;

import android.util.*;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView m_cakeView;
    private CakeModel m_cakeModel;

    public CakeController(CakeView cakeView){

        m_cakeView = cakeView;
        m_cakeModel = cakeView.getCakeModel();

    }


    @Override
    public void onClick(View view) {
        Log.d("BLOW OUT", "BLOW HARDER");

        m_cakeModel.isCandleLit = false;
        m_cakeView.invalidate();




    }
}


