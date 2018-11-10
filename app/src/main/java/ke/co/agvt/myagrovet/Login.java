package ke.co.agvt.myagrovet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button LoginBtn2;

    int attempt_counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginBtn2();
    }

    public void LoginBtn2(){
        username = (EditText)findViewById(R.id.plaintext_username);
        password = (EditText)findViewById(R.id.text_pswd);
        attempts = (TextView)findViewById(R.id.attempt_count);
        LoginBtn2 = (Button)findViewById(R.id.loginBtn2);

        attempts.setText(Integer.toString(attempt_counter));

        LoginBtn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View p) {
                        if(username.getText().toString().equals("Ngeene") &&
                                password.getText().toString().equals("King123") ) {
                            Toast.makeText(Login.this, "username and password is correct",
                                    Toast.LENGTH_SHORT) .show();
                            Intent second_page = new Intent(getApplicationContext(), Second_page.class);
                            startActivity(second_page);
                        } else {
                            Toast.makeText(Login.this, "username or password is not correct",
                                    Toast.LENGTH_SHORT) .show();
                            attempt_counter -- ;
                            attempts.setText(Integer.toString(attempt_counter));
                            if(attempt_counter == 0){
                                LoginBtn2.setEnabled(false);
                            }
                        }
                    }
                }
        );
    }
}
