package modelo;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Getter
@Setter
@RequestScoped
@Named
public class Pessoa {
	
	private Usuario usuario = new Usuario();

	@NonNull
	@Size(min=3, max=50, message = "{nome.tamanho.minimo}")
	private String nome;
	
	@NonNull
	@Email
	private String email;
	
	private Date dataNascimento;	

}
