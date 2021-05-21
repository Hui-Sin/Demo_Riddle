package sg.edu.rp.c346.id20018354.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQ1;
    Button btnrevealQ1;
    TextView tvQ2;
    Button btnrevealQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvQ1=findViewById(R.id.textViewQ1);
        btnrevealQ1=findViewById(R.id.buttonRevealQ1);
        tvQ2=findViewById(R.id.textViewQ2);
        btnrevealQ2=findViewById(R.id.buttonRevealQ2);
        btnrevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });
        btnrevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question2", "Q2");
                startActivity(intent);
            }
        });
    }
}