package com.example.cah_ngganteng.datagudang_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AksiWarehouse extends AppCompatActivity {

    EditText etData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksi_warehouse);

        etData = (EditText) findViewById(R.id.editTextData);

        Intent it = getIntent();
        String data = "Kode Barang : " + it.getStringExtra("kode barang");
        data =  data + "\nNama Barang : " + it.getStringExtra("Nama");
        data = data + "\nTanggal Produksi : " + it.getStringExtra("Tanggal");
        data = data + "\nStock Barang : " + it.getStringExtra("Stock");
        data = data + "\nOperator : " + it.getStringExtra("Operator");

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
