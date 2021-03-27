package com.samuca.ceepws.repository

import com.samuca.ceepws.model.VariaveisCadastro
import org.springframework.data.repository.CrudRepository

interface CadastroRepository : CrudRepository<VariaveisCadastro, Long>