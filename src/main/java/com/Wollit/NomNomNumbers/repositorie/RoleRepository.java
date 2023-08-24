package com.Wollit.NomNomNumbers.repositorie;

import com.Wollit.NomNomNumbers.model.Role;
import com.Wollit.NomNomNumbers.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(Roles name);
}
