package br.com.giltech.android_mapas_basico.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.giltech.android_mapas_basico.R;

import static br.com.giltech.android_mapas_basico.util.Constantes.PERMISSIONS_USE_GPS_MAP;

public class MainActivity extends AppCompatActivity {

    private AppCompatActivity ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Button btnPermitir = (Button)findViewById(R.id.btn_permitir);
            btnPermitir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ActivityCompat.requestPermissions(ctx, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSIONS_USE_GPS_MAP);
                }
            });
        } else {
            init();
        }

    }

    private void init() {
        Intent i = new Intent(this, AcessoMapasActivity.class);
        startActivity(i);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case PERMISSIONS_USE_GPS_MAP: {
                    init();
                return;
            }
        }

    }
}
