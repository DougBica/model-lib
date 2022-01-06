package br.com.sysve.entities;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
public class BasicEntity {
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

	public UUID getUuid() {
		return uuid;
	}

	public Integer getVersion() {
		return version;
	}

	public boolean isActive() {
		return active;
	}
}
