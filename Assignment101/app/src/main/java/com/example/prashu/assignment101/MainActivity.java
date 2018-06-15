package com.example.prashu.assignment101;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.inputField);
        button = (Button) findViewById(R.id.submit);  //initializing edit text and buttons
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.submit){  //if submit button is clicked then
            String data = editText.getText().toString();
            FragmentManager manager = getFragmentManager();  //create object for fragment manager
             FirstFragment firstFragment = (FirstFragment) manager.findFragmentById(R.id.fragment);
             //and change the text of the fragment as the data that we got frome edit text.
            firstFragment.changeText(data);


        }
    }
}
