package br.com.sysve.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Data
public class BasicDomainObject {
	@Id 
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Long id;
	private UUID uuid;

	@Embedded
	private ControlDomain control;
	
	
	public BasicDomainObject() {
		this.uuid = UUID.randomUUID();
	}

}
