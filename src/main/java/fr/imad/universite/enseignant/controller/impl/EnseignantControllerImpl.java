package fr.imad.universite.enseignant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.imad.universite.enseignant.business.IEnseignantBusiness;
import fr.imad.universite.enseignant.controller.IEnseignantController;
import fr.imad.universite.enseignant.domaine.Enseignant;

@RestController
public class EnseignantControllerImpl implements IEnseignantController {
	@Autowired
	private IEnseignantBusiness ienseignantbusiness;

	private static Logger logger = LoggerFactory.getLogger(EnseignantControllerImpl.class);

	@Override
	@GetMapping("/enseignants")
	public List<Enseignant> getEnseignants() {
		logger.info("salut");
		logger.error("error");
		return ienseignantbusiness.getEnseignant();
	}

	@Override
	@GetMapping("/enseignants/{id}")
	public Enseignant findEnsiegnant(@PathVariable Integer id) {

		return ienseignantbusiness.findEnseigant(id);
	}

	@Override
	@PostMapping("/enseignants")
	public Enseignant ajoutenseignant(@RequestBody Enseignant enseignant) {

		return ienseignantbusiness.savenseignant(enseignant);
	}

	@Override
	@PutMapping("/enseignants/{id}")
	public Enseignant modifierenseignant(@RequestBody Enseignant enseignant, @PathVariable Integer id) {
		enseignant.setId(id);
		return ienseignantbusiness.modifierenseignant(enseignant);
	}

	@Override
	@DeleteMapping("/enseignants/{id}")
	public String supprimerenseignant(@PathVariable Integer id) {
		ienseignantbusiness.delateenseignant(id);
		return "Success";
	}

}
