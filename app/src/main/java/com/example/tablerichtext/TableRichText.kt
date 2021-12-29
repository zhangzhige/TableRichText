package com.example.tablerichtext

import android.content.Context
import android.text.Html
import android.view.View

class TableRichText(override val context: Context, override val source: String) :
    TypeRichView(context, source) {

    override fun getRenderView(
        flags: Int,
        imageGetter: Html.ImageGetter?,
        tagHandler: Html.TagHandler?
    ): View {
        return RichTableLayout(context).apply {
            this.renderView(source, flags, imageGetter, tagHandler)
        }
    }
}