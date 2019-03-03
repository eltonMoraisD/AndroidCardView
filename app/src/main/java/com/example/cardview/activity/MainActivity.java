package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir o layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL); //outras formas de cardView - opcionais

        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2); //outras formas de cardView - opcionais

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setHasFixedSize(true);

        //Definir e adapter
        this.pepararPostagem();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void pepararPostagem(){
        postagens = new ArrayList<>();
        Postagem postagem = new Postagem("Elton Morais", "#AproveitandoAsFérias"
                ,R.drawable.imagem1);
        this.postagens.add(postagem);

        Postagem postagem1 = new Postagem("Elton Morais","#Aventuras"
                , R.drawable.imagem2);
        this.postagens.add(postagem1);

        Postagem postagem2 = new Postagem("Elton Morais","#Quase chegando"
                ,R.drawable.imagem3);
        this.postagens.add(postagem2);

        Postagem postagem3 = new Postagem("Elton Morais",
                "#Cansado mas aproveitando cada minuto", R.drawable.imagem4);
        this.postagens.add(postagem3);
    }
}
