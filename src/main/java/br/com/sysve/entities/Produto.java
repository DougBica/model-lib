package br.com.sysve.entities;

import br.com.sysve.converter.annotations.ConverterReferenceDto;
import br.com.sysve.converter.annotations.ConverterReferenceField;
import br.com.sysve.dtos.ProdutoDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="produto")
@Data
@ConverterReferenceDto(ProdutoDto.class)
public class Produto extends BasicDomainObject {

	@ConverterReferenceField("nomeProduto")
	private String nome;
	private BigDecimal quantidadeEmbalagem;
	private BigDecimal valorVenda;
	private Long codigoBarra;
	private String caminhoImagem;

    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
    private List<ProdutoTransacao> produtoTransacao;

}
