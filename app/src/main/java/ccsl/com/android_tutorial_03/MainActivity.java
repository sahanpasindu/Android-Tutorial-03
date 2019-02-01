package ccsl.com.android_tutorial_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnOk);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.txtHello);
                text.setText("Code Camp Sri Lanka");
            }
        });
    }
}
