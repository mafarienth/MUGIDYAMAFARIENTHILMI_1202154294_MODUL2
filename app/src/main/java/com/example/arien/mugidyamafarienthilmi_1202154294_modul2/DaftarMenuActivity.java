package com.example.arien.mugidyamafarienthilmi_1202154294_modul2;

/**
 * Created by ASUS on 2/18/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class DaftarMenuActivity extends AppCompatActivity {
    public static ArrayList<Menu> menuList = new ArrayList<>();

    private RecyclerView recyclerView;
    private MenusAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MenusAdapter(menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }



    public ArrayList<Menu> isiMenu(){
        ArrayList<Menu> data = new ArrayList<>();

        data.add(new Menu(R.drawable.appetizer,"Appetizer", "Harga : Rp 18.000", "Appetizer dengan cita rasa pedas dan lembut"));

        data.add(new Menu(R.drawable.barbeque,"Barbeque", "Harga : Rp 19.000","Tekstur daging yang lembut empuk, serta kulit yang begitu renyah. Rasanya lezat dengan wangi rempah"));

        data.add(new Menu(R.drawable.beef,"Beef", "Harga : Rp 21.000","Masakan dengan cita rasa pedas, dengan siraman saus kungpao dan kacang goreng"));

        data.add(new Menu(R.drawable.seafood,"Seafood", "Harga : Rp 22.500","Ikan dengan saos asam manis, serta topping mix vegetables"));

        data.add(new Menu(R.drawable.soup,"Soup", "Harga : Rp 15.000","Berisi udang, cumi dan baso ikan. Serta berbagai sayuran seperti brokoli, wortel dan jamur"));

        data.add(new Menu(R.drawable.vegetables,"Vegetables", "Harga : Rp 21.000","Terdiri dari broccoli dan jamur hitam, serta tumisan bawang putih"));

        data.add(new Menu(R.drawable.porridge,"Porridge", "Harga : Rp 16.000","Bubur polos dengan saus hongkong dan topping cakwe. kacang tanah serta potongan ayam hainan"));

        data.add(new Menu(R.drawable.drinks,"Drinks", "Harga : Rp 15.000","Berisi topping kacang merah, jagung manis, jelly melon, strawberry dan ice cream vanilla"));


        return data;

    }
}
