package br.com.lucas9reis.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase( View view ) {
        String[] frases = {
                "A persistência é o caminho do êxito ",
                "Só existe um êxito: a capacidade de levar a vida que se quer ",
                "A vitalidade é demonstrada não apenas pela persistência, mas pela capacidade de começar de novo ",
                "O homem não teria alcançado o possível se, repetidas vezes, não tivesse tentado o impossível",
                "A coragem não é ausência do medo; é a persistência apesar do medo",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos",
                "Todo mundo é capaz de sentir os sofrimentos de um amigo. Ver com agrado os seus êxitos exige uma natureza muito delicada",
                "O sucesso tem uma estranha capacidade de esconder o erro",
                "Creia em si, mas não duvide sempre dos outros"
        };
        int i = new Random().nextInt(9);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[i]);
    }

}