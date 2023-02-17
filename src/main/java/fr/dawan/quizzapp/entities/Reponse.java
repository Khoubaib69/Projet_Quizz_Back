package fr.dawan.quizzapp.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Reponse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reponseId;
	private String reponse;
	private boolean isCorrect;
	
	@ManyToOne
	@JoinColumn(name="CODE_QUESTION")
	private Question question;
	

}
