package com.example.rajasekaran.smartparkingsystem;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String dbName = "SmartPark";
    private static final String tname = "spk";
    private static final String s1 = "s1";
    private static final String s2 = "s2";
    private static final String s3 = "s3";
    private static final String s4 = "s4";
    private static final String s5 = "s5";
    private static final String s6 = "s6";
    private static final String s7 = "s7";
    private static final String s8 = "s8";
    private static final String s9 = "s9";
    private static final String s10 = "s10";
    private static final String s11 = "s11";
    private static final String s12 = "s12";
    private static final String s13 = "s13";
    private static final String s14 = "s14";
    private static final String s15 = "s15";
    private static final String s16 = "s16";
    private static final String s17 = "s17";
    private static final String s18 = "s18";
    private static final String s19 = "s19";
    private static final String s20 = "s20";

    private static final String id = "id";

    //public DatabaseHandler(Context context){
   //     super(context, dbName, null, 1);
    //}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " +tname +"("+id+" INTEGER," + s1 +" INTEGER,"+s2 + " INTEGER,"+s3 +" INTEGER,"+s4 +" INTEGER,"+s5 +" INTEGER,"+s6 +" INTEGER,"+s7 +" INTEGER,"+s8 +" INTEGER,"+s9 +" INTEGER,"+s10 +" INTEGER,"+s11 +" INTEGER,"+s12 +" INTEGER,"+s13 +" INTEGER,"+s14 +" INTEGER,"+s15 +" INTEGER,"+s16 +" INTEGER,"+s17 +" INTEGER,"+s18 +" INTEGER,"+s19 +" INTEGER,"+s20 +" INTEGER)";
        db.execSQL(createTable);
        String insertTable = "INSERT INTO "+tname+" ("+id+","+s1+","+s2+","+s3+","+s4+","+s5+","+s6+","+s7+","+s8+","+s9+","+s10+","+s11+","+s12+","+s13+","+s14+","+s15+","+s16+","+s17+","+s18+","+s19+","+s20+") VALUES (1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)";
        db.execSQL(insertTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tname);
        onCreate(db);
    }
    public void deleteAll()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        // db.delete(TABLE_NAME,null,null);
        //db.execSQL("delete from "+ tname);
        //db.execSQL("TRUNCATE table" + tname);
        db.execSQL("DROP TABLE IF EXISTS " + tname);
        onCreate(db);
        //String updateTable = "UPDATE "+tname+" set "+s1+"= 0 "+","+s2+"= 0 "+","+s3+"= 0 "+","+s4+"= 0 "+","+s5+"= 0 "+","+s6+"= 0 "+","+s7+"= 0 "+","+s8+"= 0 "+","+s9+"= 0 "+" WHERE "+id+"= 1";
        //db.execSQL(updateTable);
        db.close();
    }

    public void updateDB(int a){
        SQLiteDatabase db = this.getWritableDatabase();
        String selectTable1 = "SELECT " +s1+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable2 = "SELECT " +s2+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable3 = "SELECT " +s3+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable4 = "SELECT " +s4+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable5 = "SELECT " +s5+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable6 = "SELECT " +s6+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable7 = "SELECT " +s7+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable8 = "SELECT " +s8+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable9 = "SELECT " +s9+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable10 = "SELECT " +s10+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable11 = "SELECT " +s11+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable12 = "SELECT " +s12+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable13 = "SELECT " +s13+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable14 = "SELECT " +s14+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable15 = "SELECT " +s15+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable16 = "SELECT " +s16+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable17 = "SELECT " +s17+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable18 = "SELECT " +s18+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable19 = "SELECT " +s19+" FROM "+tname+" WHERE "+id+"= 1";
        String selectTable20 = "SELECT " +s20+" FROM "+tname+" WHERE "+id+"= 1";

        Cursor ans = null;
        int req1 = -1,req2 = -1,req3 = -1,req4 = -1,req5 = -1,req6 = -1,req7 = -1,req8 = -1,req9 = -1;
        int req10 = -1,req11 = -1,req12 = -1,req13 = -1,req14 = -1,req15 = -1,req16 = -1,req17 = -1,req18 = -1,req19 = -1,req20 = -1;
        ans = db.rawQuery(selectTable1,null);
        if(ans!= null) {
            if (ans.moveToFirst()) {
                req1 = ans.getInt(ans.getColumnIndex(s1));
            }
            ans = null;
            ans = db.rawQuery(selectTable2, null);
            if (ans.moveToFirst()) {
                req2 = ans.getInt(ans.getColumnIndex(s2));
            }
            ans = null;
            ans = db.rawQuery(selectTable3, null);
            if (ans.moveToFirst()) {
                req3 = ans.getInt(ans.getColumnIndex(s3));
            }
            ans = null;
            ans = db.rawQuery(selectTable4, null);
            if (ans.moveToFirst()) {
                req4 = ans.getInt(ans.getColumnIndex(s4));
            }
            ans = null;
            ans = db.rawQuery(selectTable5, null);
            if (ans.moveToFirst()) {
                req5 = ans.getInt(ans.getColumnIndex(s5));
            }
            ans = null;
            ans = db.rawQuery(selectTable6, null);
            if (ans.moveToFirst()) {
                req6 = ans.getInt(ans.getColumnIndex(s6));
            }
            ans = null;
            ans = db.rawQuery(selectTable7, null);
            if (ans.moveToFirst()) {
                req7 = ans.getInt(ans.getColumnIndex(s7));
            }
            ans = null;
            ans = db.rawQuery(selectTable8, null);
            if (ans.moveToFirst()) {
                req8 = ans.getInt(ans.getColumnIndex(s8));
            }
            ans = null;
            ans = db.rawQuery(selectTable9, null);
            if (ans.moveToFirst()) {
                req9 = ans.getInt(ans.getColumnIndex(s9));
            }
            ans = null;
            ans = db.rawQuery(selectTable10,null);
            if (ans.moveToFirst()) {
                req10 = ans.getInt(ans.getColumnIndex(s10));
            }
            ans = null;
            ans = db.rawQuery(selectTable11,null);
            if (ans.moveToFirst()) {
                req11 = ans.getInt(ans.getColumnIndex(s11));
            }
            ans = null;
            ans = db.rawQuery(selectTable12,null);
            if (ans.moveToFirst()) {
                req12 = ans.getInt(ans.getColumnIndex(s12));
            }
            ans = null;
            ans = db.rawQuery(selectTable13,null);
            if (ans.moveToFirst()) {
                req13 = ans.getInt(ans.getColumnIndex(s13));
            }
            ans = null;
            ans = db.rawQuery(selectTable14,null);
            if (ans.moveToFirst()) {
                req14 = ans.getInt(ans.getColumnIndex(s14));
            }
            ans = null;
            ans = db.rawQuery(selectTable15,null);
            if (ans.moveToFirst()) {
                req15 = ans.getInt(ans.getColumnIndex(s15));
            }
            ans = null;
            ans = db.rawQuery(selectTable16,null);
            if (ans.moveToFirst()) {
                req16 = ans.getInt(ans.getColumnIndex(s16));
            }
            ans = null;
            ans = db.rawQuery(selectTable17,null);
            if (ans.moveToFirst()) {
                req17 = ans.getInt(ans.getColumnIndex(s17));
            }
            ans = null;
            ans = db.rawQuery(selectTable18,null);
            if (ans.moveToFirst()) {
                req18 = ans.getInt(ans.getColumnIndex(s18));
            }
            ans = null;
            ans = db.rawQuery(selectTable19,null);
            if (ans.moveToFirst()) {
                req19 = ans.getInt(ans.getColumnIndex(s19));
            }
            ans = null;
            ans = db.rawQuery(selectTable20,null);
            if (ans.moveToFirst()) {
                req20 = ans.getInt(ans.getColumnIndex(s20));
            }
            ans = null;
        }
        int ss1 = req1 ;
        int ss2 = req2 ;
        int ss3 = req3 ;
        int ss4 = req4 ;
        int ss5 = req5 ;
        int ss6 = req6 ;
        int ss7 = req7 ;
        int ss8 = req8 ;
        int ss9 = req9 ;
        int ss10 = req10 ;
        int ss11 = req11 ;
        int ss12 = req12 ;
        int ss13 = req13 ;
        int ss14 = req14 ;
        int ss15 = req15 ;
        int ss16= req16 ;
        int ss17 = req17 ;
        int ss18 = req18 ;
        int ss19 = req19 ;
        int ss20 = req20 ;
        String updateTable ="UPDATE "+tname+" set s"+a+"= 0 WHERE "+id+"= 1"; ;
        switch (a){
            case 1 : if(ss1 == 0)
                        ss1 = 1;
                    else
                        ss1 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss1+" WHERE "+id+"= 1";
                    break;
            case 2 : if(ss2 == 0)
                ss2 = 1;
            else
                ss2 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss2+" WHERE "+id+"= 1";
                break;
            case 3 : if(ss3 == 0)
                ss3 = 1;
            else
                ss3 = 0;;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss3+" WHERE "+id+"= 1";
                break;
            case 4 : if(ss4 == 0)
                ss4 = 1;
            else
                ss4 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss4+" WHERE "+id+"= 1";
                break;
            case 5 : if(ss5 == 0)
                ss5 = 1;
            else
                ss5 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss5+" WHERE "+id+"= 1";
                break;
            case 6 : if(ss6 == 0)
                ss6 = 1;
            else
                ss6 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss6+" WHERE "+id+"= 1";
                break;
            case 7 : if(ss7 == 0)
                ss7 = 1;
            else
                ss7 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss7+" WHERE "+id+"= 1";
                break;
            case 8 : if(ss8 == 0)
                ss8 = 1;
            else
                ss8 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss8+" WHERE "+id+"= 1";
                break;
            case 9 : if(ss9 == 0)
                ss9 = 1;
            else
                ss9 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss9+" WHERE "+id+"= 1";
                break;
            case 10 : if(ss10 == 0)
                ss10 = 1;
            else
                ss10 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss10+" WHERE "+id+"= 1";
                break;
            case 11 : if(ss11 == 0)
                ss11 = 1;
            else
                ss11 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss11+" WHERE "+id+"= 1";
                break;
            case 12 : if(ss12 == 0)
                ss12 = 1;
            else
                ss12 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss12+" WHERE "+id+"= 1";
                break;
            case 13 : if(ss13 == 0)
                ss13 = 1;
            else
                ss13 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss13+" WHERE "+id+"= 1";
                break;
            case 14 : if(ss14 == 0)
                ss14 = 1;
            else
                ss14 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss14+" WHERE "+id+"= 1";
                break;
            case 15 : if(ss15 == 0)
                ss15 = 1;
            else
                ss15 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss15+" WHERE "+id+"= 1";
                break;
            case 16 : if(ss16 == 0)
                ss16 = 1;
            else
                ss16 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss16+" WHERE "+id+"= 1";
                break;
            case 17 : if(ss17 == 0)
                ss17 = 1;
            else
                ss17 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss17+" WHERE "+id+"= 1";
                break;
            case 18 : if(ss18 == 0)
                ss18 = 1;
            else
                ss18 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss18+" WHERE "+id+"= 1";
                break;
            case 19 : if(ss19 == 0)
                ss19 = 1;
            else
                ss19 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss19+" WHERE "+id+"= 1";
                break;
            case 20 : if(ss20 == 0)
                ss20 = 1;
            else
                ss20 = 0;
                updateTable = "UPDATE "+tname+" set s"+a+"= "+ss20+" WHERE "+id+"= 1";
                break;
        }


        db.execSQL(updateTable);
    }
    public Context m_context;

    public DatabaseHandler(Context context) {
        super(context, dbName, null, 4);
       // dbHelp = new DatabaseHandler(context);

        // assigning context Change your constructor
        //m_context = context;
    }
    public int selectDB(String s){
        SQLiteDatabase db = this.getReadableDatabase();
        int req  = -1;
        String selectTable = "SELECT " +s+" FROM "+tname+" WHERE "+id+"= 1";
        Cursor ans = null;
        ans = db.rawQuery(selectTable,null);
        if(ans.moveToFirst()) {
            req = ans.getInt(ans.getColumnIndex(s));
        }
        return req;
    }
}

