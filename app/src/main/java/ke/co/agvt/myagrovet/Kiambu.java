package ke.co.agvt.myagrovet;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Kiambu extends AppCompatActivity {

    ListView Agvts;
    String[] Agrovets;
    String[] location;
    String[] contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiambu);

        Resources res = getResources();
        Agvts = (ListView) findViewById(R.id.Agvts);
        Agrovets = res.getStringArray(R.array.Agrovets);
        location = res.getStringArray(R.array.location);
        contact= res.getStringArray(R.array.contact);

        AgrovetAdapter agrovetAdapter = new AgrovetAdapter(this, Agrovets, location, contact );
        Agvts.setAdapter(agrovetAdapter);


    }
}
