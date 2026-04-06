package com.seguranca.gestacional.babybuddy.services;

import com.seguranca.gestacional.babybuddy.model.entity.Gestacao;
import com.seguranca.gestacional.babybuddy.repository.GestacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestacaoService {

    @Autowired
    private GestacaoRepository gestacaoRepository;

    public List<Gestacao> findAll() {
        return gestacaoRepository.findAll();
    }

    public Gestacao save(Gestacao gestacao) {
        gestacao.setStatusGestacao("ATIVO");

        return gestacaoRepository.save(gestacao);
    }
}
