package com.example.cah_ngganteng.datagudang_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AksiQc extends AppCompatActivity {

    EditText etData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksi_qc);

        etData = (EditText) findViewById(R.id.editTextData);

        Intent it = getIntent();
        String data = "No QC : " + it.getStringExtra("No QC");
        data =  data + "\nJenis Inspeksi : " + it.getStringExtra("Inspeksi");
        data = data + "\nNama Perangkat : " + it.getStringExtra("Perangkat");
        data = data + "\nTujuan Inspeksi : " + it.getStringExtra("Tujuan");
        data = data + "\nInspektor : " + it.getStringExtra("Inspektor");

        etData.setText(data);
    }
    public void diKlik(View v) {
        switch (v.getId()) {
            case R.id.button1:
                finish();
                break;

            default:
                break;
        }
    }
}
