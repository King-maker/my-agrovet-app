package ke.co.agvt.myagrovet;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Thika extends AppCompatActivity {

    ListView Thk;
    String[] AgrovetsThk;
    String[] locationThk;
    String[] contactThk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thika);

        Resources res = getResources();
        Thk = (ListView) findViewById(R.id.Thk);
        AgrovetsThk = res.getStringArray(R.array.AgrovetsThk);
        locationThk = res.getStringArray(R.array.locationThk);
        contactThk= res.getStringArray(R.array.contactThk);

        AgrovetAdapter agrovetThkAdapter = new AgrovetAdapter(this, AgrovetsThk, locationThk, contactThk );
        Thk.setAdapter(agrovetThkAdapter);


    }
}
