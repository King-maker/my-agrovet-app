package ke.co.agvt.myagrovet;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Nairobi extends AppCompatActivity {

    ListView Nbi;
    String[] AgrovetsNbi;
    String[] locationNbi;
    String[] contactNbi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nairobi);

        Resources res = getResources();
        Nbi = (ListView) findViewById(R.id.Nbi);
        AgrovetsNbi = res.getStringArray(R.array.AgrovetsNbi);
        locationNbi = res.getStringArray(R.array.locationNbi);
        contactNbi= res.getStringArray(R.array.contactNbi);

        AgrovetAdapter agrovetAdapter = new AgrovetAdapter(this, AgrovetsNbi, locationNbi, contactNbi );
        Nbi.setAdapter(agrovetAdapter);


    }
}
