package br.listadecompras.model

//data class significa que essa classe é umca classe de Dados, logo ela é um MODELO de Dados e tbm está vingulada à um modelo de dados
data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit
)