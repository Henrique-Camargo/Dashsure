package dev.rick.Dashsure.service;

import dev.rick.Dashsure.repository.ClientUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientUserService {

    private final ClientUserRepository clientUserRepository;

    public ClientUserService(ClientUserRepository clientUserRepository) {
        this.clientUserRepository = clientUserRepository;
    }
}
