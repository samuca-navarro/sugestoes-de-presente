package com.samuca.ceepws.controller

import com.samuca.ceepws.model.SugestaoPresente
import com.samuca.ceepws.repository.CadastroRepository
import com.samuca.ceepws.repository.SugestaoRepository
import org.springframework.beans.factory.annotation.Autowired
import com.samuca.ceepws.service.ProcessaEntradaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/sugestao")
class SugestaoController {

    @Autowired
    lateinit var cadastroRepository: CadastroRepository

    @Autowired
    lateinit var processaEntradaService: ProcessaEntradaService

    @Autowired
    lateinit var sugestaoRepository: SugestaoRepository

    @PostMapping
    fun adicionaSugestao(@RequestBody sugestaoPresente: SugestaoPresente): SugestaoPresente{
        return sugestaoRepository.save(sugestaoPresente)
    }

    @GetMapping("{id2}")
    fun buscarSugestao(@PathVariable id2: Long): List<SugestaoPresente>{
        if(cadastroRepository.existsById(id2)){
            return processaEntradaService.buscaInteligente(id2)
        }
        return emptyList()
    }


}