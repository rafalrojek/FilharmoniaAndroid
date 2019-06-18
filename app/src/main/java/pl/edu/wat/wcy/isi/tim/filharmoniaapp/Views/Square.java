package pl.edu.wat.wcy.isi.tim.filharmoniaapp.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;

public class Square extends TableLayout {
    public Square(Context context) {
        super(context);
    }

    public Square(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        final int width = getMeasuredWidth();
        setMeasuredDimension(width,width);
    }
}
