package com.aplicacao.apiformulario.servico;

import com.aplicacao.apiformulario.modelo.DadosModelo;
import com.aplicacao.apiformulario.modelo.RespostaModelo;
import com.aplicacao.apiformulario.repositorio.DadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DadosServico {

    @Autowired
    private DadosRepositorio dadosRepositorio;

    @Autowired
    private RespostaModelo respostaModelo;

    public ResponseEntity<?> cadastrar(DadosModelo dadosModelo) {

        if (dadosModelo.getNome().equals("")){
            respostaModelo.setMensagem(("O nome é obrigatório"));
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<DadosModelo>(dadosRepositorio.save(dadosModelo), HttpStatus.CREATED);
            
        }
    }
}
