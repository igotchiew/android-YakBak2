package igotchiew.com.yakbak2;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnTouchListener {

    private ImageButton purpleImageBtn;
    private ImageButton blueImageBtn;
    private ImageButton greenImageBtn;
    private ImageButton orangeImageBtn;

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        purpleImageBtn = (ImageButton) findViewById(R.id.purpleImageBtn);
        blueImageBtn = (ImageButton) findViewById(R.id.blueImageBtn);
        greenImageBtn = (ImageButton) findViewById(R.id.greenImageBtn);
        orangeImageBtn = (ImageButton) findViewById(R.id.orangeImageBtn);

        purpleImageBtn.setOnTouchListener(this);
        blueImageBtn.setOnTouchListener(this);
        greenImageBtn.setOnTouchListener(this);
        orangeImageBtn.setOnTouchListener(this);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        //purple
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (v.getId() == R.id.purpleImageBtn) {
                mp = MediaPlayer.create(this, R.raw.curb_theme);
                mp.start();
            }
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            if (v.getId() == R.id.purpleImageBtn) {
                if (mp != null) ;
                mp.stop();
                mp.release();
                mp = null;
            }
        }
        //blue
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (v.getId() == R.id.blueImageBtn) {
                mp = MediaPlayer.create(this, R.raw.seinfeld_theme);
                mp.start();
            }
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            if (v.getId() == R.id.blueImageBtn) {
                if (mp != null) ;
                mp.stop();
                mp.release();
                mp = null;
            }
        }
        //green
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (v.getId() == R.id.greenImageBtn) {
                mp = MediaPlayer.create(this, R.raw.jeopardy);
                mp.start();
            }
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            if (v.getId() == R.id.greenImageBtn) {
                if (mp != null) ;
                mp.stop();
                mp.release();
                mp = null;
            }
        }
        //orange
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (v.getId() == R.id.orangeImageBtn) {
                mp = MediaPlayer.create(this, R.raw.turn_down_for_what);
                mp.start();
            }
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            if (v.getId() == R.id.orangeImageBtn) {
                if (mp != null) ;
                mp.stop();
                mp.release();
                mp = null;
            }
        }
        return false;

    }
}