package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditToDb extends AppCompatActivity {

    private EditText title,des;
    private Button edit;
    private DbHandler dbHandler;
    private String gender1;
    private EditText age;
    private Context context;
    private int id;
    private String age2;
    private String gender;
    private String desc;
    private String title1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_to_db);

        context = this;
        dbHandler = new DbHandler(context);


        title = findViewById(R.id.editToDoTextTitle);
        des = findViewById(R.id.editToDoTextDescription);
        age = findViewById(R.id.editAge);
        edit = findViewById(R.id.buttonEdit);

        Intent intent = getIntent();

        String id1 = intent.getStringExtra("id");

        id = Integer.parseInt(id1);
        gender1 = intent.getStringExtra("gender");
        age2 = intent.getStringExtra("age");
        desc = intent.getStringExtra("desc");
        title1 = intent.getStringExtra("title");

        Toast.makeText(context,"ID = "  + id + "gender = " + gender1 + "age = "+ age2 + "desc"+desc +"title1"+title1, Toast.LENGTH_SHORT).show();

        //   ToDo todo = dbHandler.getSingleToDo(id);

        title.setText(title1);
        des.setText(desc);
        age.setText(age2);
        // gender.setText(gender);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userTitle = title.getText().toString();
                String userDesc = des.getText().toString();
                int age1 = Integer.parseInt(age.getText().toString());

                int i = dbHandler.updateSingleToDo(id, userTitle, userDesc, age1, "male");

                if (i > 0) {
                    Toast.makeText(context, "Record updated successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Record update failed", Toast.LENGTH_SHORT).show();
                }

                startActivity(new Intent(context, MainActivity.class));
            }
        });
    }}