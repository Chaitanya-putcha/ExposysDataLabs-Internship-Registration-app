package com.example.exposysdatalabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.play.core.integrity.v;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      FirebaseAuth auth;
      Button button;
      TextView textView;
      FirebaseUser user;
      ImageButton imgbutton1;
    ImageButton imgbutton2;
    ImageButton imgbutton3;
    ImageButton imgbutton4;
    ImageButton imgbutton5;
    ImageButton imgbutton6;
    ImageButton imgbutton7;
    ImageButton imgbutton8;
    ImageButton imgbutton9;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("EXPOSYS DATA LABS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.logout);
        textView = findViewById(R.id.user_details);
        imgbutton1 = findViewById(R.id.imageButton1);
        imgbutton2 = findViewById(R.id.imageButton2);
        imgbutton3 = findViewById(R.id.imageButton3);
        imgbutton4 = findViewById(R.id.imageButton4);
        imgbutton5 = findViewById(R.id.imageButton5);
        imgbutton6 = findViewById(R.id.imageButton6);
        imgbutton7 = findViewById(R.id.imageButton7);
        imgbutton8 = findViewById(R.id.imageButton8);
        imgbutton9 = findViewById(R.id.imageButton9);
        user = auth.getCurrentUser();
        if(user == null){
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        } else{
            textView.setText(user.getEmail());
        }

        imgbutton1.setOnClickListener(this);
        imgbutton2.setOnClickListener(this);
        imgbutton3.setOnClickListener(this);
        imgbutton4.setOnClickListener(this);
        imgbutton5.setOnClickListener(this);
        imgbutton6.setOnClickListener(this);
        imgbutton7.setOnClickListener(this);
        imgbutton8.setOnClickListener(this);
        imgbutton9.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton1) {
            Intent intent = new Intent(getApplicationContext(), Form.class);
            String st = "App Development internship";
            intent.putExtra("value",st);
            startActivity(intent);
            finish();
        } else if (v.getId() == R.id.imageButton2) {
            Intent intent1 = new Intent(getApplicationContext(), Form.class);
            String st = "Cyber security internship";
            intent1.putExtra("value",st);
            startActivity(intent1);
            finish();
        } else if (v.getId() == R.id.imageButton3){
            Intent intent2 = new Intent(getApplicationContext(), Form.class);
            String st = "Data Science internship";
            intent2.putExtra("value",st);
        startActivity(intent2);
        finish();
    }
           else if(v.getId() == R.id.imageButton4) {
            Intent intent3 = new Intent(getApplicationContext(), Form.class);
            String st = "Digital Marketing internship";
            intent3.putExtra("value",st);
            startActivity(intent3);
            finish();
        }
        else if(v.getId() == R.id.imageButton5) {
            Intent intent4 = new Intent(getApplicationContext(), Form.class);
            String st = "Full Stack Development internship";
            intent4.putExtra("value",st);
            startActivity(intent4);
            finish();
        }
        else if(v.getId() == R.id.imageButton6) {
            Intent intent5 = new Intent(getApplicationContext(), Form.class);
            String st = "IOT internship";
            intent5.putExtra("value",st);
            startActivity(intent5);
            finish();
        }
        else if(v.getId() == R.id.imageButton7) {
            Intent intent7 = new Intent(getApplicationContext(), Form.class);
            String st = "Software Development internship";
            intent7.putExtra("value",st);
            startActivity(intent7);
            finish();
        }
        else if(v.getId() == R.id.imageButton8) {
            Intent intent8 = new Intent(getApplicationContext(), Form.class);
            String st = "UI/UX Design internship";
            intent8.putExtra("value",st);
            startActivity(intent8);
            finish();
        }
        else if(v.getId() == R.id.imageButton9) {
            Intent intent9 = new Intent(getApplicationContext(), Form.class);
            String st = "Web development internship";
            intent9.putExtra("value",st);
            startActivity(intent9);
            finish();
        }
        }
    }
