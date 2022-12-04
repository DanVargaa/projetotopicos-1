package br.gov.sp.fatec.projetotopicos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.SimpleDateFormat;  
import java.util.Date; 

@Entity
@Table(name = "medida")
public class Medida {

    public Medida() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medida_id")
    private Long id;

    @Column(name ="temperatura")
    private Float temperatura;

    @Column(name ="fumaca")
    private Float fumaca;

    @Column(name ="date_time")
    private String data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getFumaca() {
        return this.fumaca;
    }

    public void setFumaca(Float fumaca) {
        this.fumaca = fumaca;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
