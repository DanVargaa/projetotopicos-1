package br.gov.sp.fatec.projetotopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.projetotopicos.entity.Medida;

public interface MedidaRepository extends JpaRepository<Medida , Long>{
    public List <Medida> findByTemperaturaEquals(Float temperatura);
}
