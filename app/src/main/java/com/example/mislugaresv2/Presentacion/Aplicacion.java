package com.example.mislugaresv2.Presentacion;

import android.app.Application;

import com.example.mislugaresv2.datos.AdaptadorLugares;
import com.example.mislugaresv2.datos.LugaresLista;
import com.example.mislugaresv2.datos.RepositorioLugares;


public class Aplicacion extends Application {
    public RepositorioLugares lugares = new LugaresLista();
    public AdaptadorLugares adaptador = new AdaptadorLugares(lugares);

    @Override public void onCreate() {
        super.onCreate();
    }
}
