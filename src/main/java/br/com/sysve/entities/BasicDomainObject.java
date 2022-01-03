package br.com.sysve.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Data
public class BasicDomainObject {
	@Id 
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private final Long id;
	private UUID uuid;

	@Embedded
	private ControlDomain control;
	
	
	public BasicDomainObject(Long id) {
		this.id = id;
		this.uuid = UUID.randomUUID();
	}

}
