package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(context: Context, fonts: Array<int>) : BaseAdapter() {

    private val fontSizes = fonts;
    private val con = context;

    override fun getCount(): Int {
        return fontSizes.size;
    }

    override fun getItem(position: Int): Any {
        return fontSizes[position];
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context);
        textView.textSize = fontSizes[position];
        textView.setPadding(5, 10, 0, 10);
        return textView;
    }

}