// Generated by view binder compiler. Do not edit!
package com.example.kinopoiskup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kinopoiskup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MovieItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView button;

  @NonNull
  public final TextView genres;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final AppCompatImageView poster;

  @NonNull
  public final FrameLayout share;

  @NonNull
  public final TextView title;

  private MovieItemBinding(@NonNull LinearLayout rootView, @NonNull TextView button,
      @NonNull TextView genres, @NonNull ImageView icon, @NonNull AppCompatImageView poster,
      @NonNull FrameLayout share, @NonNull TextView title) {
    this.rootView = rootView;
    this.button = button;
    this.genres = genres;
    this.icon = icon;
    this.poster = poster;
    this.share = share;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.movie_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MovieItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      TextView button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.genres;
      TextView genres = ViewBindings.findChildViewById(rootView, id);
      if (genres == null) {
        break missingId;
      }

      id = R.id.icon;
      ImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.poster;
      AppCompatImageView poster = ViewBindings.findChildViewById(rootView, id);
      if (poster == null) {
        break missingId;
      }

      id = R.id.share;
      FrameLayout share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new MovieItemBinding((LinearLayout) rootView, button, genres, icon, poster, share,
          title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
