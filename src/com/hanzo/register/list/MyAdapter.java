package com.hanzo.register.list;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.hanzo.register.R;
import com.hanzo.register.user.User;

class MyAdapter extends ArrayAdapter<User>{
	
	private List<User> users;
	private Context context;

	public MyAdapter(Context context, List<User> users) {
		super(context, R.layout.activity_list, users);
		this.context = context;
		this.users = users;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		final View layout = convertView != null ?
				convertView : this.inflarItemLayout(parent);
		
		final ViewHolder viewHolder = convertView != null ? 
				(ViewHolder) convertView.getTag() : createViewHolder(layout);
				
		User user = users.get(position);
		viewHolder.fullName.setText(user.getFullName());
		
		return layout;
	}
	
	private ViewHolder createViewHolder(View layout) {
		ViewHolder viewHolder = new ViewHolder(layout);
		layout.setTag(viewHolder);
		return viewHolder;
	}

	private View inflarItemLayout(final ViewGroup parent) {
		final LayoutInflater layout = (LayoutInflater) this.context
				.getSystemService(LAYOUT_INFLATER_SERVICE);
		return layout.inflate(R.layout.list_item, parent, false);
	}
	
	static class ViewHolder { 
	    
		@Bind(R.id.text) TextView fullName;
	    
	    public ViewHolder(View v) {
	    	ButterKnife.bind(this, v);
		}
	    
	} 
}
