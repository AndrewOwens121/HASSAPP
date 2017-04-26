package com.example.andrew.hassapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HACCPLIST extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haccplist);

        String[] manuals = {"Butchers","Deli/Restaurant","Bar/Pub","Smoothie Shop"};
        ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,manuals);
        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(position ==0){
                            Toast.makeText(HACCPLIST.this,"Butchers Selected",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(HACCPLIST.this,Tree8.class);
                            startActivity(i);
                        }
                        if(position == 1){
                            Toast.makeText(HACCPLIST.this,"Deli/Restaurant Selected",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(HACCPLIST.this,Tree9.class);
                            startActivity(i);
                        }
                        if(position == 2){
                            Toast.makeText(HACCPLIST.this,"Bar/Pub Selected",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(HACCPLIST.this,Tree10.class);
                            startActivity(i);
                        }
                        if(position == 3){
                            Toast.makeText(HACCPLIST.this,"Smoothie Shop Selected",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(HACCPLIST.this,Tree11.class);
                            startActivity(i);
                        }
                    }
                }


        );
        }
    }


