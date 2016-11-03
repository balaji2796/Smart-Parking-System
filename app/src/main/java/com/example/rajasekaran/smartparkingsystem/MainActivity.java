package com.example.rajasekaran.smartparkingsystem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.button6);

        int gv = 0;
        int tv = 0;
        // try {
        //int gv = 0;
        TextView gf = (TextView)findViewById(R.id.gf);
        TextView tf = (TextView)findViewById(R.id.tf);
        int c = 0;
        int d = 0;
        final DatabaseHandler db = new DatabaseHandler(this);        //db = new DatabaseHandler(context);
        for (int i = 1; i < 11; i++) {
                if (db.selectDB("s" + i) == 0) {
                    c++;
                }
            }
            for (int i=11;i<21;i++){
                if(db.selectDB("s"+i)==0){
                    d++;
                }
            }
        gv = c;
        gf.setText(String.valueOf(gv));

        tv = d;
        tf.setText(String.valueOf(tv));
        btn.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       Context context = getApplicationContext();
                                       EditText editText2 = (EditText) findViewById(R.id.editText2);
                                       TextView textView10 = (TextView) findViewById(R.id.textView10);
                                       int carno;
                                       int fl = 0;
                                       if (editText2.getText().toString().trim().length() == 0) {
                                           carno = 0;
                                       } else {
                                           carno = Integer.parseInt(editText2.getText().toString());

                                           int op = 0;
                                           //db = new DatabaseHandler(this);
                                           if (carno > 0) {
                                               if (db.selectDB("s" + carno) == 1 && carno < 11) {
                                                   op = 1;
                                               } else if (db.selectDB("s" + carno) == 1 && carno > 10) {
                                                   op = 2;
                                               } else
                                                   op = 0;
                                           } else
                                               textView10.setText("Not Available");
                                           fl = op;
                                       }
                                       if (fl != 0)
                                           textView10.setText("Your car is in " + (fl == 1 ? "ground " : "top ") + "floor");
                                       else
                                           textView10.setText("Your car is not parked");
                                   }
                               });
        //}
        /*catch (Exception e){
            //gfloor.setText("0");
            //tfloor.setText("0");

        }*/



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //      .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
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
