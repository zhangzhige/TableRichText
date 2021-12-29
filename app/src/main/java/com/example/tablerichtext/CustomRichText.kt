package com.example.tablerichtext

import android.content.Context
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.core.text.HtmlCompat

class CustomRichText(override val context: Context, public override val source: String) :
    TypeRichView(context, source) {

    override fun getRenderView(
        flags: Int,
        imageGetter: Html.ImageGetter?,
        tagHandler: Html.TagHandler?
    ): View {
        return TextView(context).apply {
            this.text = HtmlCompat.fromHtml(
                source,
                flags,
                imageGetter,
                tagHandler
            )
            this.movementMethod = LinkMovementMethod.getInstance()
        }
    }
}