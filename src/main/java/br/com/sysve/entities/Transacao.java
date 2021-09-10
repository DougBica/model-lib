package br.com.sysve.entities;

import br.com.sysve.enumerators.StatusTransacao;
import br.com.sysve.enumerators.TipoTransacao;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "transacao")
@Data
public class Transacao extends CadastroGenerico{
    private BigDecimal valorTotal;
    private BigDecimal desconto;
    private LocalDateTime dataTransacao;
    private TipoTransacao tipo;
    private StatusTransacao status;

    @OneToMany(mappedBy = "transacao", cascade = CascadeType.ALL)
    private List<ProdutoTransacao> produtosTransacao;

}
