package com.example.srijan.gridcricket;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends Activity {

    public static int run1[] = {1,2,2,2,1,0,1,0,1};
    public static int run2[] = {4,6,0,4,4,0,6,6,6};
    public static int lastView = -1;

    public void lowRunAction ( View view) {
        Button lrButton = (Button) view;
        Random rnd = new Random();
        int arraySize = 9;
        int i = rnd.nextInt(Integer.SIZE - 1) % arraySize;

        if(lastView != -1){
            Button tmp = (Button) findViewById(lastView);
            tmp.setText("");
        }

        lrButton.setText(Integer.toString(run1[i]));
        lastView = lrButton.getId();
    }

    public void highRunAction ( View view) {
        Button hrButton = (Button) view;
        Random rnd = new Random();
        int arraySize = 9;
        int i = rnd.nextInt(Integer.SIZE - 1) % arraySize;

        if(lastView != -1){
            Button tmp = (Button) findViewById(lastView);
            tmp.setText("");
        }

        hrButton.setText(Integer.toString(run2[i]));
        lastView = hrButton.getId();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
