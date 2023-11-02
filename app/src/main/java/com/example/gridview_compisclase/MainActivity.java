package com.example.gridview_compisclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView listadoGrid;
    private MiArrayAdapterAlumnos adapterAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadoGrid = (GridView) findViewById(R.id.gvCompañeros);

        ArrayList<Alumno> claseAlumnos = new ArrayList<>();
        claseAlumnos.add(new Alumno("Chico-1",R.drawable.avatar1_chico));
        claseAlumnos.add(new Alumno("Chica-1",R.drawable.avatar2_chica));
        claseAlumnos.add(new Alumno("Chico-2",R.drawable.avatar3_chico));
        claseAlumnos.add(new Alumno("Chica-2",R.drawable.avatar4_chica));


        adapterAlumnos = new MiArrayAdapterAlumnos(this,claseAlumnos);
        listadoGrid.setAdapter(adapterAlumnos);

        listadoGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Alumno alumno = adapterAlumnos.getItem(position);

                Toast.makeText(view.getContext(), "Has pulsado en el alumno: "+alumno.getNombre(),Toast.LENGTH_SHORT).show();

                Intent i = new Intent(view.getContext(), ChatActivity.class);

                i.putExtra("extra_alumno",alumno);

                startActivity(i);

            }
        });
    }
}