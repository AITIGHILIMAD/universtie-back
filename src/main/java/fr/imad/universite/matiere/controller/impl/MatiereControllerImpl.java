package fr.imad.universite.matiere.controller.impl;

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

import fr.imad.universite.matiere.business.IMatiereBusiness;
import fr.imad.universite.matiere.controller.IMatiereController;
import fr.imad.universite.matiere.domaine.Matiere;

@RestController
public class MatiereControllerImpl implements IMatiereController {
	@Autowired
	private IMatiereBusiness imatierebusiness;

	private static Logger logger = LoggerFactory.getLogger(MatiereControllerImpl.class);

	@Override
	@GetMapping("/matieres")
	public List<Matiere> getmatiere() {

		return imatierebusiness.getMatiere();

	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere getmatiere(@PathVariable Integer id) {

		return imatierebusiness.fmatiere(id);
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matiere modmatiere(@RequestBody Matiere matiere, @PathVariable Integer id) {
		matiere.setId(id);
		return imatierebusiness.modmatiere(matiere);
	}

	@Override
	@PostMapping("/matieres")
	public Matiere ajmatiere(@RequestBody Matiere matiere) {

		return imatierebusiness.ajoutmatiere(matiere);
	}

	@Override
	@DeleteMapping("/matieres/{id}")
	public void supmatiere(@PathVariable Integer id) {

		imatierebusiness.supmatiere(id);
	}

}
