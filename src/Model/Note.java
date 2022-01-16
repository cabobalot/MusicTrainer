package Model;

public class Note {
	
	public enum NoteDuration {
		eighth,
		quarter,
		half,
		whole
	}
	
	private int note;
	private NoteDuration duration;
	
	
	public Note(int note, NoteDuration duration) {
		this.note = note;
		this.duration = duration;
	}
	
	public int getNote() {
		return note;
	}
	
	public void setNote(int note) {
		this.note = note;
	}
	
	public NoteDuration getDuration() {
		return duration;
	}
	
	public void setDuration(NoteDuration duration) {
		this.duration = duration;
	}
}


