package com.example.ap_projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ap_projet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private personne unePersonne;
    private float imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pseudo = binding.editTextPseudo.getText().toString();
                float taille = Float.parseFloat(binding.editTextTaille.getText().toString());
                float poids = Float.parseFloat(binding.editTextPoids.getText().toString());
                unePersonne = new personne(pseudo, taille, poids);

                Intent myIntent = new Intent(getApplicationContext(), second.class);
                myIntent.putExtra("personne", unePersonne);
                startActivity(myIntent);

            }
        });

    }
}