package org.sid.dao;

import org.sid.entite.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface SalleDao extends JpaRepository<Salle, Long> {

}
