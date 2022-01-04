package br.com.sysve.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Data
public class Entity {
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	private UUID uuid;
	@Version
	private Integer version;
	private boolean active;

	@PrePersist
	private void prePersist(){
		this.active = Boolean.TRUE;
	}

}
