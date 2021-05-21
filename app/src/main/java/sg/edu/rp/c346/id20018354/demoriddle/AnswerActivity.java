package sg.edu.rp.c346.id20018354.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView tvAnswer;
    Button btnrevealQ1;
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvAnswer=findViewById(R.id.textViewAns1);
        btnrevealQ1=findViewById(R.id.buttonRevealQ1);
        tvAnswer2=findViewById(R.id.textViewAns2);


        //tvAnswer.setText("In Answer Activity 1");
        if(btnrevealQ1.isSelected()){
            Intent intentReceived = getIntent();
            String questionsSelected = intentReceived.getStringExtra("Question");
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        }else{
            Intent intentReceived = getIntent();
            String questionsSelected = intentReceived.getStringExtra("Question2");
            tvAnswer2.setText(questionsSelected + " answer is: Gone");
        }
    }
}