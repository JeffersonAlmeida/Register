// Generated code from Butter Knife. Do not modify!
package com.hanzo.register;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.hanzo.register.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296257, "field 'linearLayout'");
    target.linearLayout = finder.castView(view, 2131296257, "field 'linearLayout'");
  }

  @Override public void unbind(T target) {
    target.linearLayout = null;
  }
}
