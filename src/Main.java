import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoIntroducao = new Curso("Introdução à Programação e Pensamento Computacional",
                              "Você será capaz de entender o que significa pensar computacionalmente.",
                                5);

        Curso cursoGit = new Curso("Introdução ao Git e Github",
                                "Entendendo a importância e o funcionamento do Git. ",
                                6);

        Mentoria mentoriaSantader = new Mentoria("Santader Code Girls",
                                           "Live Inaugural do Bootcamp Santader Code Girls",
                                            LocalDate.of(2022, 7, 7));

        Bootcamp bootcampSantader = new Bootcamp("Bootcamp Santader Code Girls",
                "Bootcamp na trilha Java com aulas, atividades, desafios de códigos e projetos.");
        bootcampSantader.getConteudos().add(cursoIntroducao);
        bootcampSantader.getConteudos().add(cursoGit);
        bootcampSantader.getConteudos().add(mentoriaSantader);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreveEmBootcamp(bootcampSantader);

        System.out.println("Conteúdos Inscritos de "+ devCamila.getNome()+ ":\n" + devCamila.getConteudosInscritos());

        devCamila.avancaNoBootcamp();
        devCamila.avancaNoBootcamp();

        System.out.println("------");
        System.out.println("Conteúdos Inscritos de "+ devCamila.getNome()+ ":\n" + devCamila.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos de "+ devCamila.getNome()+ ":\n" + devCamila.getConteudosConcluidos());
        System.out.println("XP Total: " + devCamila.calculaTotalXp());
    }
}
