package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AddtoDb extends AppCompatActivity {

    private EditText title, desc;
    private EditText age, gender0;
    private Button add;
   // private RadioButton radioMale;
  //  private RadioButton radioFemale;
   // private RadioGroup radioGrp;
  //  private String gender1;
    private DbHandler dbHandler;
    private Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addto_db);

        /** add = findViewById(R.id.buttonAdd);
        context = this;


        dbHandler = new DbHandler(context); **/



        title = findViewById(R.id.editTextTitle);
         desc = findViewById(R.id.editTextDescription);
       //  radioMale = findViewById(R.id.radio_male);
       //  radioFemale = findViewById(R.id.radio_female);
       //  radioGrp = findViewById(R.id.radio_grp);
        //gender0 = findViewById(R.id.addGender);
         age = findViewById(R.id.editTextAge);
         add = findViewById(R.id.buttonAdd);
         context = this;




         dbHandler = new DbHandler(context);

      /**  radioGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {
                 if(checkedId == R.id.radio_male)
                 {
                     gender1 = "male";
                 }
                 else{
                     gender1 = "female";
                 }
                 Toast.makeText(context, "add gender", Toast.LENGTH_SHORT).show();
             }
         });  **/

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String userTitle = title.getText().toString();
                String userDesc = desc.getText().toString();
                int age1 = Integer.parseInt(age.getText().toString());

                dbHandler.addToDo(userTitle, userDesc, age1, "male");
            //  dbHandler.addToDo("sasi", "abc",  10, "male");

                startActivity(new Intent(context,EditToDb.class));
                Toast.makeText(AddtoDb.this, "adding", Toast.LENGTH_SHORT).show();
            }
        });

    }

}


