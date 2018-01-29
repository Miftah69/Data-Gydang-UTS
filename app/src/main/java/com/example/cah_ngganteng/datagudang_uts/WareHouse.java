package com.example.cah_ngganteng.datagudang_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WareHouse extends AppCompatActivity {

    EditText eKodeBarang;
    EditText eNamaBarang;
    EditText eTglProduksi;
    EditText eStock;
    EditText eOperator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ware_house);

        eKodeBarang = (EditText)findViewById(R.id.ekd_brg);
        eNamaBarang = (EditText)findViewById(R.id.eNm_brg);
        eTglProduksi = (EditText)findViewById(R.id.eTgl_Produksi);
        eStock = (EditText)findViewById(R.id.eStock);
        eOperator = (EditText)findViewById(R.id.eOperator);
    }
    public void saveOk(View view) {
        switch (view.getId()) {
            case R.id.klik:
                String kode = eKodeBarang.getText().toString();
                String nama = eNamaBarang.getText().toString();
                String tanggal = eTglProduksi.getText().toString();
                String stock =  eStock.getText().toString();
                String operator = eOperator.getText().toString();

                Intent intent = new Intent(this, AksiWarehouse.class);
                intent.putExtra("kode barang", kode);
                intent.putExtra("Nama", nama);
                intent.putExtra("Tanggal", tanggal);
                intent.putExtra("Stock", stock);
                intent.putExtra("Operator", operator);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
