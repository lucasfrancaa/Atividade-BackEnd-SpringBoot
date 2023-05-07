package com.aplicacao.apiformulario.controle;

import com.aplicacao.apiformulario.modelo.DadosModelo;
import com.aplicacao.apiformulario.servico.DadosServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class DadosControle {

    @Autowired
    private DadosServico dadosServico;

    @GetMapping("/")
    public String rota(){
        return "API para formulário funcionando";
    }

    @PostMapping("/cadastrar")
        public ResponseEntity<?>enviar(@RequestBody DadosModelo dadosModelo){
        return dadosServico.cadastrar(dadosModelo);
    }


}
