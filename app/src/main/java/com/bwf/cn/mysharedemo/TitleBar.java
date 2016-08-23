package com.bwf.cn.mysharedemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by BWF on 2016/8/12.
 */
public class TitleBar extends LinearLayout {
    private ImageView title_image;
    private TextView title_tv;
    public TitleBar(Context context) {
        this(context,null);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    public void init(Context context,AttributeSet attrs){
        View view = View.inflate(context,R.layout.titlebar,null);
         LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(params);
        addView(view);
        title_image = (ImageView)view.findViewById(R.id.title_image);
        title_tv = (TextView)view.findViewById(R.id.title_tv);
      if (attrs!=null){
            TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.titleBar);
            String setTitle = typedArray.getString(R.styleable.titleBar_setTitle);
            title_tv.setText(setTitle);
        }
    }

    public void setTitle(String title){
        title_tv.setText(title);
    }



}
