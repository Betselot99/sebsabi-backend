package et.com.gebeya.safaricom.coreservice.repository;

import et.com.gebeya.safaricom.coreservice.model.Client;
import et.com.gebeya.safaricom.coreservice.model.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByEmail(String email);
    long countClientsByIsActive(Status status);
    @Query("SELECT c.companyType, COUNT(c) FROM Client c GROUP BY c.companyType")
    List<Object[]> countClientsByCompanyType();

    Page<Client> findAll(Specification<Client> spec, Pageable pageable);
}
