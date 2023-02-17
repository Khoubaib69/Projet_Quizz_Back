package fr.dawan.quizzapp.entities;

import java.io.Serializable;
import java.util.Collection;

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
public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1151891947894571471L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long questionId;
	private String question;
	
	@ManyToOne
	@JoinColumn(name="CODE_QUIZZ")
	private Quizz quizz;
	
	@OneToMany(mappedBy ="question")
	private Collection<Reponse> reponse;


}
