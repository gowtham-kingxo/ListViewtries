package com.example.gowthamg.listviewtries;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] d ={"Mr.360","the palti hit","Mr.cricket","Captain Cool","The Wall","The Fighter"};
    Integer[] IMAGES = {R.drawable.abd,R.drawable.kp,R.drawable.hussey,R.drawable.dhoni,R.drawable.dravid,R.drawable.yuvi};

   String[] h = {"abd","kp","hussey","dhoni","dravid","yuvi"};
    //first change

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView) findViewById(R.id.myListView);

        CustomList adapter = new CustomList(this, d,IMAGES,h);

        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +d[+ position], Toast.LENGTH_SHORT).show();

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
        }











