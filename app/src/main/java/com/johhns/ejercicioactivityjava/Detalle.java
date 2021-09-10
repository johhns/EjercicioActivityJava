package com.johhns.ejercicioactivityjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Detalle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ListView lv_dias = (ListView)  findViewById(R.id.lista_dias) ;
        String [] a_dias = getResources().getStringArray(R.array.dias) ;
        lv_dias.setAdapter( new ArrayAdapter<>( Detalle.this , android.R.layout.simple_list_item_1 , a_dias ) );

    }
}