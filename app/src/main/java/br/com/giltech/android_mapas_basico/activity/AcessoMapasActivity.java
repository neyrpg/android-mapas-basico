package br.com.giltech.android_mapas_basico.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.giltech.android_mapas_basico.R;

public class AcessoMapasActivity extends AppCompatActivity {

    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acesso_mapas);

        Button btnMapaBasico = (Button)findViewById(R.id.btn_mapa_basico);
        Button btnMapaMovimento = (Button)findViewById(R.id.btn_mapa_movimento);


        btnMapaBasico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, MapsBasicoActivity.class);
                startActivity(i);
            }
        });

        btnMapaMovimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
