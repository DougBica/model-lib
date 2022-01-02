package br.com.sysve.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "produtTransacao")
@Entity
@Data
public class ProdutoTransacao extends BasicDomainObject {
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;

    @ManyToOne
    @JoinColumn(name = "id")
    private Transacao transacao;

    @ManyToOne
    @JoinColumn(name = "id")
    private Produto produto;

}