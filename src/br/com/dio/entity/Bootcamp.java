package br.com.dio.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String name;
	private String description;
	private final LocalDate startDate = LocalDate.now();
	private final LocalDate finalDate = startDate.plusDays(60);
	private Set<Desenvolvedor> devsIncritos = new HashSet<>();
	private Set<Conteudo> conteudo = new HashSet<>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Set<Desenvolvedor> getDevsIncritos() {
		return devsIncritos;
	}
	
	public void setDevsIncritos(Set<Desenvolvedor> devsIncritos) {
		this.devsIncritos = devsIncritos;
	}
	
	public Set<Conteudo> getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getFinalDate() {
		return finalDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, description, devsIncritos, finalDate, name, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(description, other.description)
				&& Objects.equals(devsIncritos, other.devsIncritos) && Objects.equals(finalDate, other.finalDate)
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate);
	}
}
