package fr.imad.universite.note.controller;

import java.util.List;

import fr.imad.universite.note.domaine.Note;

public interface INoteController {

	public List<Note> getNote();

	public Note fNote(Integer idEtudiant, Integer idMatiere);

	public Note ajNote(Note note);

	public Note modnote(Note note, Integer idEtudiant, Integer idMatiere);

	public void supNote(Integer idEtudiant, Integer idMatiere);
}
