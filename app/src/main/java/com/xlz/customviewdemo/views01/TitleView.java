package com.xlz.customviewdemo.views01;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.xlz.customviewdemo.R;

/**
 * Created by xianglongzhou on 2017/5/29.
 */

public class TitleView extends View{
    private String mTitleText;
    private int mTitleColor;
    private int mTitleTextSize;

    public TitleView(Context context) {
        super(context,null);
    }

    public TitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TitleView,defStyleAttr,0);
        int count = a.getIndexCount();
        for(int i=0; i<count; i++){
            int attr = a.getIndex(i);
            switch (attr){
                case R.styleable.TitleView_titleText:
                mTitleText = a.getString(attr);
                break;

                case R.styleable.TitleView_titleSize:
                    mTitleTextSize = a.getDimensionPixelSize(attr,);
                    break;
            }
        }
    }


}
