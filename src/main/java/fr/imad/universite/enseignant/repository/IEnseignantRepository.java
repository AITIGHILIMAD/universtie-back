package fr.imad.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.imad.universite.enseignant.domaine.Enseignant;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant , Integer> {

}
