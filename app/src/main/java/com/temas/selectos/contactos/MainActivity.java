package com.temas.selectos.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    RecyclerView rcListaContactos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcListaContactos = findViewById(R.id.rcListaContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rcListaContactos.setLayoutManager(llm);
        IniciarListaContactos();
        iniciarAdaptador();

    }

    public void iniciarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos,this);
        rcListaContactos.setAdapter(adaptador);
    }

    public void IniciarListaContactos()
    {
        contactos = new ArrayList<>();
        contactos.add(new Contacto("7772066862","@gmail.com",R.drawable.adriana));
        contactos.add(new Contacto("7772066862","sebastianseyer@hotmail.com",R.drawable.karla));
        contactos.add(new Contacto("7772066862","a@gmail.com",R.drawable.luisa));
    }
}
