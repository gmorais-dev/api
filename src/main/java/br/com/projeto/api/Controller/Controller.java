package br.com.projeto.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Model.Cliente;


@RestController
public class Controller {

    @Autowired
    private br.com.projeto.api.Repository.Repository Acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){
        return Acao.save(c);

    }

    

    
    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return Acao.findAll();
    }

    @PutMapping("/")
    public Cliente editar(RequestBody Cliente c ){
        return Acao.save(c);

    }

    @DeleteMapping("/{codigo}")
    public void Remover Cliente(@PathVariable Long codigo){
        Acao.deleteById(codigo); 
    

    }
    
}

    

