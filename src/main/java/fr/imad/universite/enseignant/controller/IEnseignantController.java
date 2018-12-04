package fr.imad.universite.enseignant.controller;

import java.util.List;

import fr.imad.universite.enseignant.domaine.Enseignant;

public interface IEnseignantController {

	public List<Enseignant> getEnseignants();

	public Enseignant findEnsiegnant(Integer id);

	public Enseignant ajoutenseignant(Enseignant enseignant);

	public Enseignant modifierenseignant(Enseignant enseignant, Integer id);

	public String supprimerenseignant(Integer id);

}
