package com.hanzo.register;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

	@Bind(R.id.text) protected TextView text;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        
        text.setText("ButterKnife");
    }
}
