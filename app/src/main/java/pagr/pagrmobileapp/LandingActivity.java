package pagr.pagrmobileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        final TextView WelcomeMessage = (EditText) findViewById(R.id.tvWelcomeMessage);
        final EditText userName = (EditText) findViewById(R.id.userName);
        final EditText userAge = (EditText) findViewById(R.id.userAge);
    }
}
