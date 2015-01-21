package com.example.student.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v)
    {
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText("Button1 is clicked");
    }
    int value_one=0;
    public void button2Clicked(View v)
    {
        TextView tv=(TextView)findViewById(R.id.textView);
        value_one=value_one+1;
        tv.setText(Integer.toString(value_one));
    }


    public void button3Clicked(View v)
    {
        TextView tv=(TextView)findViewById(R.id.textView);
        value_one--;
        tv.setText(Integer.toString(value_one));
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
