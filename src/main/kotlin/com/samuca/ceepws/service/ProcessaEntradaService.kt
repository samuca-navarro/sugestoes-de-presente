package com.samuca.ceepws.service

import com.samuca.ceepws.model.SugestaoPresente
import com.samuca.ceepws.model.VariaveisCadastro
import com.samuca.ceepws.repository.CadastroRepository
import com.samuca.ceepws.repository.SugestaoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProcessaEntradaService {

    @Autowired
    lateinit var sugestaoRepository: SugestaoRepository

    @Autowired
    lateinit var cadastroRepository: CadastroRepository

    fun buscaInteligente(id2: Long): List<SugestaoPresente>{

        val cadastro: Optional<VariaveisCadastro> = cadastroRepository.findById(id2)

        if(cadastro.get().tipoDataComemorativa == "Aniversário de namoro"){
            return sugestaoRepository.findAll().toList()
        }

 //       return sugestaoRepository.findAll().toList()
        return emptyList()
    }

}