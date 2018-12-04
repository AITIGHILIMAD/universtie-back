package fr.imad.universite.note.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imad.universite.note.domaine.Note;
import fr.imad.universite.note.domaine.NotePK;
import fr.imad.universite.note.repository.INoteRepository;

@Service
public class NoteBusinessImpl implements INoteBusiness {
	@Autowired
	private INoteRepository inoterepository;

	@Override
	public List<Note> getnote() {
		return inoterepository.findAll();

	}

	@Override
	public Note fnote(Integer idMatiere, Integer idEtudiant) {
		NotePK pk = new NotePK();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		return inoterepository.getOne(pk);

	}

	@Override
	public Note ajNote(Note note) {

		return inoterepository.save(note);
	}

	@Override
	public Note modNote(Note note, Integer idEtudiant, Integer idMatiere) {
		NotePK pk = new NotePK();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		note.setNotepk(pk);
		return inoterepository.save(note);
	}

	@Override
	public void supNote(Integer idEtudiant, Integer idMatiere) {
		NotePK pk = new NotePK();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		inoterepository.deleteById(pk);
	}
}
