package fr.dawan.quizzapp.entities;

import java.io.Serializable;
import java.time.LocalDate;

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
public class QuizzTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8215491007447572810L;
	/**
	 * 
	 */

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long QuizzTestId;
	private double score;
	private LocalDate DateQuizzTest;
	
	@ManyToOne
	@JoinColumn(name="CODE_QUIZZ")
	private Quizz quizz;
	@ManyToOne
	@JoinColumn(name="CODE_USER")
	private Users user;
}
