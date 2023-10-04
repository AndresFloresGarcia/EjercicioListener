package com.example.ejerciciolistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ejerciciolistener.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.Boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int mat = Integer.valueOf(binding.Matematicas.getText().toString());
        int fis = Integer.valueOf(binding.Fisica.getText().toString());
        int qui = Integer.valueOf(binding.Quimica.getText().toString());

        int media = (mat + fis + qui) / 3;

        if (media < 5){
            binding.Texto.setText("Suspendido con media de: " + media);
        } else {
            binding.Texto.setText("Aprobado con media de: " + media);
        }
    }
}