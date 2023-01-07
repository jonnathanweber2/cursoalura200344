//git push --set-upstream origin master
package curso200344;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aula: "+ titulo + " - tempo: " + tempo + ". ";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
