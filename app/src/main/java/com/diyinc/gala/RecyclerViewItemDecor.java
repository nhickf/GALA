package com.diyinc.gala;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewItemDecor extends RecyclerView.ItemDecoration {

    private Context context;

    public RecyclerViewItemDecor(Context context) {
        this.context = context;
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int actionBarHeight = 0;

        if (parent.getChildAdapterPosition(view) == parent.getAdapter().getItemCount() - 1) {

            TypedValue tv = new TypedValue();
            if (context.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true))
            {
                actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,context.getResources().getDisplayMetrics());
            }
            outRect.bottom = actionBarHeight;
        }
    }
}
