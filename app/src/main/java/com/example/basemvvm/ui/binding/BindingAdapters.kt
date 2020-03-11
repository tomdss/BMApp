package com.example.basemvvm.ui.binding

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Data Binding adapters specific to the app.
 * for more detail: https://developer.android.com/topic/libraries/data-binding/binding-adapters
 */
object BindingAdapters {
    @JvmStatic
    @BindingAdapter("visibleGone")
    fun showHide(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.GONE
    }
}