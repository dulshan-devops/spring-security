package lk.nibm.springsec.repositories;

import lk.nibm.springsec.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users , Integer> {
    Users findByUsername(String username);
}
