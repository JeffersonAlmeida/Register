package com.hanzo.register.list;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.hanzo.register.R;
import com.hanzo.register.db.DataBase;
import com.hanzo.register.user.User;

public class ListActivity
extends Activity implements OnItemClickListener{
	
	@Bind(R.id.list) protected ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		ButterKnife.bind(this);
		
		DataBase dataBase = new DataBase();
		List<User> users = dataBase.getUserDao().listar();
		
		MyAdapter adapter = new MyAdapter(this, users);
		list.setAdapter(adapter);
		list.setOnItemClickListener(this);
		
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		User user = (User) list.getItemAtPosition(position);
		Toast.makeText(this, user.toStr(), Toast.LENGTH_LONG).show();
	}

}
