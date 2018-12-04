package fr.imad.universite.etudiant.controller;

import java.util.List;

import fr.imad.universite.etudiant.domaine.Etudiant;

public interface IEtudiantController {

	public List<Etudiant> getalletudiant();

	public Etudiant findetudiant(Integer id);

	public Etudiant ajoutetudiant(Etudiant etudiant);

	public Etudiant modifieretudiant(Etudiant etudiant, Integer id);

	public void supetudiant(Integer id);
}
