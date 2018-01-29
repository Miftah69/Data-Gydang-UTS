package com.example.cah_ngganteng.datagudang_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Produk extends AppCompatActivity {
    EditText eKodeBarang;
    EditText eNamaBarang;
    EditText eTglProduksi;
    EditText eBlnProduksi;
    EditText eJumlahProduksi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        eKodeBarang = (EditText)findViewById(R.id.ekd_brg);
        eNamaBarang = (EditText)findViewById(R.id.eNm_brg);
        eTglProduksi = (EditText)findViewById(R.id.eTgl_Produksi);
        eBlnProduksi = (EditText)findViewById(R.id.eBln);
        eJumlahProduksi = (EditText)findViewById(R.id.eJmlhProduksi);
    }
    public void save(View view) {
        switch (view.getId()) {
            case R.id.simpan:
                String kode = eKodeBarang.getText().toString();
                String nama = eNamaBarang.getText().toString();
                String tanggal = eTglProduksi.getText().toString();
                String bulan = eBlnProduksi.getText().toString();
                String jumlah = eJumlahProduksi.getText().toString();

                Intent intent = new Intent(this, AksiProduk.class);
                intent.putExtra("kode barang", kode);
                intent.putExtra("Nama", nama);
                intent.putExtra("Tanggal", tanggal);
                intent.putExtra("Bulan", bulan);
                intent.putExtra("Jumlah", jumlah);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
