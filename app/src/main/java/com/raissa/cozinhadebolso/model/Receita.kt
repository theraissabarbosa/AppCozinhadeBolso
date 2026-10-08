package com.raissa.cozinhadebolso.model

 //uma receita do catálogo.

data class Receita(
    val id: Int,
    val titulo: String,
    val categoria: String,
    val tempoPreparoMinutos: Int,
    val ingredientes: List<String>,
    val modoPreparo: String,
    val porcoes: Int? = null,
    val favorita: Boolean = false,
    val imagemRes: Int? = null
)