package com.example.cah_ngganteng.datagudang_uts;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu extends ListActivity {

    /** Called when the activity is first created. */

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Buat String Array, yang akan ditampilkan di ListActivity
        String[] hitungrumus = new String[] {"Produck", "Qc", "WareHouse","Exit"};
        // Buat sebuah ArrayAdapter, yang akan menaruh String tadi
        // tampil di ListView
        //Menset nilai array ke dalam list adapater sehingga data pada array akan dimunculkan dalam list
        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, hitungrumus));
    }

    @Override
    /**method ini akan mengoveride method onListItemClick yang ada pada class List Activity
     * method ini akan dipanggil apabilai ada salah satu item dari list menu yang dipilih
     */
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        // Get the item that was clicked
        // Menangkap nilai text yang dklik
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        // Menampilkan hasil pilihan menu dalam bentuk Toast
        tampilkanPilihan(pilihan);
    }

    /**
     * Tampilkan Activity sesuai dengan menu yang dipilih
     *
     */
    protected void tampilkanPilihan(String pilihan) {
        try {
            //Intent digunakan untuk sebagai pengenal suatu activity
            Intent i = null;
            if (pilihan.equals("Produck")) {
                i = new Intent(this, Produk.class);
            } else if (pilihan.equals("Qc")) {
                i = new Intent(this, Qc.class);
            } else if (pilihan.equals("WareHouse")) {
                i = new Intent(this, WareHouse.class);
            } else if (pilihan.equals("Exit")) {
                finish();
            } else {
                Toast.makeText(this,"Anda Memilih: " + pilihan + " , Actionnya belum dibuat", Toast.LENGTH_LONG).show();
            }
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
