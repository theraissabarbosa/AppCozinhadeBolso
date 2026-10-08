package com.raissa.cozinhadebolso.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raissa.cozinhadebolso.R
import com.raissa.cozinhadebolso.data.MockReceitas
import com.raissa.cozinhadebolso.databinding.ActivityDetalheReceitaBinding

class DetalheReceitaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheReceitaBinding
    private var favorita = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheReceitaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receitaId = intent.getIntExtra(EXTRA_RECEITA_ID, -1)
        val receita = MockReceitas.lista.find { it.id == receitaId }

        if (receita == null) {
            finish()
            return
        }

        favorita = receita.favorita

        binding.textViewTitulo.text = receita.titulo
        binding.textViewCategoria.text = receita.categoria

        val porcoesTexto = receita.porcoes?.let { " · $it porções" } ?: ""
        binding.textViewTempoPorcoes.text = "${receita.tempoPreparoMinutos} min$porcoesTexto"

        binding.textViewModoPreparo.text = receita.modoPreparo

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainerIngredientes,
                    IngredientesFragment.newInstance(receita.ingredientes)
                )
                .commit()
        }

        atualizarBotaoFavoritar()

        binding.buttonFavoritar.setOnClickListener {
            favorita = !favorita
            atualizarBotaoFavoritar()
        }
    }

    private fun atualizarBotaoFavoritar() {
        binding.buttonFavoritar.text = if (favorita) {
            getString(R.string.favoritado)
        } else {
            getString(R.string.favoritar)
        }
    }

    companion object {
        const val EXTRA_RECEITA_ID = "extra_receita_id"
    }
}