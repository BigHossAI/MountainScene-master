package cs301.birthdaycake;

public class CakeController {

    private CakeView m_cakeView;
    private CakeModel m_cakeModel;

    public CakeController(CakeView cakeView){

        m_cakeView = cakeView;
        m_cakeModel = cakeView.getCakeModel();

    }

}


