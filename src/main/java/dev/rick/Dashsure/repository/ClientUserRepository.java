package dev.rick.Dashsure.repository;

import dev.rick.Dashsure.domain.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
}
