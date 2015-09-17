package com.hanzo.register.ui;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.hanzo.register.json.model.Field;
import com.hanzo.register.rules.PasswordRule;
import com.hanzo.register.rules.RuleManager;


public class Password extends UIElement {

	public Password(Context context, Field field) {
		super(context, field);
	}
	
	@Override
	public View build() {
		EditText editText = buidEditText();
		addRules(editText);
		configure(editText);
		addComponent(editText);
		return getLayout();
	}
	
	@Override
	protected void addRules(View view){
		super.addRules(view);
		RuleManager ruleManager = RuleManager.get();
		ruleManager.addRule(view, new PasswordRule());
	}

	private EditText configure(EditText editText) {
		super.configure(editText);
		editText.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
		return editText;
	}

	private EditText buidEditText() {
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
				(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

		EditText editText = new EditText(context);
		editText.setLayoutParams(layoutParams);
		return editText;
	}
	
}
