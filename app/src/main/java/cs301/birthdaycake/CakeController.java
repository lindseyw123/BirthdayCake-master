package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeView) {
        this.cakeView = cakeView;
        this.cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("On Click", "Clicked");
        this.cakeModel.candlesLit = false;
        this.cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("On Change", "Changed");
        if (b == false) {
            this.cakeModel.hasCandles = false;
        }
        else {
            // cake has candles
        }
        this.cakeView.invalidate();
    }
}
