package com.samuca.ceepws.controller

import com.samuca.ceepws.repository.CadastroRepository
import com.samuca.ceepws.model.VariaveisCadastro
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/cadastro")
class CadastroController {

    @Autowired
    lateinit var cadastroRepository: CadastroRepository

    @GetMapping
    fun list(): List<VariaveisCadastro>{
        return cadastroRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody variaveisCadastro: VariaveisCadastro): VariaveisCadastro {
        return cadastroRepository.save(variaveisCadastro)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        if(cadastroRepository.existsById(id)){
            return cadastroRepository.deleteById(id)
        }
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody variaveisCadastro: VariaveisCadastro): VariaveisCadastro{
        if(cadastroRepository.existsById(id)){
            val safeNote = variaveisCadastro.copy(id)
            return cadastroRepository.save(safeNote)
        }
            return VariaveisCadastro()
    }


}