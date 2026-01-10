package dev.rick.Dashsure.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_finances")
public class Financeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataPag;
    private String status;
    private String comprovante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPag() {
        return dataPag;
    }

    public void setDataPag(LocalDate dataPag) {
        this.dataPag = dataPag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }
}
