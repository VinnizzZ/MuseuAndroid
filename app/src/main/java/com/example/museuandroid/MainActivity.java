package com.example.museuandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton botao, textoInterativo, imagem, seeker, alert;
    private RadioGroup grupo;
    private Button cliqueAqui, agoraAqui, salvar, menos, mais, abrirDialog;
    private ImageView avatar1, avatar2;
    private TextView resultado, textoImagem;
    private EditText campo;
    private SeekBar seekBar;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando variaveis
        botao = findViewById(R.id.btnButtons);
        textoInterativo = findViewById(R.id.btnTextoInt);
        imagem = findViewById(R.id.btnImagem);
        seeker = findViewById(R.id.btnSeekbar);
        alert = findViewById(R.id.btnAlert);
        cliqueAqui = findViewById(R.id.btnCliqueAqui);
        agoraAqui = findViewById(R.id.btnAgoraAqui);
        salvar = findViewById(R.id.btnSalvar);
        menos = findViewById(R.id.btnMenos);
        mais = findViewById(R.id.btnMais);
        abrirDialog = findViewById(R.id.btnAbrirDialog);
        avatar1 = findViewById(R.id.imgFirst);
        avatar2 = findViewById(R.id.imgSecond);
        resultado = findViewById(R.id.textResultado);
        campo = findViewById(R.id.textDigite);
        seekBar = findViewById(R.id.seekBar);
        grupo = findViewById(R.id.radioGroup);
        textoImagem = findViewById(R.id.textImagem);

        radioGroup();

    }

    // Escolhendo qual função quer ver
    public void radioGroup(){
        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {

                // Deixando visivel e invisivel os itens conforme a escolha
                // Seção botões
                if(i == R.id.btnButtons){
                    cliqueAqui.setVisibility(View.VISIBLE);
                    agoraAqui.setVisibility(View.VISIBLE);
                    campo.setVisibility(View.GONE);
                    salvar.setVisibility(View.GONE);
                    resultado.setVisibility(View.GONE);
                    avatar1.setVisibility(View.GONE);
                    avatar2.setVisibility(View.GONE);
                    textoImagem.setVisibility(View.GONE);
                    menos.setVisibility(View.GONE);
                    mais.setVisibility(View.GONE);
                    seekBar.setVisibility(View.GONE);
                    abrirDialog.setVisibility(View.GONE);
                }
                // Seção Texto interativo
                if(i == R.id.btnTextoInt){
                    cliqueAqui.setVisibility(View.GONE);
                    agoraAqui.setVisibility(View.GONE);
                    campo.setVisibility(View.VISIBLE);
                    salvar.setVisibility(View.VISIBLE);
                    resultado.setVisibility(View.VISIBLE);
                    avatar1.setVisibility(View.GONE);
                    avatar2.setVisibility(View.GONE);
                    textoImagem.setVisibility(View.GONE);
                    menos.setVisibility(View.GONE);
                    mais.setVisibility(View.GONE);
                    seekBar.setVisibility(View.GONE);
                    abrirDialog.setVisibility(View.GONE);
                }
                // Seção imagens
                if(i == R.id.btnImagem){
                    cliqueAqui.setVisibility(View.GONE);
                    agoraAqui.setVisibility(View.GONE);
                    campo.setVisibility(View.GONE);
                    salvar.setVisibility(View.GONE);
                    resultado.setVisibility(View.GONE);
                    avatar1.setVisibility(View.VISIBLE);
                    avatar2.setVisibility(View.VISIBLE);
                    textoImagem.setVisibility(View.VISIBLE);
                    menos.setVisibility(View.GONE);
                    mais.setVisibility(View.GONE);
                    seekBar.setVisibility(View.GONE);
                    abrirDialog.setVisibility(View.GONE);
                }
                // Seção SeekBar
                if(i == R.id.btnSeekbar){
                    cliqueAqui.setVisibility(View.GONE);
                    agoraAqui.setVisibility(View.GONE);
                    campo.setVisibility(View.GONE);
                    salvar.setVisibility(View.GONE);
                    resultado.setVisibility(View.GONE);
                    avatar1.setVisibility(View.GONE);
                    avatar2.setVisibility(View.GONE);
                    textoImagem.setVisibility(View.GONE);
                    menos.setVisibility(View.VISIBLE);
                    mais.setVisibility(View.VISIBLE);
                    seekBar.setVisibility(View.VISIBLE);
                    abrirDialog.setVisibility(View.GONE);
                }
                // Seção alerta
                if(i == R.id.btnAlert){
                    cliqueAqui.setVisibility(View.GONE);
                    agoraAqui.setVisibility(View.GONE);
                    campo.setVisibility(View.GONE);
                    salvar.setVisibility(View.GONE);
                    resultado.setVisibility(View.GONE);
                    avatar1.setVisibility(View.GONE);
                    avatar2.setVisibility(View.GONE);
                    textoImagem.setVisibility(View.GONE);
                    menos.setVisibility(View.GONE);
                    mais.setVisibility(View.GONE);
                    seekBar.setVisibility(View.GONE);
                    abrirDialog.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    // Seção botões
    public void firstClick(View view){
        cliqueAqui.setText("");
        agoraAqui.setText("Agora aqui");
    }
    public void secondClick(View view){
        cliqueAqui.setText("Clique aqui");
        agoraAqui.setText("");
    }

    // Seção Texto Interativo
    public void enviar(View view){
        String digitado = campo.getText().toString();
        resultado.setText(digitado);
    }

    // Seção Imagens

    public void mudarImagem(View view){
        if(i == 0){
            avatar1.setImageResource(R.drawable.cao1);
            i += 1;
        }else if(i == 1){
            avatar1.setImageResource(R.drawable.cao2);
            i += 1;
        }else if(i == 2){
            avatar1.setImageResource(R.drawable.cao3);
            i = 0;
        }
    }

    public void mudarImagem2(View view){
        if(i == 0){
            avatar2.setImageResource(R.drawable.gato1);
            i += 1;
        }else if(i == 1){
            avatar2.setImageResource(R.drawable.gato2);
            i += 1;
        }else if(i == 2){
            avatar2.setImageResource(R.drawable.gato3);
            i = 0;
        }
    }

    // Seção SeekBar
    public void aumentar(View view){
        int progresso = seekBar.getProgress();
        seekBar.setProgress(progresso + 1);
    }
    public void diminuir(View view){
        int progresso = seekBar.getProgress();
        seekBar.setProgress(progresso - 1);
    }

    // Seção AlertDialog


    public void abrirAlerta(View view){
        // Criando o builder do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        // Definindo a mensagem principal e titulo
        builder.setMessage("Gostaria de fechar?");
        builder.setTitle("ALERTA!!!");

        // Proibindo o cancelamento do AlertDialog ao clicar fora
        builder.setCancelable(false);

        // Criando botões SIM e NÃO
        builder.setPositiveButton("SIM", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(getApplicationContext(), "Opção escolhida: SIM", Toast.LENGTH_LONG).show();
        });
        builder.setNegativeButton("NÃO", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(getApplicationContext(), "Opção escolhida: NÃO", Toast.LENGTH_LONG).show();
        });

        // Criando e apresentando o AlertDialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}