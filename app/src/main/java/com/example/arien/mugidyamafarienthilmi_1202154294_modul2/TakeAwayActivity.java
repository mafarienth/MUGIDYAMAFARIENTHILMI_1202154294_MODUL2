package com.example.arien.mugidyamafarienthilmi_1202154294_modul2;

/**
 * Created by ASUS on 2/18/2018.
 */

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAwayActivity extends AppCompatActivity {
    private EditText name, phone, alamat, catatan;
    private Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //Membuat Adapter untuk menampilkan list Menu

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        alamat = (EditText)findViewById(R.id.alamat);
        catatan = (EditText)findViewById(R.id.catatan);
        pilih = (Button)findViewById(R.id.pilihPesanan);

        //untuk pengisian informasi
        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = name.getText().toString();
                String b = phone.getText().toString();
                String c = alamat.getText().toString();
                String d = catatan.getText().toString();

                if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty()){
                    Toast.makeText(TakeAwayActivity.this,"Isi Data dengan Lengkap", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(TakeAwayActivity.this,TakeAwayActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(TakeAwayActivity.this,"Silahkan Pilih Menu", Toast.LENGTH_LONG).show();
                    Intent intent2 = new Intent(TakeAwayActivity.this,DaftarMenuActivity.class);
                    startActivity(intent2);
                }
            }
        });

    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        // The month integer returned by the date picker starts counting at 0
        // for January, so you need to add 1 to show months starting at 1.
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, "Tanggal Pemesanan : " + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, "Jam Pemesanan : " + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
