package ke.co.agvt.myagrovet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SignInBtn = (Button)findViewById(R.id.SignInBtn);
        SignInBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Second_page = new Intent(getApplicationContext(), Second_page.class);
                startActivity(Second_page);
            }
        });

        Button LoginBtn = (Button)findViewById(R.id.LoginBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Login_page = new Intent(getApplicationContext(), Login.class);
                startActivity(Login_page);
            }
        });

    }

}
