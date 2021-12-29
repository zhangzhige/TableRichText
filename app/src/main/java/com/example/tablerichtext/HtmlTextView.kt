package com.example.tablerichtext

import android.content.Context
import android.text.Html
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup
import android.widget.LinearLayout
import java.util.regex.Matcher
import java.util.regex.Pattern

class HtmlTextView : LinearLayout {

    companion object {
        const val TAG = "HtmlTextView"
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?) : super(context)

    init {
        orientation = VERTICAL
    }

    private val richList = mutableListOf<TypeRichView>()

    fun setHtml(
        source: String,
        flags: Int,
        imageGetter: Html.ImageGetter?,
        tagHandler: Html.TagHandler?
    ) {
        richList.clear()
        removeAllViews()
        val p: Pattern = Pattern.compile("<table[\\s\\S]*?</table>")
        val m: Matcher = p.matcher(source)
        var start = 0

        while (m.find()) {
            if (m.start() == start) {
                richList.add(TableRichText(context, source.substring(m.start(), m.end())))
            } else {
                richList.add(CustomRichText(context, source.substring(start, m.start())))
                richList.add(TableRichText(context, source.substring(m.start(), m.end())))
            }
            start = m.end()
        }
        if (start != source.length - 1) {
            richList.add(CustomRichText(context, source.substring(start)))
        }
        richList.forEach {
            Log.d(TAG, "html=${it.source}")
            addView(
                it.getRenderView(flags, imageGetter, tagHandler),
                LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            )
        }
    }

}