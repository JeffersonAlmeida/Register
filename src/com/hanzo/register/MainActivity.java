package com.hanzo.register;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.hanzo.json.FromJson;
import com.hanzo.json.JsonDownloader;
import com.hanzo.register.model.Field;

public class MainActivity extends 
Activity implements JsonDownloader.OnTaskCompleted {

	@Bind(R.id.text1) protected TextView text1;
	private List<Field> fields;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        JsonDownloader download = new JsonDownloader(this, this);
        download.execute();
    }

	@Override
	public void onTaskCompleted(String json) {
		convertJson(json);
	}

	private void convertJson(String json) {
		this.fields = new FromJson().toFields(json);
		this.text1.setText(this.fields.toString());
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}
    
}
