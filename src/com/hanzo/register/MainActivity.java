package com.hanzo.register;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.hanzo.json.FromJson;
import com.hanzo.json.JsonDownloader;
import com.hanzo.register.db.DataBase;
import com.hanzo.register.db.UserDao;
import com.hanzo.register.model.Field;
import com.hanzo.register.user.User;

public class MainActivity extends 
Activity implements JsonDownloader.OnTaskCompleted {

	@Bind(R.id.text1) protected TextView text1;
	private List<Field> fields;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /*JsonDownloader download = new JsonDownloader(this, this);
        download.execute();*/
        
        DataBase db = new DataBase();
        UserDao userDao = db.getUserDao();
        
        User user = new User.Builder().id(1).fullName("tesete").cpf("edicao").state("MG").build();
		//userDao.inserir(user );
		
		//userDao.editar(user);
        
        User carregar = userDao.carregar((long) 1);
        text1.setText(carregar.toString());
        
        /*userDao.remover(new User.Builder().id((long) 1).build());
        userDao.remover(new User.Builder().id((long) 2).build());
*/        
		/*List<User> listar = userDao.listar();
		text1.setText(listar.toString());*/
        
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
