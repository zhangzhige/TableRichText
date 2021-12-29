package com.example.tablerichtext.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import com.example.tablerichtext.HtmlTextView
import com.example.tablerichtext.R

class MainActivity : AppCompatActivity() {

    var html =
        "<ul class=\" list-paddingleft-2\" style=\"width: 1073.5px; white-space: normal;\">\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            xcxvxcvxcvxcvxcxcvvxcvcv\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            xcv\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            xcvsd\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            sd\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            sdg\n" +
                "        </p>\n" +
                "    </li>\n" +
                "</ul>\n" +
                "<table width=\"1114\">\n" +
                "    <caption style=\"border-color: rgb(192, 0, 0);\">\n" +
                "        标题1<br/>\n" +
                "    </caption>\n" +
                "    <thead>\n" +
                "        <tr class=\"firstRow\">\n" +
                "            <th valign=\"null\" style=\"border-color: rgb(192, 0, 0); background-color: rgb(227, 108, 9);\" width=\"278\">\n" +
                "                <p>\n" +
                "                    标题二\n" +
                "                </p>\n" +
                "            </th>\n" +
                "            <th style=\"border-color: rgb(192, 0, 0); background-color: rgb(0, 176, 80);\" width=\"278\">\n" +
                "                标题三\n" +
                "            </th>\n" +
                "            <th style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                标题四\n" +
                "            </th>\n" +
                "            <th style=\"border-color: rgb(192, 0, 0);\" width=\"279\">\n" +
                "                标题五\n" +
                "            </th>\n" +
                "        </tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" +
                "        <tr>\n" +
                "            <th valign=\"null\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                标题六\n" +
                "            </th>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                123\n" +
                "            </td>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                355\n" +
                "            </td>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"279\">\n" +
                "                3455\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <th valign=\"null\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                标题七\n" +
                "            </th>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                qq444\n" +
                "            </td>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                3334qq\n" +
                "            </td>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"279\">\n" +
                "                1334\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <th valign=\"null\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                标题八\n" +
                "            </th>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                qqqq1\n" +
                "            </td>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"278\">\n" +
                "                qqq14\n" +
                "            </td>\n" +
                "            <td valign=\"top\" style=\"border-color: rgb(192, 0, 0);\" width=\"279\">\n" +
                "                qqq3\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </tbody>\n" +
                "</table>\n" +
                "<ul class=\" list-paddingleft-2\" style=\"list-style-type: disc;\">\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            xcxvxcvxcvxcvxcxcvvxcvcv\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            xcv\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            xcvsd\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            sd\n" +
                "        </p>\n" +
                "    </li>\n" +
                "    <li>\n" +
                "        <p>\n" +
                "            sdg<br/>\n" +
                "        </p>\n" +
                "    </li>\n" +
                "</ul>"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.findViewById<HtmlTextView>(R.id.htmlTextView)
            .setHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY, null, null)
    }
}