package br.com.sysve.entities;


import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.Version;
import java.time.LocalDateTime;


@Embeddable
@Data
public class Controle {
    private LocalDateTime dataCadastro;
    private LocalDateTime dataEdicao;
    private Long usuarioEdicao;
    @Version
    private Integer versao;
    private Boolean ativo;

    @PrePersist
    private void onPersist(){
        this.ativo = Boolean.TRUE;
        this.dataCadastro = LocalDateTime.now();
        this.dataEdicao = LocalDateTime.now();

    }


}
