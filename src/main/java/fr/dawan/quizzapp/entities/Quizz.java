package fr.dawan.quizzapp.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

@Entity
public class Quizz  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5156987783423833642L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long quizzId;
	private String quizzName;
	
	@OneToMany(mappedBy ="quizz")
	private Collection<QuizzTest> quizztest;
	
	@OneToMany(mappedBy ="quizz")
	private Collection<Question> question;
	
	
	@ManyToOne
	@JoinColumn(name="CODE_CATEGORIE")
	private Categorie categorie;
	

}
