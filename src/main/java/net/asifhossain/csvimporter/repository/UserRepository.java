package net.asifhossain.csvimporter.repository;

import net.asifhossain.csvimporter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
