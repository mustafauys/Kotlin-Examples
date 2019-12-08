package com.musta.newtravelbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Object MenuInflater;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.add_place, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.add_place) {
            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
    }


}
