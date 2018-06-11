package br.edu.iff.pooa20181.aularv.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.edu.iff.pooa20181.aularv.R;

// tem que fazer esse implement, para quando clicar em um item, abrir algo
// o implement obriga a implementar o método onItemClick
public class Principal extends AppCompatActivity implements AdapterView.OnItemClickListener{

    //array de strings com nome das activities que irão aparecer no menu(list view)
    private String[] activities = {"ListaEventoActivity"};
    // lista de eventos(nome que vai estar no itemMenu)
    private String[] itemMenuNome = {"Eventos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        // Adapter faz a ligação da tela com a lista de elementos que serão mostrados no list view
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemMenuNome);

        //pega o elemento da view
        ListView listView = (ListView) findViewById(R.id.listaMenu);
        //passa o adapter pra poder mostrar a lista no list view
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    //quando clicar no evento(item da lista), acontece o que estiver aqui
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        //intent é usado para chamar uma outra activity(tela)
        Intent intent = null;

        try {
            // maneira de instaciar objeto de uma classe dinamicamente.
            // cria uma classe com o nome em activities[position]. A classe é criada dentro do pacote activity
            Class obj = Class.forName ("br.edu.iff.pooa20181.aularv.activity."+activities[position]);
            //faz mudar para a activity criada
            intent = new Intent(this, obj);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        startActivity(intent);

    }

}