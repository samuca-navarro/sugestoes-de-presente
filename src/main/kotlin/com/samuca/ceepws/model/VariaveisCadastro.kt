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
                             val idade: String = "",
                             val sexo: String = "",
                             val relacao: String = "",
                             val cidade: String = "",
                             val estiloMusicalPreferido: String = "",
                             val religiao: String = "",
                             val tipoPasseioFavorito: String = "",
                             val tipoFilmePreferido: String = "",
                             val tipoDataComemorativa: String = "",
                             val pet: String = "",
                             val comidaFavorita: String = "",
                             val areaTrabalho: String = "",
                             val areaEstudo: String = "",
                             val tipoPersonalidadeA: String = "",
                             val tipoPersonalidadeB: String = "",
                             val tipoPersonalidadeC : String = "",
                             val tipoPersonalidadeD: String = ""
)