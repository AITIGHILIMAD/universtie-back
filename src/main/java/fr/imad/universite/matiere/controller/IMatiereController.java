package fr.imad.universite.matiere.controller;

import java.util.List;

import fr.imad.universite.matiere.domaine.Matiere;

public interface IMatiereController {

	public List<Matiere> getmatiere();

	public Matiere getmatiere(Integer id);

	public Matiere modmatiere(Matiere matiere, Integer id);

	public Matiere ajmatiere(Matiere matiere);

	public void supmatiere(Integer id);

}
