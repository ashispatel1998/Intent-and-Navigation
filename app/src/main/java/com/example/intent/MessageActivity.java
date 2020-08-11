package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {

    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.btn);


        try{
            //Getting the intent on activity create
            Intent intent=getIntent();
            //Getting the message from the intent
            String msg=intent.getStringExtra("message");
            // Setting the messaage to the textview field
            textView.setText(msg);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),FinalActivity.class);
                startActivity(intent);
            }
        });
    }
}