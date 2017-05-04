package com.example.gowthamg.listviewtries;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayList<Bitmap> bitmapArray = new ArrayList<Bitmap>();
    Bitmap b;

    String[] d = {"Mr.360", "the palti hit", "Mr.cricket", "Captain Cool", "The Wall", "The Fighter"};
    Integer[] IMAGES = {R.drawable.abd, R.drawable.kp, R.drawable.hussey, R.drawable.dhoni, R.drawable.dravid, R.drawable.yuvi};

    String[] h = {"abd", "kp", "hussey", "dhoni", "dravid", "yuvi"};
    //first change

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView) findViewById(R.id.myListView);



        // CustomList adapter = new CustomList(this, d,IMAGES,h);
        ImageDownload load = new ImageDownload();
        load.download();

        bitmapArray.add(b);bitmapArray.add(b);bitmapArray.add(b);bitmapArray.add(b);bitmapArray.add(b);bitmapArray.add(b);


        customlist2 adapter = new customlist2(this, d, IMAGES, h,bitmapArray);


        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + d[+position], Toast.LENGTH_SHORT).show();

            }
        });



//        List<String> l = Arrays.asList(h);
//        final ArrayList<String> cricketers = new ArrayList<String>();
//        cricketers.addAll(l);
//        cricketers.add("Dhoni");
//        cricketers.add("Dravid");
//        cricketers.add("yuvi");



     /*   ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cricketers);
        myListView.setAdapter(arrayadapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Hello "+cricketers.get(i), Toast.LENGTH_SHORT).show();
            }
        }); */


    }

    public  class ImageDownload
    {
        void download()
        {
            Glide.with(MainActivity.this)
                    .load("https://kart.la/wp-content/uploads/2016/07/wp-image-1062260533jpeg.jpeg")
                    .asBitmap()
                    .into(new SimpleTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {

                           /* bitmapArray.add(resource);
                            bitmapArray.add(resource);
                            bitmapArray.add(resource);
                            bitmapArray.add(resource);
                            bitmapArray.add(resource);
                            bitmapArray.add(resource);*/
                            b = resource;
                            Toast.makeText(MainActivity.this, "Resource :"+resource, Toast.LENGTH_SHORT).show();
                            Toast.makeText(MainActivity.this, "b :"+b, Toast.LENGTH_SHORT).show();

                            // you can do something with loaded bitmap here

                            // .....
                            //  b =resource.copy(resource.getConfig(), true);

                            //  Toast.makeText(MainActivity.this, ""+resource, Toast.LENGTH_SHORT).show();
                            //   bitmapArray.add(resource);
                            // bitmapArray.add(resource);   bitmapArray.add(resource);   bitmapArray.add(resource);   bitmapArray.add(resource);   bitmapArray.add(resource);


                        }
                    });

        }

    }
}
