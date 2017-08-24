package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class Practice07AfterDrawView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice07AfterDrawView(Context context) {
        super(context);
    }

    public Practice07AfterDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice07AfterDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    /**
     * draw() 是绘制过程的总调度方法。一个 View 的整个绘制过程都发生在 draw() 方法里。
     * 前面讲到的背景、主体、子 View 、滑动相关以及前景的绘制，它们其实都是在 draw() 方法里的
     * public void draw(Canvas canvas) {
     * ...
     * drawBackground(Canvas); // 绘制背景（不能重写）
     * onDraw(Canvas); // 绘制主体
     * dispatchDraw(Canvas); // 绘制子 View
     * onDrawForeground(Canvas); // 绘制滑动相关和前景
     * ...
     * }
     *
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        // 在 super.draw() 的下方插入绘制代码，让绘制内容盖住其他所有
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        paint.setColor(Color.parseColor("#f44336"));
        canvas.drawRect(0, 40, 200, 120, paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("New", 20, 100, paint);
    }
}