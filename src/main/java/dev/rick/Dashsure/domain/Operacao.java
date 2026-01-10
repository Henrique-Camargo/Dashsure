package dev.rick.Dashsure.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_operacao")
@NoArgsConstructor
@AllArgsConstructor
public class Operacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataOp;
    private BigDecimal investido;
    private BigDecimal retorno;
    private BigDecimal lucro;
    private BigDecimal comissaoOp;
    private BigDecimal comissaoUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataOp() {
        return dataOp;
    }

    public void setDataOp(LocalDate dataOp) {
        this.dataOp = dataOp;
    }

    public BigDecimal getInvestido() {
        return investido;
    }

    public void setInvestido(BigDecimal investido) {
        this.investido = investido;
    }

    public BigDecimal getRetorno() {
        return retorno;
    }

    public void setRetorno(BigDecimal retorno) {
        this.retorno = retorno;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }

    public BigDecimal getComissaoOp() {
        return comissaoOp;
    }

    public void setComissaoOp(BigDecimal comissaoOp) {
        this.comissaoOp = comissaoOp;
    }

    public BigDecimal getComissaoUser() {
        return comissaoUser;
    }

    public void setComissaoUser(BigDecimal comissaoUser) {
        this.comissaoUser = comissaoUser;
    }
}
