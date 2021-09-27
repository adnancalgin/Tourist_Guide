package deneme.adnancalgin.pc.turistrehberi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Turkiye extends AppCompatActivity implements View.OnClickListener {


    ScrollView scrollView;
    ImageView kapadokya;
    ImageView pamukkale;
    ImageView ayasofya;
    ImageView sultanahmet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkiye);

        kapadokya = (ImageView) findViewById(R.id.kapadokya);
        pamukkale = (ImageView) findViewById(R.id.pamukkale);
        scrollView = findViewById(R.id.scrollView);
        ayasofya = findViewById(R.id.ayasofya);
        sultanahmet = findViewById(R.id.sultanahmet);


        kapadokya.setOnClickListener(this);
        pamukkale.setOnClickListener(this);
        ayasofya.setOnClickListener(this);
        sultanahmet.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.kapadokya:

                startActivity(new Intent(this,Kapadokya.class));

                break;

            case R.id.pamukkale:

                startActivity(new Intent(this,Pamukkale.class));

                break;

            case R.id.ayasofya:

                startActivity(new Intent(this,Ayasofya.class));

                break;

            case R.id.sultanahmet:

                startActivity(new Intent(this,Sultanahmet.class));

                break;

        }
    }
}
