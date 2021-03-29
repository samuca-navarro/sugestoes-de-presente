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


            return sugestaoRepository.findAll().filter{ it.tipoPresenteado == cadastro.get().tipoPresenteado &&
                        it.relacao == cadastro.get().relacao &&
                        it.tipoDataComemorativa == cadastro.get().tipoDataComemorativa &&
                        it.personalidade1 == cadastro.get().personalidade1 &&
                        it.personalidade2 == cadastro.get().personalidade2
            }.toList()

    }

}