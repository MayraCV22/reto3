package com.example.r3cardview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RecyclerList> listaRecicler;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rv = findViewById(R.id.recyclerview1);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new GridLayoutManager(this,2));

        listaRecicler = new ArrayList<RecyclerList>();
        listaRecicler.add(new RecyclerList(R.drawable.adidas,"Adidas"));
        listaRecicler.add(new RecyclerList(R.drawable.converse,"Converse"));
        listaRecicler.add(new RecyclerList(R.drawable.newbalance,"New Balance"));
        listaRecicler.add(new RecyclerList(R.drawable.nike,"Nike"));
        listaRecicler.add(new RecyclerList(R.drawable.reebok,"Reebok"));
        listaRecicler.add(new RecyclerList(R.drawable.sneakers,"Sneakers"));
        listaRecicler.add(new RecyclerList(R.drawable.vans,"Vans"));
        listaRecicler.add(new RecyclerList(R.drawable.mizuno,"Mizuno"));
        listaRecicler.add(new RecyclerList(R.drawable.freestyler,"Freestyler"));
        listaRecicler.add(new RecyclerList(R.drawable.merrell,"Merrell"));

        ReciclerAdapter ra  = new ReciclerAdapter(listaRecicler, this);
        rv.setAdapter(ra);
    }
}