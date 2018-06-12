package br.edu.iff.pooa20181.aularv.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.edu.iff.pooa20181.aularv.R;
import br.edu.iff.pooa20181.aularv.model.Evento;

/**
 * Created by Aluno on 11/06/2018.
 */

//a classe adapter tem que extender o adapter do recycler view
public class EventoAdapter extends RecyclerView.Adapter
{

    private List<Evento> eventos;
    //atrib para saber em que tela ele está
    private Context context;
    //é uma interface onde tem o método onclick
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    //construtor
    public EventoAdapter(List<Evento> eventos, Context context, ClickRecyclerViewListener clickRecyclerViewListener) {
        this.eventos = eventos;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    //responsavel por preencher o recycler view na tela
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //cria uma view de layout inflater
        //pega o layout do item e coloca dentro do recyclerview(método de infiltração)
        //pega todos os elementos, junta e mostra dentro do recyclerview
        View view = LayoutInflater.from(context).inflate(R.layout.item_evento, parent, false);
        EventoViewHolder eventoViewHolder = new EventoViewHolder(view, nomeEvento, dataEvento, enderecoEvento);

        return eventoViewHolder;
    }

    //método no qual pega os elementos dos eventos e faz a ligação com a tela
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
