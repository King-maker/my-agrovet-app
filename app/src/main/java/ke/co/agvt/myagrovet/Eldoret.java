package ke.co.agvt.myagrovet;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Eldoret extends AppCompatActivity {

    ListView Eld;
    String[] AgrovetsEld;
    String[] locationEld;
    String[] contactEld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eldoret);

        Resources res = getResources();
        Eld = (ListView) findViewById(R.id.Eld);
        AgrovetsEld = res.getStringArray(R.array.AgrovetsEld);
        locationEld = res.getStringArray(R.array.locationEld);
        contactEld= res.getStringArray(R.array.contactEld);

        AgrovetAdapter agrovetEldAdapter = new AgrovetAdapter(this, AgrovetsEld, locationEld, contactEld );
        Eld.setAdapter(agrovetEldAdapter);


    }
}
