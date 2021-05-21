package sg.edu.rp.c346.id20018354.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvAnswer = findViewById(R.id.textViewAns1);


        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        if (questionsSelected != null){
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        }else{
             questionsSelected = intentReceived.getStringExtra("Question2");
             tvAnswer.setText(questionsSelected + " answer is: Gone");
    }
    }
}