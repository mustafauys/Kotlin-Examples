    package com.mustafauysal.parselearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ParseObject object = new ParseObject("Fruits");

        object.put("name", "banana");
        object.put("calories", 250);
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null) {
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Object Saved",Toast.LENGTH_LONG).show();
                }
            }
        });

        */



        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
        query.getInBackground("CBtF2ofHjr", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e != null) {
                    e.printStackTrace();
                } else {
                    String objectName = object.getString("name");
                    int objectCalories = object.getInt("calories");

                    System.out.println("object name: " + objectName);
                    System.out.println("object calories: " + objectCalories);
                }
            }
        });


    }
}
