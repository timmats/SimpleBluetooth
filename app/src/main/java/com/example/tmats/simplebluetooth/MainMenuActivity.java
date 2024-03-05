package com.example.tmats.simplebluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainMenuActivity extends AppCompatActivity {

    private static final String TAG = "MainMenuActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        String[] settings = {"timer", "battery", "speaker", "general"};

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, settings);
        final ListView listView = (ListView) findViewById(R.id.SettingListView);

        Log.d(TAG, "OnCreate: Starting.");
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itempos = i;
                String value = (String) listView.getItemAtPosition(itempos);

                switch (value){
                    case "timer":
                        Intent TimerScreen = new Intent(MainMenuActivity.this, TimerActivity.class);
                        MainMenuActivity.this.startActivity(TimerScreen);
                        break;
                    case "battery":
                        Intent BatteryScreen = new Intent(MainMenuActivity.this, BatteryActivity.class);
                        MainMenuActivity.this.startActivity(BatteryScreen);
                        break;
                    case "speaker":
                        Intent SpeakerScreen = new Intent(MainMenuActivity.this, TimerActivity.class);
                        MainMenuActivity.this.startActivity(SpeakerScreen);
                        break;
                    case "general":
                        Intent GeneralScreen = new Intent(MainMenuActivity.this, BatteryActivity.class);
                        MainMenuActivity.this.startActivity(GeneralScreen);
                        break;
                }
            }
        });

/*
        Button toTimer = (Button) findViewById(R.id.timer);
        Button toBattery = (Button) findViewById(R.id.battery);
        Button toSpeaker = (Button) findViewById(R.id.speaker);
        Button toGeneral = (Button) findViewById(R.id.general);


        toTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked timer");

                Intent intent = new Intent(MainMenuActivity.this, TimerActivity.class);
                startActivity(intent);
            }


        });

        toBattery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked battery");

                Intent intent = new Intent(MainMenuActivity.this, BatteryActivity.class);
                startActivity(intent);
            }
        });*/

    }
}
