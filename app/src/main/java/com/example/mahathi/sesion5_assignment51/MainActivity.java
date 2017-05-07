package com.example.mahathi.sesion5_assignment51;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        TextView textView= (TextView)findViewById(R.id.textview1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater M = getMenuInflater();
    M.inflate(R.menu.main,menu);
        return true;
    }

    /*  code for setting the color to textview on click of optionitems selected*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        TextView textView= (TextView)findViewById(R.id.textview1);
        String abc;
        if (id == R.id.red) {

            textView.setTextColor(getApplicationContext().getResources().getColor(R.color.Red));
            abc=textView.getText().toString();
            Toast.makeText(getApplicationContext(), "Clicked on Red", Toast.LENGTH_LONG).show();
            return true;
        }else if (id == R.id.green) {
            textView.setTextColor(getApplicationContext().getResources().getColor(R.color.DarkSeaGreen));
            Toast.makeText(getApplicationContext(), "clicked on green", Toast.LENGTH_LONG).show();
            return true;
        }else if(id == R.id.blue)
        {
            textView.setTextColor(getApplicationContext().getResources().getColor(R.color.RoyalBlue));
            Toast.makeText(getApplicationContext(),"clicked on blue",Toast.LENGTH_LONG).show();
        }


        return super.onOptionsItemSelected(item);
    }
}
