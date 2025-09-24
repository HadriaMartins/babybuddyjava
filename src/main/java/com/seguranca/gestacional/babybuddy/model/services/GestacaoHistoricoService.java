package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.GestacaoHistorico;
import com.seguranca.gestacional.babybuddy.model.repository.GestacaoHistoricoRepository;
import com.seguranca.gestacional.babybuddy.model.services.GestacaoHistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestacaoHistoricoService {

    @Autowired
    private GestacaoHistoricoRepository gestacaoHistoricoRepository;

    public List<GestacaoHistorico> findAll() {
        return gestacaoHistoricoRepository.findAll();
    }

    public GestacaoHistorico save(GestacaoHistorico gestacaoHistorico) {

        return gestacaoHistoricoRepository.save(gestacaoHistorico);
    }
}