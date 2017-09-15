package com.example.a11datatransfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.a11datatransfer.R;
public class AnotherActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);



        Button button=(Button)findViewById(R.id.buttonReturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String str=intent.getStringExtra("String");
               // Integer in=intent.getIntExtra("int", 20);
                intent.putExtra("result","String:"+str);
                setResult(0,intent);
                finish();
            }
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("String");
        //Integer in = intent.getIntExtra("int", 20);
        Toast.makeText(this, str , Toast.LENGTH_SHORT).show();

    }
}
