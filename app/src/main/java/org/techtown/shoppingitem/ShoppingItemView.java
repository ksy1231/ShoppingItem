package org.techtown.shoppingitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShoppingItemView extends LinearLayout {
    ImageView imageView;
    TextView nameTextView, priceTextView, explainTextView;

    public ShoppingItemView(Context context) {
        super(context);
        init(context);
    }

    public ShoppingItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.shopping_item, this, true);

        imageView = (ImageView) findViewById(R.id.imageView);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        priceTextView = (TextView)findViewById(R.id.priceTextView);
        explainTextView = (TextView) findViewById(R.id.explainTextView);
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }

    public void setName(String name) {
        nameTextView.setText(name);
    }

    public void setPrice(String price) {
        priceTextView.setText(price);
    }

    public void setExplain(String explain) {
        explainTextView.setText(explain);
    }
}
