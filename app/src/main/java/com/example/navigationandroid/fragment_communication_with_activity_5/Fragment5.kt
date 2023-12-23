package com.example.navigationandroid.fragment_communication_with_activity_5

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.navigationandroid.R

class ConfirmationDialogFragment : DialogFragment() {

    private var listener: ConfirmationClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        listener = context as? ConfirmationClickListener
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setMessage(getString(R.string.dialog_message))
            .setPositiveButton(getString(R.string.dialog_positive)) { _, _ ->
                listener?.onPositiveButtonClicked()
            }
            .setNegativeButton(getString(R.string.dialog_negative)) { _, _ ->
                listener?.onNegativeButtonClicked()
            }
            .create()
}
