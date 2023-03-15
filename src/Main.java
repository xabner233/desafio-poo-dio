import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Dev");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Incritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Cusos Concluidos: "+devCamila.getConcluidos());
        System.out.println("---");
        System.out.println("Conteudos Incritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("-----------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Incritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos Incritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularXp());



    }
}
