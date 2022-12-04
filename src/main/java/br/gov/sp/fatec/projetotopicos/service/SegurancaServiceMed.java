package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;
import br.gov.sp.fatec.projetotopicos.entity.Medida;

public interface SegurancaServiceMed {
    public List<Medida> buscarPorTemperatura(Float temperatura);
    
}