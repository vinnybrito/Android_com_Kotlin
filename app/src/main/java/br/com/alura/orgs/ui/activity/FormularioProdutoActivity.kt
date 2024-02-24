package br.com.alura.orgs.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity :
    AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val botaoSalvar = findViewById<Button>(R.id.butao_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()

            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val descricao = campoDescricao.text.toString()

            val camporValor = findViewById<EditText>(R.id.valor)
            val valor = camporValor.text.toString()

            Produto(
                nome = nome,
                descricao = descricao,
                valor = BigDecimal(valor)
            )

            Log.i("FormularioProduto", "onCreate: $nome")
        }


    }

}