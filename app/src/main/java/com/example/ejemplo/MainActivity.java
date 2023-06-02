package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ejemplo.fragments.InicioFragment;
import com.example.ejemplo.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments, InicioFragment.OnFragmentInteractionListener {

    Fragment fragmentoInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentoInicio = new InicioFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments, fragmentoInicio).commit();
    }

    public void onFragmentInteraction(Uri uri){

    }

    @Override
    public void iniciarPalabra() {
        Toast.makeText(getApplicationContext(), "Iniciar Palabra", Toast.LENGTH_SHORT).show();
    }
}