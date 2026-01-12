package dev.rick.Dashsure.service;

import dev.rick.Dashsure.repository.FinanceiroRepository;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {

    private final FinanceiroRepository financeiroRepository;

    public FinanceiroService(FinanceiroRepository financeiroRepository) {
        this.financeiroRepository = financeiroRepository;
    }
}
