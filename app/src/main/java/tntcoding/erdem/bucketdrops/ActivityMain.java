package tntcoding.erdem.bucketdrops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ActivityMain extends AppCompatActivity {

    Toolbar mToolbar;
    Button btnAdd;
    private View.OnClickListener btnOncliclListener=new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Toast.makeText(ActivityMain.this, "Button clicked from anonymous event", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar=(Toolbar) findViewById(R.id.toolbar);
        btnAdd= (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(btnOncliclListener);
        setSupportActionBar(mToolbar);
        initBackgroundImage();
    }

    private void initBackgroundImage() {
        ImageView background=(ImageView) findViewById(R.id.iv_background);
        Glide.with(this)
                .load(R.drawable.background)
                .centerCrop()
                .into(background);
    }

}
