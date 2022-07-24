import br.com.mariana.desafio.dominio.Curso;
import br.com.mariana.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Será estudado POO.");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Kotlin");
        curso2.setDescricao("Será desenvolvido um App.");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Programação");
        mentoria.setDescricao("Será abordado conteúdos de programação.");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
