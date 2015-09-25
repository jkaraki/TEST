package com.example.joe_karaki.idkman;

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
    int br;
    int bl;
    int tr;
    int tl;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_day3_2);
        Button button1 = (Button) findViewById(R.id.button10);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tl++;
                Toast.makeText(MainActivity.this, String.valueOf(tl), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Top Left Pressed");
                Log.i("onCreate", String.valueOf(tl));

            }
        });
        Button button2 = (Button) findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tr++;
                Toast.makeText(MainActivity.this, String.valueOf(tr), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Top Right Pressed");
                Log.i("onCreate", String.valueOf(tr));
            }
        });
        Button button3 = (Button) findViewById(R.id.button19);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bl++;
                Toast.makeText(MainActivity.this, String.valueOf(bl), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Bottom Left Pressed");
                Log.i("onCreate", String.valueOf(bl));


            }
        });
        Button button4 = (Button) findViewById(R.id.button20);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                br++;
                Toast.makeText(MainActivity.this, String.valueOf(br), Toast.LENGTH_SHORT).show();
                Log.i("onCreate", "Bottom Right Pressed");
                Log.i("onCreate", String.valueOf(br));

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
