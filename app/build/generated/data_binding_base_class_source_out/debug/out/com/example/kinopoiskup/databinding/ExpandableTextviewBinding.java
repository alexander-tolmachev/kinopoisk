// Generated by view binder compiler. Do not edit!
package com.example.kinopoiskup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kinopoiskup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExpandableTextviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView expandableTv;

  @NonNull
  public final ConstraintLayout rootContainer;

  private ExpandableTextviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView expandableTv, @NonNull ConstraintLayout rootContainer) {
    this.rootView = rootView;
    this.expandableTv = expandableTv;
    this.rootContainer = rootContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExpandableTextviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExpandableTextviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.expandable_textview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExpandableTextviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expandable_tv;
      TextView expandableTv = ViewBindings.findChildViewById(rootView, id);
      if (expandableTv == null) {
        break missingId;
      }

      ConstraintLayout rootContainer = (ConstraintLayout) rootView;

      return new ExpandableTextviewBinding((ConstraintLayout) rootView, expandableTv,
          rootContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}