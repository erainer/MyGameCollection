package net.androidbootcamp.mygamecollection;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attration = {"Ark Survival Evolved", "Dying Light", "Rocket League", "The Forest"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attration));

    }

    protected void onListItemClick(ListView i, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, Ark.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, DyingLight.class));
                break;
            case 2: startActivity(new Intent(MainActivity.this, RocketLeague.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, TheForest.class));
                break;
            default:
                break;
        }
    }
}
