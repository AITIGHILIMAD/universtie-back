package fr.imad.universite.note.business;

import java.util.List;

import fr.imad.universite.note.domaine.Note;

public interface INoteBusiness {

	public List<Note> getnote();

	public Note fnote(Integer idEtudiant, Integer idMatiere);

	public Note ajNote(Note note);

	public Note modNote(Note note, Integer idEtudiant, Integer idMatiere);

	public void supNote(Integer idEtudiant, Integer idMatiere);
}
