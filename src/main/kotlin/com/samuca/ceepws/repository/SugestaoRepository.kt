package com.samuca.ceepws.repository

import com.samuca.ceepws.model.SugestaoPresente
import org.springframework.data.repository.CrudRepository

interface SugestaoRepository : CrudRepository<SugestaoPresente, Long> {

}