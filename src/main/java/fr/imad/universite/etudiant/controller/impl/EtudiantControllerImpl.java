package fr.imad.universite.etudiant.controller.impl;

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

import fr.imad.universite.etudiant.business.impl.EtudiantBusinessImpl;
import fr.imad.universite.etudiant.controller.IEtudiantController;
import fr.imad.universite.etudiant.domaine.Etudiant;

@RestController
public class EtudiantControllerImpl implements IEtudiantController {

	@Autowired
	private EtudiantBusinessImpl etudiantbusinessimpl;

	private static Logger logger = LoggerFactory.getLogger(EtudiantControllerImpl.class);

	@Override
	@GetMapping("/etudiants")
	public List<Etudiant> getalletudiant() {

		return etudiantbusinessimpl.getEtudiant();
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiant findetudiant(@PathVariable Integer id) {

		return etudiantbusinessimpl.fetudiant(id);
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiant ajoutetudiant(@RequestBody Etudiant etudiant) {

		return etudiantbusinessimpl.savetudiant(etudiant);
	}

	@Override
	@PutMapping("/etudiants/{id}")
	public Etudiant modifieretudiant(@RequestBody Etudiant etudiant, @PathVariable Integer id) {
		etudiant.setId(id);
		return etudiantbusinessimpl.modifieretudiant(etudiant);
	}

	@Override
	@DeleteMapping("/etudiants/{id}")
	public void supetudiant(@PathVariable Integer id) {
		etudiantbusinessimpl.supetudiant(id);
	}

}
