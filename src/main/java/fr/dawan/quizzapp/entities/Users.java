package fr.dawan.quizzapp.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import fr.dawan.quizzapp.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Users  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6832247712707550439L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long userId ;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false, unique= true)
	private String email;
	@Column(nullable=false)
	private String password;
	@OneToMany(mappedBy ="user")
	private Collection<QuizzTest> quizzTest;
	@Enumerated(EnumType.STRING)
	private Roles role;
	
	
	

}
