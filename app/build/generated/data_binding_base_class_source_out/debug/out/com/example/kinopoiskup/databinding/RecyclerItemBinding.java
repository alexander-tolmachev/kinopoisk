// Generated by view binder compiler. Do not edit!
package com.example.kinopoiskup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kinopoiskup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton button;

  @NonNull
  public final RecyclerView podsList;

  @NonNull
  public final TextView text;

  @NonNull
  public final TextView textLeft;

  @NonNull
  public final TextView textRight;

  private RecyclerItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton button,
      @NonNull RecyclerView podsList, @NonNull TextView text, @NonNull TextView textLeft,
      @NonNull TextView textRight) {
    this.rootView = rootView;
    this.button = button;
    this.podsList = podsList;
    this.text = text;
    this.textLeft = textLeft;
    this.textRight = textRight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      ImageButton button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.pods_list;
      RecyclerView podsList = ViewBindings.findChildViewById(rootView, id);
      if (podsList == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      id = R.id.textLeft;
      TextView textLeft = ViewBindings.findChildViewById(rootView, id);
      if (textLeft == null) {
        break missingId;
      }

      id = R.id.textRight;
      TextView textRight = ViewBindings.findChildViewById(rootView, id);
      if (textRight == null) {
        break missingId;
      }

      return new RecyclerItemBinding((ConstraintLayout) rootView, button, podsList, text, textLeft,
          textRight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
