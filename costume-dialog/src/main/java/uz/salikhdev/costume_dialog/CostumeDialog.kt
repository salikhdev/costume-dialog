package uz.salikhdev.costume_dialog

import android.app.AlertDialog
import android.content.Context

object CostumeDialog {

    fun costumeDialog(context:Context , title: String , message:String){
        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setNegativeButton(android.R.string.no, null)
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show()
    }


}