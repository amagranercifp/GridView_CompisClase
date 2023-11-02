package com.example.gridview_compisclase;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MiArrayAdapterAlumnos extends ArrayAdapter<Alumno> {

    private final Activity context;

    ArrayList<Alumno> alumnos;

    LayoutInflater inflater;

    public MiArrayAdapterAlumnos(Activity c, ArrayList<Alumno> alumnos) {
        super(c, R.layout.alumno_gridview_item,alumnos);
        this.context = c;
        this.alumnos = alumnos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.alumno_gridview_item,null,true);

        Alumno alumno = alumnos.get(position);

        ImageView ivAvatarAlumno;
        TextView tvNombreAlumno;

        tvNombreAlumno= (TextView) rowView.findViewById(R.id.tvNombreAlumno);
        ivAvatarAlumno= (ImageView) rowView.findViewById(R.id.ivAvatarAlumno);

        tvNombreAlumno.setText(alumno.getNombre());
        ivAvatarAlumno.setImageResource(alumno.getAvatar());

        return rowView;

    };
}
