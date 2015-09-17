// Generated code from Butter Knife. Do not modify!
package com.hanzo.register.list;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MyAdapter$ViewHolder$$ViewBinder<T extends com.hanzo.register.list.MyAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296259, "field 'fullName'");
    target.fullName = finder.castView(view, 2131296259, "field 'fullName'");
  }

  @Override public void unbind(T target) {
    target.fullName = null;
  }
}
