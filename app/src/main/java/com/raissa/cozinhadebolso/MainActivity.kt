package com.raissa.cozinhadebolso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.raissa.cozinhadebolso.data.MockReceitas
import com.raissa.cozinhadebolso.databinding.ActivityMainBinding
import com.raissa.cozinhadebolso.ui.detail.DetalheReceitaActivity
import com.raissa.cozinhadebolso.ui.list.ReceitaAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewReceitas.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewReceitas.adapter = ReceitaAdapter(MockReceitas.lista) { receita ->
            val intent = Intent(this, DetalheReceitaActivity::class.java)
            intent.putExtra(DetalheReceitaActivity.EXTRA_RECEITA_ID, receita.id)
            startActivity(intent)
        }
    }
}