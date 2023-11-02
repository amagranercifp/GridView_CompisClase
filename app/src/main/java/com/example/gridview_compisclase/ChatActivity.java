package com.example.gridview_compisclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    private Bundle bundleAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        bundleAlumno = getIntent().getExtras();

        Alumno alumno = (Alumno) bundleAlumno.getSerializable("extra_alumno");

        ImageView ivAvatarChat;
        TextView tvNomAlumnoChat,tvMensaje,tvHora;

        ivAvatarChat = (ImageView) findViewById(R.id.ivAvatarChat);
        tvNomAlumnoChat = (TextView) findViewById(R.id.tvNomAlumnoChat);
        tvMensaje = (TextView) findViewById(R.id.tvMensaje);
        tvHora = (TextView) findViewById(R.id.tvHora);

        ivAvatarChat.setImageResource(alumno.getAvatar());
        tvNomAlumnoChat.setText(alumno.getNombre());



    }
}