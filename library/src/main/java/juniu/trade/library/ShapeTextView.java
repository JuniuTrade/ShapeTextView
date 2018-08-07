package juniu.trade.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import lyd.github.library.ColorSquareDrawable;

/**
 * @author lyd
 * @date 18/8/7
 * @desription
 */
public class ShapeTextView extends AppCompatTextView {


    public ShapeTextView(Context context) {
        super(context);
        init(null);
    }

    public ShapeTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ShapeTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            initAttrs(attrs);
        }
    }

    @SuppressLint("ResourceType")
    private void initAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ShapeTextView);
        float bottomLeftRadius = typedArray.getFloat(R.styleable.ShapeTextView_bottom_left_radius, 0);
        float bottomRightRadius = typedArray.getFloat(R.styleable.ShapeTextView_bottom_right_radius, 0);
        float topLeftRadius = typedArray.getFloat(R.styleable.ShapeTextView_top_left_radius, 0);
        float topRightRadius = typedArray.getFloat(R.styleable.ShapeTextView_top_right_radius, 0);
        float radius = typedArray.getFloat(R.styleable.ShapeTextView_radius, 0);
        int color = typedArray.getColor(R.styleable.ShapeTextView_background_color, ContextCompat.getColor(getContext(), android.R.color.transparent));
        if (radius != 0) {
            setBackground(color, radius);
        } else {
            setBackground(color, topLeftRadius, topRightRadius, bottomRightRadius, bottomLeftRadius);
        }
        typedArray.recycle();
    }

    /**
     * 设置背景图案
     *
     * @param color
     * @param topLeftRadius
     * @param topRightRadius
     * @param bottomRightRadius
     * @param bottomLeftRadius
     */
    public void setBackground(int color, float topLeftRadius, float topRightRadius, float bottomRightRadius, float bottomLeftRadius) {
        ColorSquareDrawable drawable = new ColorSquareDrawable(color, topLeftRadius, topRightRadius, bottomRightRadius, bottomLeftRadius);
        setBackground(drawable);
    }

    /**
     * 设置背景图案
     *
     * @param color
     * @param radius
     */
    public void setBackground(int color, float radius) {
        setBackground(color, radius, radius, radius, radius);
    }
}
