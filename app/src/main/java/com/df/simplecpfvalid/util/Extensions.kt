package com.df.simplecpfvalid.util
import android.app.Activity
import android.widget.Toast

fun Activity.toastShort(text : String ){
    Toast.makeText( this , text , Toast.LENGTH_SHORT ).show()
}

fun Activity.toastLong(text : String ){
    Toast.makeText( this , text , Toast.LENGTH_LONG ).show()
}
