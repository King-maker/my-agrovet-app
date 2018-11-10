package ke.co.agvt.myagrovet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Button KbuBtn = (Button)findViewById(R.id.KbuBtn);
        KbuBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View k) {
                Intent Kiambu = new Intent(getApplicationContext(), Kiambu.class);
                startActivity(Kiambu);

                }
                });

            Button NbiBtn = (Button)findViewById(R.id.NbiBtn);
            NbiBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View a) {
                    Intent Nairobi = new Intent(getApplicationContext(), Nairobi.class);
                    startActivity(Nairobi);
                    }
                    });

        Button EldBtn = (Button)findViewById(R.id.EldBtn);
        EldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                Intent Eldoret = new Intent(getApplicationContext(), Eldoret.class);
                startActivity(Eldoret);
            }
        });

        Button ThkBtn = (Button)findViewById(R.id.ThikaBtn);
        ThkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View t) {
                Intent Thika = new Intent(getApplicationContext(), Thika.class);
                startActivity(Thika);
            }
        });


    }
}