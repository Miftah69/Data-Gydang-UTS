package com.example.cah_ngganteng.datagudang_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Qc extends AppCompatActivity {

    EditText etNoQc;
    EditText etInpeksi;
    EditText etPerangkat;
    EditText etTujuan;
    EditText etInspektor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qc);

        etNoQc = (EditText)findViewById(R.id.eNoQc);
        etInpeksi = (EditText)findViewById(R.id.eInspeksi);
        etPerangkat = (EditText)findViewById(R.id.ePerangkat);
        etTujuan = (EditText)findViewById(R.id.eTujuan);
        etInspektor = (EditText)findViewById(R.id.eInspektor);
    }
    public void simpandulu(View view) {
        switch (view.getId()) {
            case R.id.save:
                String qc = etNoQc.getText().toString();
                String inspeksi = etInpeksi.getText().toString();
                String perangkat = etPerangkat.getText().toString();
                String tujuan = etTujuan.getText().toString();
                String inspektor = etInspektor.getText().toString();

                Intent intent = new Intent(this, AksiQc.class);
                intent.putExtra("No QC", qc);
                intent.putExtra("Inspeksi", inspeksi);
                intent.putExtra("Perangkat", perangkat);
                intent.putExtra("Tujuan", tujuan);
                intent.putExtra("Inspektor", inspektor);
                startActivity(intent);
                break;

            default:
                break;
        }
    }

    public void exit(View v) {
        switch (v.getId()) {
            case R.id.keluar:
                finish();
                break;

            default:
                break;
        }
    }
}
