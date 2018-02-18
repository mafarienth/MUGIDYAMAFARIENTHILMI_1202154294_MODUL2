package com.example.arien.mugidyamafarienthilmi_1202154294_modul2;

/**
 * Created by ASUS on 2/18/2018.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String mSpinnerlabel = "";
    private EditText name;
    private Spinner meja;
    private Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //Mengambil referensi dan menaruhnya ke variable
        name = (EditText)findViewById(R.id.name);
        meja = (Spinner) findViewById(R.id.spinner);
        pilih = (Button) findViewById(R.id.pilih);

        //Membuat spinner untuk list meja dengan dropdown
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.meja, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika pilihan meja tidak samadengan null, makan adapter akan dijalankan
        if (meja != null) {
            meja.setAdapter(adapter);
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSpinnerlabel = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    //Pengisian informasi sebelum memilih menu
    public void pilih(View view) {
        String spinner = meja.getSelectedItem().toString();
        String a = name.getText().toString();
        if(a.isEmpty() || spinner.isEmpty()){
            Toast.makeText(DineInActivity.this,"Silahkan Lengkapi Data Terlebih Dahulu",Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(DineInActivity.this,DaftarMenuActivity.class);
            startActivity(intent);
            Toast.makeText(DineInActivity.this,"Silahkan Pilih Menu untuk " + spinner,Toast.LENGTH_LONG).show();
        }
    }
}
