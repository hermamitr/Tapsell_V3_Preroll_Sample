package ir.tapsell.samplev3preroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.nexage.sourcekit.vast.VASTPlayer;

import ir.tapsell.sdk.Tapsell;
import ir.tapsell.sdk.vast.TapsellVast;

public class MainActivity extends AppCompatActivity implements VASTPlayer.VASTPlayerListener{

    VASTPlayer vastPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tapsell.initialize(MainActivity.this,"ctdfiktagpkrldtcmltepobendhrbhtcpoahnecajlmcbattranjoengrnptksjastpeea");
        vastPlayer = new VASTPlayer(MainActivity.this, MainActivity.this);

        findViewById(R.id.btnShow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vastPlayer.loadVideoWithUrl(TapsellVast.getVastUrl(MainActivity.this,"58b284904684651bf8196cbc",TapsellVast.PREROLL_TYPE_SHORT,TapsellVast.VAST_VERSION_3));
            }
        });
    }

    @Override
    public void vastReady() {
        vastPlayer.play();
    }

    @Override
    public void vastError(int error) {

    }

    @Override
    public void vastClick() {

    }

    @Override
    public void vastComplete() {

    }

    @Override
    public void vastDismiss() {

    }
}
