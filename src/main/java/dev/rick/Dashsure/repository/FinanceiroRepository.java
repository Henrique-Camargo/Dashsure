package dev.rick.Dashsure.repository;

import dev.rick.Dashsure.domain.Financeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long> {
}
