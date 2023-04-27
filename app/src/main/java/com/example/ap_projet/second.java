package com.example.ap_projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ap_projet.databinding.ActivityMainBinding;
import com.example.ap_projet.databinding.ActivitySecondBinding;

public class second extends AppCompatActivity {

    private ActivitySecondBinding binding;
    private personne unePersonne;
    private float imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent myIntent = getIntent();
        personne unePersonne = (personne)myIntent.getSerializableExtra("personne");

        binding.affichageImc.setText(unePersonne.toString());

    }
}