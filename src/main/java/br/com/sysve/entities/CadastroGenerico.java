package br.com.sysve.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Data
public class CadastroGenerico {
	@Id 
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Long id;
	private UUID uuid;

	@Embedded
	private Controle controle;
	
	
	public CadastroGenerico() {
		this.uuid = UUID.randomUUID();
	}

}
