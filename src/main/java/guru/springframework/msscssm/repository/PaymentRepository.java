package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by @author stopp on 12/08/2021
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
