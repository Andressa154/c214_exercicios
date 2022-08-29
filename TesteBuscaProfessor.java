
package teste;
import exercicio.BuscaProfessor;
import exercicio.Professor;
import exercicio.ProfessorService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class TesteBuscaProfessor {

    ProfessorService service;
    BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    }
    @Test
    public void testeBuscaProfessorRenzo(){
        Professor Renzo = buscaProfessor.buscaProfessor(2);
        assertEquals("Renzo", Renzo.getNome());
        assertEquals("14 horas", Renzo.getHorario_atendimento());
        assertEquals("Integral", Renzo.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorMarcelo(){
        Professor Marcelo = buscaProfessor.buscaProfessor(3);
        assertEquals("Marcelo", Marcelo.getNome());
        assertEquals("15 horas", Marcelo.getHorario_atendimento());
        assertEquals("Integral", Marcelo.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorChris(){
        Professor Chris= buscaProfessor.buscaProfessor(4);
        assertEquals("Chris", Chris.getNome());
        assertEquals("16 horas", Chris.getHorario_atendimento());
        assertEquals("Integral", Chris.getPeriodo());

    }

   
}


