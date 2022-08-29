
package teste;

import exercicio.ProfessorService;

public class MockProfessorService implements ProfessorService {


    @Override
    public String busca(int id) {

        if (id == 2){
            return ProfessorConst.Renzo;
        }else if (id ==3){
            return ProfessorConst.Marcelo;
        }else if(id == 4){
            return ProfessorConst.Chris;
        }else{
      return ProfessorConst.INEXISTENTE;
        }
    }

   
}