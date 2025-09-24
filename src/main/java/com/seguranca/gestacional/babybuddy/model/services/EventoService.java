package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.Evento;
import com.seguranca.gestacional.babybuddy.model.repository.EventoRepository;
import com.seguranca.gestacional.babybuddy.model.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {

        return eventoRepository.findAll();
    }

    public Evento save(Evento evento) {

        return eventoRepository.save(evento);
    }
}
