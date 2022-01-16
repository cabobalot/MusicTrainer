package control;


import Model.Note;

import java.util.ArrayDeque;

/**
 * Driver class to create a stream of notes on the fly
 */
public class MusicGenerator {
	
	private int key;
	private ArrayDeque<Note> notes = new ArrayDeque<Note>();
	
	public MusicGenerator(int key) {
		
		notes.add(new Note(60, Note.NoteDuration.quarter));
		notes.add(new Note(62, Note.NoteDuration.quarter));
		notes.add(new Note(64, Note.NoteDuration.quarter));
		notes.add(new Note(65, Note.NoteDuration.quarter));
		notes.add(new Note(67, Note.NoteDuration.quarter));
	}
	
	
	public Note getNextNote() {
		return notes.pop();
	}
	
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
}
