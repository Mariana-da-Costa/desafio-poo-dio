import br.com.mariana.desafio.dominio.Bootcamp;
import br.com.mariana.desafio.dominio.Curso;
import br.com.mariana.desafio.dominio.Dev;
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

        Curso cursoIntelliJ = new Curso();
        cursoIntelliJ.setTitulo("Curso de IntelliJ");
        cursoIntelliJ.setDescricao("Será ensinado como instalar e usar a IDE IntelliJ.");
        cursoIntelliJ.setCargaHoraria(8);

        Mentoria mentoriaProgramacao = new Mentoria();
        mentoriaProgramacao.setTitulo("Mentoria de Programação");
        mentoriaProgramacao.setDescricao("Será abordado conteúdos de programação.");
        mentoriaProgramacao.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoKotlin);
        System.out.println(cursoIntelliJ);
        System.out.println(mentoriaProgramacao);

        System.out.println("---------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoIntelliJ);
        bootcamp.getConteudos().add(mentoriaProgramacao);

        Dev devMariana = new Dev();
        devMariana.setNome("Mariana da Costa");
        devMariana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMariana.getNome() + " :" + devMariana.getConteudosMatriculados());
        devMariana.progredir();
        devMariana.progredir();

        System.out.println("---------");

        System.out.println("Conteúdos Inscritos " + devMariana.getNome() + " :" + devMariana.getConteudosMatriculados());
        System.out.println("Conteúdos Concluídos " + devMariana.getNome() + " :" + devMariana.getConteudosConcluidos());
        System.out.println("XP:" + devMariana.calcularTotalXp());
    }
}
