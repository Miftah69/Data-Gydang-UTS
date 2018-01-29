package com.example.cah_ngganteng.datagudang_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AksiProduk extends AppCompatActivity {

    EditText etData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksi_produk);

        etData = (EditText) findViewById(R.id.editTextData);

        Intent it = getIntent();
        String data = "\nKode Barang : " + it.getStringExtra("kode barang");
        data =  data + "Nama Barang : " + it.getStringExtra("Nama");
        data = data + "\nTanggal Produksi : " + it.getStringExtra("Tanggal");
        data = data + "\nBulan Produksi : " + it.getStringExtra("Bulan");
        data = data + "\nJumlah Produksi : " + it.getStringExtra("Jumlah");

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
