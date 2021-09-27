package deneme.adnancalgin.pc.turistrehberi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ulkeler extends AppCompatActivity implements View.OnClickListener {

    ImageView turkey;
    ImageView germany;
    ImageView france;
    ImageView england;
    ImageView spain;
    ImageView america;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulkeler);

        turkey = (ImageView) findViewById(R.id.turkey);
        germany = (ImageView) findViewById(R.id.germany);
        france = (ImageView) findViewById(R.id.france);
        england = (ImageView) findViewById(R.id.england);
        spain = (ImageView) findViewById(R.id.spain);
        america = (ImageView) findViewById(R.id.america);

        turkey.setOnClickListener(this);
        germany.setOnClickListener(this);
        france.setOnClickListener(this);
        england.setOnClickListener(this);
        spain.setOnClickListener(this);
        america.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.turkey:
                startActivity(new Intent(this,Turkiye.class));

                break;
        }
    }
}
