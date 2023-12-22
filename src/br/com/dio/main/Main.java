package br.com.dio.main;

import java.time.LocalDate;

import br.com.dio.entity.Bootcamp;
import br.com.dio.entity.Curso;
import br.com.dio.entity.Desenvolvedor;
import br.com.dio.entity.Mentoria;

public class Main {

	public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitle("Curso React.JS");
        curso1.setDescription("Curso para capacitação de desenvolvedores react.js");
        curso1.setWorkload(50);

        Curso curso2 = new Curso();
        curso2.setTitle("Curso de Springboot");
        curso2.setDescription("Curso para capacitação de desenvolvedores springboot");
        curso2.setWorkload(120);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitle("Mentoria de Javascript");
        mentoria.setDescription("Mentoria para os alunos que estão com dificuldades no conteudo de javascript");
        mentoria.setMentorDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Desenvolvedor dev1 = new Desenvolvedor();
        dev1.setName("Rodrigo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev1.getName() +":" + dev1.getConteudosInscritos());
        dev1.progredirBootcamp();
        dev1.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+ dev1.getName() +":" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ dev1.getName() +":" + dev1.getConteudosFinalizados());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");
        
        Desenvolvedor dev2 = new Desenvolvedor();
        dev2.setName("Julia");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev2.getName() +":" + dev2.getConteudosInscritos());
        dev2.progredirBootcamp();
        dev2.progredirBootcamp();
        dev2.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+ dev2.getName() +":" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ dev2.getName() +":" + dev2.getConteudosFinalizados());
        System.out.println("XP:" + dev2.calcularTotalXp());

        System.out.println("-------");
        

    }

}
