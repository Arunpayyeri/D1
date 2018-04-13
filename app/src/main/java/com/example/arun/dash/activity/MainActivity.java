package com.example.arun.dash.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.arun.dash.R;
import com.example.arun.dash.adapter.AdapterMainActivity;
import com.example.arun.dash.dataModel.DataModelMainActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] imageArray = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo
    };

    String[] nameArray = {
            "Braira AL Wezarat",
            "Al Ansar Golden Tulip",
            "Nozol Al Shakreen Hotel",
            "Al Shake Hotel",
            "Al Ansar Golden Tulip",
            "Nozol Al Shakreen Hotel",
            "Nozol Al Shakreen Hotel",
            "The Orbis ",
            "Victorious Kidss Educares",
            "Vikhe Patil Memorial ",
            "Nozol Al Shakreen Hotel"
    };

    String[] statusArray = {
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar",
            "Al Aziziya, Al Khobar"
    };

    String[] mobileArray = {
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms",
            "High speed Internet access in all rooms"
    };

    GridLayoutManager gridLayoutManager;
    RecyclerView recyclerView;

    AdapterMainActivity mAdapter;
    ArrayList<DataModelMainActivity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        data = new ArrayList<DataModelMainActivity>();
        for (int i = 0; i < nameArray.length; i++) {
            data.add(new DataModelMainActivity(imageArray[i], nameArray[i], statusArray[i], mobileArray[i]));
        }

        mAdapter = new AdapterMainActivity(data, MainActivity.this);
        recyclerView.setAdapter(mAdapter);
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
