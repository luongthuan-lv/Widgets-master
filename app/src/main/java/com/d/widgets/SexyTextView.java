package com.d.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

public class SexyTextView extends AppCompatTextView {

    public SexyTextView(Context context) {
        super(context);
        setFont(context);
    }

    public SexyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setFont(context);
    }

    public SexyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setFont(context);
    }

    public void setFont(Context context) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/personal_sign.ttf");
        setTypeface(typeface);
    }


}
