package br.com.dio.entity;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate mentorDate;

	public Mentoria() {
		super();
	}
	
	public LocalDate getMentorDate() {
		return mentorDate;
	}
	
	public void setMentorDate(LocalDate mentorDate) {
		this.mentorDate = mentorDate;
	}
	
	@Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data =" + mentorDate +
                '}';
    }

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
}
