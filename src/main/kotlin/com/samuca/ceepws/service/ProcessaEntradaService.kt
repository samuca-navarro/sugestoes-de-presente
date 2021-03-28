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

    fun buscaInteligente(id: Long): List<SugestaoPresente>{

        val cadastro: Optional<VariaveisCadastro> = cadastroRepository.findById(id)

        if(cadastro.get().relacao == "colega"){
            return sugestaoRepository.findAll().filter{ it.pontuacao <= "6" }.toList()
        }

        if(cadastro.get().relacao == "amigo(a)" && cadastro.get().tipoDataComemorativa == ""){
            return sugestaoRepository.findAll().filter{ it.pontuacao >= "7" && it.pontuacao <= "12"}.toList()
        }

        if(cadastro.get().relacao == "amigo(a)" && cadastro.get().tipoDataComemorativa !== ""){
            return sugestaoRepository.findAll().filter{ it.pontuacao >= "13" && it.pontuacao <= "18"}.toList()
        }

        if(cadastro.get().relacao == "par romântico" && cadastro.get().tipoDataComemorativa == ""){
            return sugestaoRepository.findAll().filter{ it.pontuacao >= "19" && it.pontuacao <= "24"}.toList()
        }

        if(cadastro.get().relacao == "par romântico" && cadastro.get().tipoDataComemorativa !== ""){
            return sugestaoRepository.findAll().filter{ it.pontuacao >= "25" && it.pontuacao <= "30"}.toList()
        }

        return emptyList()
    }

}