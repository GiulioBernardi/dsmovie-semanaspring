package com.devsuperiorgiulio.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	private Double value;
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	public Double getValue() {
		return value;
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
