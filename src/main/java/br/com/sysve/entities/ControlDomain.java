package br.com.sysve.entities;


import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;
import java.time.LocalDateTime;


@Embeddable
@Data
public class ControlDomain {
    private LocalDateTime registerDate;
    private LocalDateTime editDate;
    private Long usuarioEdicao;
    @Version
    private Integer version;
    private boolean active;

    @PrePersist
    private void onPersist(){
        this.active = Boolean.TRUE;
        this.registerDate = LocalDateTime.now();
        this.editDate = LocalDateTime.now();
    }

    @PreUpdate
    private void onUpdate(){
        this.editDate = LocalDateTime.now();
    }

}
