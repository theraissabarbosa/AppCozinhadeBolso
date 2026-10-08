package com.raissa.cozinhadebolso.data

import com.raissa.cozinhadebolso.model.Receita

 // lista fixa de receitas

object MockReceitas {

    val lista: List<Receita> = listOf(
        Receita(
            id = 1,
            titulo = "Brigadeiro de Enrolar",
            categoria = "Doce",
            tempoPreparoMinutos = 30,
            porcoes = 25,
            ingredientes = listOf(
                "1 lata de leite condensado",
                "1 colher de sopa de manteiga",
                "4 colheres de sopa de chocolate em pó",
                "Chocolate granulado para enrolar"
            ),
            modoPreparo = "Misture o leite condensado, a manteiga e o chocolate em pó em uma " +
                    "panela e leve ao fogo baixo, mexendo sempre até desgrudar do fundo. " +
                    "Deixe esfriar por completo, unte as mãos com manteiga, enrole as bolinhas " +
                    "e passe no granulado."
        ),
        Receita(
            id = 2,
            titulo = "Doce de Leite na Panela de Pressão",
            categoria = "Doce",
            tempoPreparoMinutos = 60,
            porcoes = 6,
            ingredientes = listOf(
                "1 lata de leite condensado fechada",
                "Água suficiente para cobrir a lata"
            ),
            modoPreparo = "Retire o rótulo e a cola da lata fechada, coloque na panela de " +
                    "pressão e cubra com água. Depois que a panela pegar pressão, cozinhe por " +
                    "30 minutos. Desligue, espere toda a pressão sair sozinha e retire a lata. " +
                    "Deixe esfriar completamente antes de abrir."
        ),
        Receita(
            id = 3,
            titulo = "Caipirinha",
            categoria = "Bebida",
            tempoPreparoMinutos = 5,
            porcoes = 1,
            ingredientes = listOf(
                "1 limão",
                "1 colher de sopa de açúcar",
                "50 ml de cachaça",
                "Gelo a gosto"
            ),
            modoPreparo = "Corte o limão em pedaços, tirando a parte branca do centro para " +
                    "não amargar. Coloque no copo com o açúcar e amasse de leve. " +
                    "Adicione a cachaça e bastante gelo e misture bem."
        ),
        Receita(
            id = 4,
            titulo = "Bolo de Cenoura com Cobertura de Chocolate",
            categoria = "Doce",
            tempoPreparoMinutos = 50,
            porcoes = 8,
            ingredientes = listOf(
                "3 cenouras médias",
                "4 ovos",
                "1 xícara de óleo",
                "2 xícaras de açúcar",
                "2 xícaras de farinha de trigo",
                "1 colher de sopa de fermento em pó"
            ),
            modoPreparo = "Bata no liquidificador os ovos, o óleo e as cenouras até ficar " +
                    "homogêneo. Em uma tigela, misture o açúcar e a farinha, junte a mistura " +
                    "líquida e por último o fermento. Asse em forno médio (180°C) por cerca " +
                    "de 40 minutos."
        ),
        Receita(
            id = 5,
            titulo = "Strogonoff de Frango",
            categoria = "Salgado",
            tempoPreparoMinutos = 35,
            porcoes = 4,
            ingredientes = listOf(
                "500g de peito de frango em cubos",
                "1 cebola picada",
                "2 dentes de alho",
                "200g de creme de leite",
                "2 colheres de sopa de ketchup",
                "1 colher de sopa de mostarda"
            ),
            modoPreparo = "Refogue a cebola e o alho no óleo, adicione o frango e doure bem. " +
                    "Acrescente o ketchup, a mostarda e o creme de leite, mexendo até engrossar. " +
                    "Cozinhe em fogo baixo por 10 minutos e sirva com arroz branco."
        ),
        Receita(
            id = 6,
            titulo = "Lasanha de Presunto e Queijo",
            categoria = "Salgado",
            tempoPreparoMinutos = 50,
            porcoes = 6,
            ingredientes = listOf(
                "1 pacote de massa de lasanha que dispensa pré-cozimento",
                "300g de presunto fatiado",
                "300g de mussarela fatiada",
                "100g de mussarela ralada",
                "1 litro de leite",
                "3 colheres de sopa de farinha de trigo",
                "2 colheres de sopa de manteiga",
                "Sal e noz-moscada a gosto"
            ),
            modoPreparo = "Faça o molho branco: derreta a manteiga, junte a farinha e adicione " +
                    "o leite aos poucos, mexendo até engrossar; tempere com sal e noz-moscada. " +
                    "Em um refratário, monte camadas de molho, massa, presunto e mussarela, " +
                    "terminando com molho e mussarela ralada. Cubra com papel-alumínio e asse a " +
                    "200°C por 25 minutos; tire o papel e deixe mais 10 minutos para gratinar."
        )
    )
}