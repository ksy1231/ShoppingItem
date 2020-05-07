package org.techtown.shoppingitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ShoppingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        adapter = new ShoppingAdapter();

        adapter.addItem(new ShoppingItem(R.drawable.icons8_jacket_96, "Jacket",
                                        "$39.99", "Special deal"));
        adapter.addItem(new ShoppingItem(R.drawable.icons8_shirt_96, "Shirt",
                                        "$19.99", "Manager's special"));
        adapter.addItem(new ShoppingItem(R.drawable.icons8_children_shoes_96, "Shoes",
                                        "$49.99", "Featured item"));
        adapter.addItem(new ShoppingItem(R.drawable.icons8_bag_96, "Bag",
                                        "$29.99", "Special deal"));

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ShoppingItem item = (ShoppingItem) adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "Name: " + item.getName()
                                + "\nPrice: " + item.getPrice(), Toast.LENGTH_LONG).show();
            }
        });
    }

    class ShoppingAdapter extends BaseAdapter {
        ArrayList<ShoppingItem> items = new ArrayList<ShoppingItem>();

        public void addItem(ShoppingItem item) {
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ShoppingItemView view = new ShoppingItemView(getApplicationContext());
            ShoppingItem item = items.get(position);
            view.setImage(item.getResId());
            view.setName(item.getName());
            view.setPrice(item.getPrice());
            view.setExplain(item.getExplain());

            return view;
        }
    }
}
