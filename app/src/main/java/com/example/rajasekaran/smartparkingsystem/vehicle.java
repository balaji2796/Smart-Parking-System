package com.example.rajasekaran.smartparkingsystem;

/**
 * Created by Rajasekaran on 21-10-2016.
 */

public class vehicle {
    int no;
    int mvs;

    public vehicle(int abc){
        no=abc;
        mvs=0;
    }

    public int incmoves(int x){
        return (mvs+x);
    }
}
