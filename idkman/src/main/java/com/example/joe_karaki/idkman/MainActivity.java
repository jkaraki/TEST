package com.example.joe_karaki.idkman;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




//hey everyone

public class MainActivity extends AppCompatActivity {

    int bl;
    int br;
    int tl;
    int tr;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
         bl =  mSettings.getInt("bl", 0)  ;
         br =  mSettings.getInt("br", 0)  ;
         tr =  mSettings.getInt("tr", 0)  ;
         tl =  mSettings.getInt("tl", 0)  ;

        setContentView(R.layout.layout_day4);
        Button button1 = (Button) findViewById(R.id.button21);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tl++;
                Toast.makeText(MainActivity.this, String.valueOf(tl), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Top Left Pressed");
                Log.i("onCreate", String.valueOf(tl));

                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt("tl", tl);
                editor.commit();


            }
        });
        Button button2 = (Button) findViewById(R.id.button22);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tr++;
                Toast.makeText(MainActivity.this, String.valueOf(tr), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Top Right Pressed");
                Log.i("onCreate", String.valueOf(tr));

                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt("tr", tr);
                editor.commit();

            }
        });
        Button button3 = (Button) findViewById(R.id.button23);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bl++;
                Toast.makeText(MainActivity.this, String.valueOf(bl), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Bottom Left Pressed");
                Log.i("onCreate", String.valueOf(bl));

                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt("bl", bl);
                editor.commit();

            }
        });
        Button button4 = (Button) findViewById(R.id.button24);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                br++;
                Toast.makeText(MainActivity.this, String.valueOf(br), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Bottom Right Pressed");
                Log.i("onCreate", String.valueOf(br));
                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt("tl", tl);
                editor.commit();

            }
        });
        Button reset = (Button) findViewById(R.id.button25);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt("tl", 0);
                editor.putInt("tr", 0);
                editor.putInt("bl", 0);
                editor.putInt("br", 0);
                tl=0;
                tr=0;
                br=0;
                bl=0;


                editor.commit();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
