package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    /*
        Estamos dizendo ao Android que queremos escrever nosso próprio código para a
        a função onCreate, que é uma parte importante de como um aplicativo Android
        funciona.
     */
    override fun onCreate(savedInstanceState: Bundle?) { // Criamos uma váriavel do tipo Bundle(pacote)
        // ?  indica que esta variável pode conter um valor Bundle ou ser null
        super.onCreate(savedInstanceState)

        // Para acessar tudo o que está disponivel no diretório "res", utilizamos uma
        // classe especial chamada R

        // val nome = findViewById<TextView>(R.id.nome)
        // nome.text = "Cesta de Frutas"

        // val descricao = findViewById<TextView>(R.id.decricao)
        // descricao.text = "Laranja, Manga e Uva"

        // val valor = findViewById<TextView>(R.id.valor)
        // valor.text = "19.99"

        val recycleView = findViewById<RecyclerView>(R.id.recyclerView)
        recycleView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
                Produto(
                    nome = "Teste",
                    descricao = "teste desc",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 1",
                    descricao = "teste desc 1",
                    valor = BigDecimal("29.99")
                ),
        ))
        recycleView.layoutManager = LinearLayoutManager(this)


        // Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_LONG).show()
    }
}