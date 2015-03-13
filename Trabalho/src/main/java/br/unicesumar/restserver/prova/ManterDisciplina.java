package br.unicesumar.restserver.prova;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
@Transactional
public class ManterDisciplina {
    
    @Autowired
    private EntityManager em;
    
    public List<Disciplina> getDisciplinas(){
        return null;
    }
    
    public void criarDisciplina(@RequestBody Disciplina disciplina) {
    }        
    
    public void alterarDisciplina(@RequestBody Disciplina disciplina) {
    }        
    
    public void excluirDisciplina(@PathVariable Long id) {
    } 
}
