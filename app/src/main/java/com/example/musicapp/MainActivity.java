package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout =(LinearLayout)findViewById(R.id.text1);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("A Cinderella Story ","Mudvayne"));
        words.add(new Word("Apocalypse ","Cigarettes"));
        words.add(new Word("Let Me Hear You","Romaji"));
        words.add(new Word("Numb","Linkin Park"));
        words.add(new Word("One Less Lonely girl","Justib Bieber"));
        words.add(new Word("One Time","Justin Bieber"));
        words.add(new Word("Roar","Katy Perry"));
        words.add(new Word("Someone Like You","Adele"));
        words.add(new Word("Someone You Love ","Lewis capaldi"));


        WordAdapter adapter;
        adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Play_Music.class);
            startActivity(intent);
            }
        });
    }


    }

