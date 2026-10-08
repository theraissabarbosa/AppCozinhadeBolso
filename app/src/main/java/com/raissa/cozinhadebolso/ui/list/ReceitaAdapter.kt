package com.raissa.cozinhadebolso.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raissa.cozinhadebolso.R
import com.raissa.cozinhadebolso.databinding.ItemReceitaBinding
import com.raissa.cozinhadebolso.model.Receita

class ReceitaAdapter(
    private val receitas: List<Receita>,
    private val onReceitaClick: (Receita) -> Unit
) : RecyclerView.Adapter<ReceitaAdapter.ReceitaViewHolder>() {

    inner class ReceitaViewHolder(val binding: ItemReceitaBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitaViewHolder {
        val binding = ItemReceitaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ReceitaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReceitaViewHolder, position: Int) {
        val receita = receitas[position]

        holder.binding.textViewTitulo.text = receita.titulo
        holder.binding.textViewCategoria.text = receita.categoria
        holder.binding.textViewTempo.text = "${receita.tempoPreparoMinutos} min"

        holder.binding.imageViewReceita.setImageResource(
            receita.imagemRes ?: iconePorCategoria(receita.categoria)
        )

        holder.binding.root.setOnClickListener {
            onReceitaClick(receita)
        }
    }

    override fun getItemCount(): Int = receitas.size

    private fun iconePorCategoria(categoria: String): Int = when (categoria) {
        "Doce" -> R.drawable.ic_doce
        "Salgado" -> R.drawable.ic_salgado
        "Bebida" -> R.drawable.ic_bebida
        else -> R.drawable.ic_salgado
    }
}