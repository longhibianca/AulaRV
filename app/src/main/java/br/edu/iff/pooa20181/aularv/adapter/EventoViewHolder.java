package br.edu.iff.pooa20181.aularv.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.edu.iff.pooa20181.aularv.R;

/**
 * Created by Aluno on 11/06/2018.
 */

class EventoViewHolder extends RecyclerView.ViewHolder {

    //os elementos da view tem que ser replicados nesta classe
    private final TextView nomeEvento;
    private final TextView dataEvento;
    private final TextView enderecoEvento;

    public EventoViewHolder(View itemView) {
        super(itemView);
        nomeEvento = (TextView) itemView.findViewById(R.id.tvNomeEvento);
    }


}
