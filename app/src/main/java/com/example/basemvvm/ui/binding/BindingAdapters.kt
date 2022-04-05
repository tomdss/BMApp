package com.example.basemvvm.ui.binding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

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

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun loadImage(view: ImageView, url: String?) {
        if (!url.isNullOrEmpty()) {
            Glide.with(view.context).load(url).into(view)
        }
    }

}