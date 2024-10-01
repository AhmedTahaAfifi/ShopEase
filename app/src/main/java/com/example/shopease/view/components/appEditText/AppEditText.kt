package com.example.shopease.view.components.appEditText

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ViewDataBinding
import com.example.shopease.R
import com.example.shopease.utils.extensions.getIntDimension

class AppEditText: AppCompatEditText {

    private val viewDataBinding: ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.app_edit_text, null, false)
    val textInput = ObservableField<String>()

    constructor(context: Context): super(context) {
        this.setupAppEditText()
    }

    constructor(context: Context, attrs: AttributeSet?): super(context, attrs) {
        this.setupAppEditText()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        this.setupAppEditText()
    }

    private fun setupAppEditText() {
        this.inputType = InputType.TYPE_CLASS_TEXT
        this.height = this.getIntDimension(R.dimen.app_editText_field_height)
        this.background = ContextCompat.getDrawable(context, R.drawable.background_edit_text_field)
    }

}