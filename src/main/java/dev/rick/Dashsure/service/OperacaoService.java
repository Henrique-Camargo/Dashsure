package dev.rick.Dashsure.service;

import dev.rick.Dashsure.repository.OperacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class OperacaoService {

    private final OperacaoRepository operacaoRepository;

    public OperacaoService(OperacaoRepository operacaoRepository) {
        this.operacaoRepository = operacaoRepository;
    }
}
