// Generated code from Butter Knife. Do not modify!
package com.hanzo.register.list;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListActivity$$ViewBinder<T extends com.hanzo.register.list.ListActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296256, "field 'list'");
    target.list = finder.castView(view, 2131296256, "field 'list'");
  }

  @Override public void unbind(T target) {
    target.list = null;
  }
}
