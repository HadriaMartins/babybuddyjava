package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.Agenda;
import com.seguranca.gestacional.babybuddy.model.repository.AgendaRepository;
import com.seguranca.gestacional.babybuddy.model.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    public Agenda save(Agenda agenda) {
        agenda.setStatus_evento(true);

        return agendaRepository.save(agenda);
    }
}