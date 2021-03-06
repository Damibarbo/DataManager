package com.example.voltifyd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText titolo, autore, genere, durata;
    Button inserisci, mostra;
    GestoreBrani songManager = new GestoreBrani();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titolo = findViewById(R.id.titoloCanzone);
        autore = findViewById(R.id.autoreCanzone);
        genere = findViewById(R.id.genereCanzone);
        durata = findViewById(R.id.durataCanzone);
        inserisci = findViewById(R.id.inserisci);
        mostra = findViewById(R.id.mostra);
        GestoreBrani gb = new GestoreBrani();

        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(titolo.getText().toString(), autore.getText().toString(), genere.getText().toString(), Integer.getInteger(durata.getText().toString()));
            }
        });

        mostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}