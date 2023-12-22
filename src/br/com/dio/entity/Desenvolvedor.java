package br.com.dio.entity;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor {

	private String name;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudo());
		bootcamp.getDevsIncritos().add(this);
	}
	
	public void progredirBootcamp() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosFinalizados.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else
			System.err.println("O aluno não está matriculado em nenhum curso/mentoria do bootcamp.");
	}
	
	public double calcularTotalXp() {
		return this.conteudosFinalizados
				.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosFinalizados() {
		return conteudosFinalizados;
	}

	public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
		this.conteudosFinalizados = conteudosFinalizados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosFinalizados, conteudosInscritos, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Desenvolvedor other = (Desenvolvedor) obj;
		return Objects.equals(conteudosFinalizados, other.conteudosFinalizados)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(name, other.name);
	}
	
	
}
