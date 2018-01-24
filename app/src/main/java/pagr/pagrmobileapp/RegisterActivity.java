package pagr.pagrmobileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText userName = (EditText) findViewById(R.id.userName);
        final EditText userEmail = (EditText) findViewById(R.id.userEmail);
        final EditText userPassword = (EditText) findViewById(R.id.userPassword);
        final EditText userAge = (EditText) findViewById(R.id.userAge);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
    }
}
