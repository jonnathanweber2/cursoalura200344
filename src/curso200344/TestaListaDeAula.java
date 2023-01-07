package curso200344;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Aula 01", 21);
		Aula a2 = new Aula("Aula 05", 31);
		Aula a3 = new Aula("Aula 03", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		//aulas.add("teste");
		
		System.out.println(aulas);
		
		Collections.sort(aulas);

		System.out.println(aulas);

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);


	}
}
