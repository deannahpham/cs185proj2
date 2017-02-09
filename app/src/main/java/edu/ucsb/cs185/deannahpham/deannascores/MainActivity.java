package edu.ucsb.cs185.deannahpham.deannascores;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.graphics.Color;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public EditText Team1Score, Team2Score;
    public AutoCompleteTextView Team1, Team2;
    public DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.Team1);
        String[] TEAMS = getResources().getStringArray(R.array.TEAMS);

        ArrayAdapter adapter = new ArrayAdapter (this,android.R.layout.simple_list_item_1,TEAMS);
        actv.setAdapter(adapter);

        AutoCompleteTextView actv2 = (AutoCompleteTextView) findViewById(R.id.Team2);
        String[] TEAMS2 = getResources().getStringArray(R.array.TEAMS);

        ArrayAdapter adapter2 = new ArrayAdapter (this,android.R.layout.simple_list_item_1,TEAMS2);
        actv2.setAdapter(adapter2);

        Team1 = (AutoCompleteTextView) findViewById(R.id.Team1);
        Team2 = (AutoCompleteTextView) findViewById(R.id.Team2);
        Team1Score = (EditText) findViewById(R.id.Team1Score);
        Team2Score = (EditText) findViewById(R.id.Team2Score);

        Team1.setHintTextColor(Color.BLACK);
        Team2.setHintTextColor(Color.BLACK);
        Team1Score.setHintTextColor(Color.BLACK);
        Team2Score.setHintTextColor(Color.BLACK);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        datePicker.updateDate(2014, Calendar.AUGUST, 16);

    }


    public void clearFields(View view) {
        Team1.setText("");
        Team1.setHint("Team 1 Name");
        Team2.setText("");
        Team2.setHint("Team 2 Name");
        Team1Score.setText("");
        Team1Score.setHint("0");
        Team2Score.setText("");
        Team2Score.setHint("0");
        datePicker.updateDate(2014, Calendar.AUGUST, 16);
    }

}
