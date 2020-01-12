package com.erocha.pedrapapelououtesouraprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcacaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcacaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcacaoSelecionada("tesoura");
    }

    public void opcacaoSelecionada(String opcaoUsuario) {

        ImageView imageResultado = findViewById(R.id.imagemResultado);
        TextView texto = findViewById(R.id.textoResultado);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;


        }


        if(
           (escolhaApp == "tesoura" && opcaoUsuario == "papel")||
           (escolhaApp == "papel" && opcaoUsuario == "pedra") ||
           (escolhaApp == "pedra" && opcaoUsuario == "tesoura")

        ){


            texto.setText("Você perdeu! :(");
        }

        else if (
                (opcaoUsuario == "tesoura" && escolhaApp == "papel")||
                (opcaoUsuario == "papel" && escolhaApp == "pedra") ||
                (opcaoUsuario == "pedra" && escolhaApp == "tesoura")
        ){


            texto.setText("Você ganhou :)");

        } else {

            texto.setText("Empatamos ;)");
        }


    }

}
