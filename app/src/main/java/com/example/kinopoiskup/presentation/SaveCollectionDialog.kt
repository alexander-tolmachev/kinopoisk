package com.example.kinopoiskup.presentation

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import com.example.kinopoiskup.R
import com.google.android.material.snackbar.Snackbar


class SaveCollectionDialog : DialogFragment() {
    private var entry: EditText? = null
    private var closeButton: ImageView? = null
    private var positiveButton: Button? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity, R.style.DialogStyle)
        val inflater: LayoutInflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.save_dialog, null)
        positiveButton = view.findViewById(R.id.button)
        closeButton = view.findViewById(R.id.close_button)
        entry = view.findViewById(R.id.edit_dialog)
        closeButton?.setOnClickListener {
            dialog?.dismiss()
        }

        builder.setView(view)
        return builder.create()
    }


    override fun onResume() {
        super.onResume()
        val d = dialog as AlertDialog?
        if (d != null) {

            positiveButton?.setOnClickListener(object : DialogInterface.OnClickListener,
                View.OnClickListener {

                override fun onClick(p0: View?) {
                    var wantToCloseDialog = false

                    if (entry!!.text.isEmpty()) {
                        Toast.makeText(
                            activity,
                            "Придумайте название для этой коллекции",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        val result = entry!!.text.toString()
                        setFragmentResult("requestKey", bundleOf("bundleKey" to result))
                        wantToCloseDialog = true
                    }
                    if (wantToCloseDialog) d.dismiss()
                }

                override fun onClick(p0: DialogInterface?, p1: Int) {
                }
            })
        }
    }
}