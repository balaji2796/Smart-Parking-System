package com.example.rajasekaran.smartparkingsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class list extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        int j = 0;
        int arr[] = new int[12];
        DatabaseHandler db = new DatabaseHandler(this);
            for (int i = 1; i < 11; i++) {
                if(db.selectDB("s"+i)==1){
                    arr[j] = i;
                    j++;
                }
            }

        //int arr[] = lc.display(1);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        String str = "";
        for(int i=0;i<arr.length;i++){
           // int var = String.valueOf(arr[i]);
           str = (String.valueOf(arr[i])+", ");
        }
        textView3.setText(str);
    }

}
