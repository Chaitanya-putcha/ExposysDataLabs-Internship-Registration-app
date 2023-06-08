package com.example.exposysdatalabs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Form extends AppCompatActivity {
   TextView tv;
    String st;
    TextInputEditText name,branch,email,phone,college,per10,per12,ug,pg,paymentid;
    Button submit;
    DatabaseReference db;
    FirebaseDatabase fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        getSupportActionBar().setTitle("EXPOSYS DATA LABS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name = findViewById(R.id.name);
        branch = findViewById(R.id.branch);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        college = findViewById(R.id.college);
        per10 = findViewById(R.id.ten);
        per12 = findViewById(R.id.twelve);
        ug = findViewById(R.id.ug);
        pg = findViewById(R.id.pg);
        paymentid = findViewById(R.id.payment);
        tv = findViewById(R.id.internship);
        submit = findViewById(R.id.btn_submit);
        TextView textview = findViewById(R.id.textview);
        textview.setMovementMethod(LinkMovementMethod.getInstance());

        st = getIntent().getExtras().getString("value");
        tv.setText(st);

       db = FirebaseDatabase.getInstance().getReference().child("user");
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               InsertUserData();
           }
       });

    }

    private void InsertUserData() {
        String Name = String.valueOf(name.getText());
        String Branch = String.valueOf(branch.getText());
        String Email = String.valueOf(email.getText());
        String College = String.valueOf(college.getText());
        String Phone = String.valueOf(phone.getText());
        String Percentage_10th = String.valueOf(per10.getText());
        String Percentage_12th = String.valueOf(per12.getText());
        String UG = String.valueOf(ug.getText());
        String PG = String.valueOf(pg.getText());
        String PaymentID = String.valueOf(paymentid.getText());
        String Internship = tv.getText().toString();
        if(!Name.isEmpty() && !Branch.isEmpty() && !Email.isEmpty() && !College.isEmpty() && !Phone.isEmpty() && !Percentage_10th.isEmpty() && !Percentage_12th.isEmpty() && !UG.isEmpty() && !PaymentID.isEmpty()) {
            Users user = new Users(Name,Branch,Email,College,Phone,Percentage_10th,Percentage_12th,UG,PG,Internship,PaymentID);
           db.push().setValue(user);
            Toast.makeText(Form.this,"Data inserted",Toast.LENGTH_SHORT).show();
        }
    }
}