package fr.imad.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.imad.universite.note.business.INoteBusiness;
import fr.imad.universite.note.controller.INoteController;
import fr.imad.universite.note.domaine.Note;

@RestController
public class NoteControllerImpl implements INoteController {

	@Autowired
	private INoteBusiness inotebusiness;

	@Override
	@GetMapping("/notes")
	public List<Note> getNote() {

		return inotebusiness.getnote();
	}

	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note fNote(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {

		return inotebusiness.fnote(idEtudiant, idMatiere);
	}

	@Override
	@PostMapping("/notes")
	public Note ajNote(@RequestBody Note note) {
		return inotebusiness.ajNote(note);
	}

	@Override
	@PutMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note modnote(@RequestBody Note note, @PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		return inotebusiness.modNote(note, idEtudiant, idMatiere);
	}

	@Override
	@DeleteMapping("/notes/{idEtudiant}/{idMatiere}")
	public void supNote(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		inotebusiness.supNote(idEtudiant, idMatiere);

	}

}
