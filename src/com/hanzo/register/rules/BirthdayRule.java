package com.hanzo.register.rules;

import android.content.Context;
import android.view.View;

import com.hanzo.register.R;
import com.mobsandgeeks.saripaar.QuickRule;

public class BirthdayRule extends QuickRule<View> {

	@Override
	public boolean isValid(View view) {
		return true;
	}

	@Override
	public String getMessage(Context context) {
		return context.getResources().getString(R.string.invalid);
	}

}
