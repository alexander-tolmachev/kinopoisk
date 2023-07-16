// Generated by view binder compiler. Do not edit!
package com.example.kinopoiskup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kinopoiskup.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingsGenresBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView genresList;

  @NonNull
  public final TextInputLayout layout;

  @NonNull
  public final TextInputEditText searchGenres;

  private FragmentSettingsGenresBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView genresList, @NonNull TextInputLayout layout,
      @NonNull TextInputEditText searchGenres) {
    this.rootView = rootView;
    this.genresList = genresList;
    this.layout = layout;
    this.searchGenres = searchGenres;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingsGenresBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingsGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_settings_genres, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingsGenresBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.genres_list;
      RecyclerView genresList = ViewBindings.findChildViewById(rootView, id);
      if (genresList == null) {
        break missingId;
      }

      id = R.id.layout;
      TextInputLayout layout = ViewBindings.findChildViewById(rootView, id);
      if (layout == null) {
        break missingId;
      }

      id = R.id.searchGenres;
      TextInputEditText searchGenres = ViewBindings.findChildViewById(rootView, id);
      if (searchGenres == null) {
        break missingId;
      }

      return new FragmentSettingsGenresBinding((LinearLayout) rootView, genresList, layout,
          searchGenres);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}