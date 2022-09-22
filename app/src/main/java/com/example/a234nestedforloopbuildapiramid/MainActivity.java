package com.example.a234nestedforloopbuildapiramid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //    ============Hooking java with xml=============
    EditText ed1,ed2;
    Button button;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //=============find with id======================
//        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        button=findViewById(R.id.button);
        tvDisplay=findViewById(R.id.tvDisplay);
        //        ================== Intriducing For loop=========


//        String ivText = ed1.getText().toString();
//        int inputValue = Integer.parseInt(ivText);

        button.setOnClickListener(new View.OnClickListener() {    // Making a Button Functional
            @Override
            public void onClick(View v) {


//                int iv1 = Integer.parseInt(ed1.getText().toString());
                int iv1=1;
                int iv2 = Integer.parseInt(ed2.getText().toString());

                for (int x=iv1; x<=iv2;x++){

                    for (int z=1; z<=x; z++){
                        tvDisplay.append("*");

                    }
                    tvDisplay.append("\n");

                }
            }
        });

    }
}