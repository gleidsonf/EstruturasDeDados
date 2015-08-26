package lita.tad;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			lista.add(i);
		}
		System.out.println(lista.toString());

		for (int i = 0; i < lista.size() / 2; i++) {
			Integer c = lista.get(i);
			lista.set(i, lista.get((lista.size() - 1 - i)));
			lista.set((lista.size() - 1 - i), c);
		}
		System.out.println(lista.toString());

	}
}
