package br.gov.sp.fatec.projetotopicos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.gov.sp.fatec.projetotopicos.entity.Medida;
import br.gov.sp.fatec.projetotopicos.service.SegurancaServiceMed;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value= "/medida")
@CrossOrigin
public class MedidaController {
    @Autowired
    private SegurancaServiceMed SegSevMed;

    @GetMapping(value ="/{temperatura}")
    public List<Medida> findByTemperaturaEquals(@PathVariable("temperatura") Float temperatura){
        return SegSevMed.buscarPorTemperatura(temperatura);
    }
}
