import br.com.mariana.desafio.dominio.Curso;
import br.com.mariana.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Será estudado POO.");
        cursoJava.setCargaHoraria(40);

        Curso cursoKotlin = new Curso();
        cursoKotlin.setTitulo("Curso de Kotlin");
        cursoKotlin.setDescricao("Será desenvolvido um App.");
        cursoKotlin.setCargaHoraria(80);

        Mentoria mentoriaProgramacao = new Mentoria();
        mentoriaProgramacao.setTitulo("Mentoria de Programação");
        mentoriaProgramacao.setDescricao("Será abordado conteúdos de programação.");
        mentoriaProgramacao.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoKotlin);
        System.out.println(mentoriaProgramacao);
    }
}
