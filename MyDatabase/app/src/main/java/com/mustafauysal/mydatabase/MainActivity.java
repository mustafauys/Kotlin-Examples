package com.mustafauysal.mydatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Musicians", MODE_PRIVATE, null);

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musicians (name VARCHAR, age INT(2))");

            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('James', 50)");

            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Lars', 55)");

            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Kirk', 60)");

            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Rob', 65)");

            //myDatabase.execSQL("DELETE FROM musicians WHERE name LIKE 'J%' ");

            myDatabase.execSQL("UPDATE musicians SET age = 56 WHERE name = 'Lars'");

            Cursor cursor = myDatabase.rawQuery("SELECT * FROM musicians", null);

            int nameIx = cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");

            cursor.moveToFirst();

            while (cursor != null) {
                System.out.println("Name: " + cursor.getString(nameIx));
                System.out.println("Age: " + cursor.getInt(ageIx));
                cursor.moveToNext();
            }


        }   catch (Exception e) {
            e.printStackTrace();
        }

    }
}
