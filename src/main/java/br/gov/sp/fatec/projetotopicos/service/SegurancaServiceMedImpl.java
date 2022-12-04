package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetotopicos.entity.Medida;
import br.gov.sp.fatec.projetotopicos.repository.MedidaRepository;

@Service
public class SegurancaServiceMedImpl implements SegurancaServiceMed {
    @Autowired
    private MedidaRepository medRepo;

    @Override
    public List<Medida> buscarPorTemperatura(Float temperatura){
        List<Medida> medidaOptional = medRepo.findByTemperaturaEquals(temperatura);
            return medidaOptional;
    }
}
