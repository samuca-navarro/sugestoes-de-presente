package com.samuca.ceepws.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class VariaveisCadastro(@Id
           @GeneratedValue
           @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
           val id: Long = 0L,
                             val nomePresenteador: String = "",
                             val nomePresenteada: String = "",
                             val tipoPresenteado: String = "", //adulto masculino/feminino, criança masculino/feminino, neutro
                             val relacao: String = "",//par amoroso, familiar, amigo
                             val tipoDataComemorativa: String = "", //aniversário, aniversário de namoro, natal
                             val personalidade1: String = "",//nerd, baladeiro, culto, comum
                             val personalidade2: String = ""//introvertido, extrovertido
)