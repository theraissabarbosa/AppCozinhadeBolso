package com.raissa.cozinhadebolso.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.raissa.cozinhadebolso.databinding.FragmentIngredientesBinding


 //Fragment responsável só por exibir a lista de ingredientes da receita

class IngredientesFragment : Fragment() {

    // Nullable fora do ciclo de vida da View
    private var _binding: FragmentIngredientesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // chamado quando a View do Fragment precisa ser criada/inflada.
        _binding = FragmentIngredientesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // chamado logo depois que a View já existe -> seguro acessar o binding.
        val ingredientes = arguments?.getStringArrayList(ARG_INGREDIENTES) ?: arrayListOf()
        binding.textViewIngredientes.text = ingredientes.joinToString("\n") { "- $it" }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_INGREDIENTES = "arg_ingredientes"

        fun newInstance(ingredientes: List<String>): IngredientesFragment {
            val fragment = IngredientesFragment()
            fragment.arguments = Bundle().apply {
                putStringArrayList(ARG_INGREDIENTES, ArrayList(ingredientes))
            }
            return fragment
        }
    }
}