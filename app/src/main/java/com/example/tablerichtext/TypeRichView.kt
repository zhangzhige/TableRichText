package com.example.tablerichtext

import android.content.Context
import android.text.Html
import android.view.View

abstract class TypeRichView(protected open val context: Context, public open val source: String) {
    abstract fun getRenderView(
        flags: Int,
        imageGetter: Html.ImageGetter?,
        tagHandler: Html.TagHandler?
    ) : View
}