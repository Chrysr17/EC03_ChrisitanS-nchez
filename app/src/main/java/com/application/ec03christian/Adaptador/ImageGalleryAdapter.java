package com.application.ec03christian.Adaptador;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.application.ec03christian.R;

public class ImageGalleryAdapter extends BaseAdapter {

        private Context mContext;
        public int [] imagesArray={
                R.drawable.pc1,
                R.drawable.pc2,
                R.drawable.pc3,
                R.drawable.pc4,
                R.drawable.pc5,
                R.drawable.pc6,
                R.drawable.pc7,
                R.drawable.pc8,
                R.drawable.pc9,
                R.drawable.pc10,
                R.drawable.pc11,
                R.drawable.pc12
        };

        public ImageGalleryAdapter(Context mContext) {
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return imagesArray.length;
        }

        @Override
        public Object getItem(int i) {
            return imagesArray[i];
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            ImageView imageView= new ImageView(mContext);
            imageView.setImageResource(imagesArray[i]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(
                    new ViewGroup.LayoutParams(
                            500,
                            500
                    ));

            return imageView;
        }
    }

