package com.example.rajasekaran.smartparkingsystem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {
    private static  Button park;
    private static  Button exit;
    private static  Button glist;
    private static  Button tlist;
    final DatabaseHandler db = new DatabaseHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
       // final listClass lc = new listClass();
        park = (Button) findViewById(R.id.button);
        exit = (Button) findViewById(R.id.button2);

        glist = (Button) findViewById(R.id.button3);
        tlist = (Button) findViewById(R.id.button4) ;
       // final int carno;

        park.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();

                // Perform action on click
                int done = 0;
                int cno = -1;
                int s[] = new int[30];
                for (int i = 1; i < 21; i++) {
                    s[i] = db.selectDB("s" + i);
                }
                for (int i = 1; i < 21; i++) {
                    if (s[i] == 0) {
                        db.updateDB(i);
                        done = 1;
                        cno = i;
                        break;
                    }
                }
                CharSequence text = "";
                int duration = Toast.LENGTH_SHORT;

                if (done == 1) {
                     text = "Car Parked. Car number is " + cno;
                     duration = Toast.LENGTH_SHORT;
                } else {
                     text = "No Space";
                     duration = Toast.LENGTH_SHORT;
                }



                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

            });
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int carno;
                EditText editText3 = (EditText) findViewById(R.id.editText3);
                if(editText3.getText().toString().trim().length()==0){
                    carno =0;
                }

                else {
                    carno = Integer.parseInt(editText3.getText().toString());
                }
                db.updateDB(carno);
                Context context = getApplicationContext();
                CharSequence text = "Car Removed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        glist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent listIntent = new Intent(Admin.this, list.class);
                Admin.this.startActivity(listIntent);
            }
        });
        tlist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent listIntent1 = new Intent(Admin.this, list2.class);
                Admin.this.startActivity(listIntent1);
            }
        });

    }

}
