package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener {

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

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(!fromUser) return;
        Log.d("On Progress Change", "Progress Changed");
        if (progress == 0) {
            this.cakeModel.candlesOnCake = 0;
        }
        else if (progress == 1) {
            this.cakeModel.candlesOnCake = 1;
        }
        else if (progress == 2) {
            this.cakeModel.candlesOnCake = 2;
        }
        else if (progress == 3) {
            this.cakeModel.candlesOnCake = 3;
        }
        else if (progress == 4) {
            this.cakeModel.candlesOnCake = 4;
        }
        else if (progress == 5) {
            this.cakeModel.candlesOnCake = 5;
        }
        this.cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // do nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // do nothing
    }
}
