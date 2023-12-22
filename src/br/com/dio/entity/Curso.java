package br.com.dio.entity;

public class Curso extends Conteudo {

	private int workload;
	
	public Curso() {
		super();
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}
	
	@Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + workload +
                '}';
    }

	public double calcularXp() {
		return XP_PADRAO * workload;
	}
}
