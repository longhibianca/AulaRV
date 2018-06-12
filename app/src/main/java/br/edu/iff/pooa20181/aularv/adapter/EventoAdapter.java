package br.edu.iff.pooa20181.aularv.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

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
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
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
