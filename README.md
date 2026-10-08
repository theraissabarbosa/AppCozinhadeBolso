# CozinhaDeBolso — Catálogo de Receitas

## Objetivo do aplicativo
Aplicativo Android individual desenvolvido para a disciplina de Mobile I. Funciona como um catálogo de receitas culinárias: o usuário navega por uma lista de receitas e acessa os detalhes de cada uma (ingredientes e modo de preparo), podendo marcá-las como favoritas.

**Etapa atual:** Parcial —> Android Views (XML), navegação por Intent e Fragment. Dados mockados (sem API ou banco de dados).

## Como rodar o projeto localmente
1. Abra o [Android Studio]
2. Clone este repositório:
   ```
   git clone https://github.com/theraissabarbosa/AppCozinhadeBolso.git
   ```
3. Abra a pasta do projeto no Android Studio.
4. Aguarde o Gradle Sync terminar.
5. Selecione um emulador .
6. Clique em Run para instalar e abrir o app.

Este projeto não usa nenhuma chave de API nem variável sensível, portanto não é necessário nenhum arquivo `.env`.

## Bibliotecas externas utilizadas
- **AndroidX AppCompat** — compatibilidade de componentes de UI entre versões do Android
- **AndroidX ConstraintLayout** — construção dos layouts das telas
- **AndroidX RecyclerView** — exibição da lista de receitas
- **AndroidX Fragment** — exibição dos ingredientes como um componente de interface independente
- **Material Components** — componentes visuais padrão do Android

## Funcionalidades implementadas
- Lista de receitas (dados mockados) em `RecyclerView`
- Navegação para a tela de detalhe via `Intent` explícita, passando o id da receita
- Tela de detalhe exibindo título, categoria, tempo de preparo, porções, ingredientes e modo de preparo
- Ingredientes exibidos através de um `Fragment` com `ViewBinding`, demonstrando seu ciclo de vida
- Botão de favoritar, que atualiza a interface ao ser clicado