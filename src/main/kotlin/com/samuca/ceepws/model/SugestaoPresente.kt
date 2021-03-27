package com.samuca.ceepws.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
data class SugestaoPresente(
    @Id
    @GeneratedValue
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(value = "id2", access = JsonProperty.Access.READ_ONLY)
    //@Column("id")
    val id2: Long = 0L,
    val nome: String = "",
    val descricao: String = "",
    val tipoPresente: String = "",
    val pontuacao: String = ""
)