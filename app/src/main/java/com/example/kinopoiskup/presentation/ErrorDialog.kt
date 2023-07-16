package com.example.kinopoiskup.presentation


import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.example.kinopoiskup.R


class ErrorDialog : DialogFragment() {
    private var closeButton: ImageView? = null
    private val viewModel: MainViewModel by activityViewModels()

    override fun onDismiss(dialog: DialogInterface) {
        viewModel.isNetworkErrorShow = true
        super.onDismiss(dialog)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder: AlertDialog.Builder = AlertDialog.Builder(activity,R.style.ErrorDialogStyle)
        val inflater: LayoutInflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.error_dialog, null)

        closeButton = view.findViewById(R.id.close_button)
        closeButton?.setOnClickListener {
            viewModel.isNetworkErrorShow = true
            dialog?.dismiss() }
        builder.setCancelable(false)
        builder.setView(view)
        return builder.create()
    }


   }