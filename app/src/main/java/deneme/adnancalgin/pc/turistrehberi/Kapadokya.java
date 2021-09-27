package deneme.adnancalgin.pc.turistrehberi;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Kapadokya extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper flipper;
    ImageView ileri,geri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapadokya);

        flipper = findViewById(R.id.flipper);
        ileri = findViewById(R.id.ileri);
        geri = findViewById(R.id.geri);

        ileri.setOnClickListener(this);
        geri.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==ileri) {
            flipper.showNext();
        }

        else if (v==geri) {
            flipper.showPrevious();
        }
    }
}
