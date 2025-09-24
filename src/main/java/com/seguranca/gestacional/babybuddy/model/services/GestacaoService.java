package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.Gestacao;
import com.seguranca.gestacional.babybuddy.model.repository.GestacaoRepository;
import com.seguranca.gestacional.babybuddy.model.services.GestacaoService;
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
        gestacao.setStatus_gestacao(true);

        return gestacaoRepository.save(gestacao);
    }
}
