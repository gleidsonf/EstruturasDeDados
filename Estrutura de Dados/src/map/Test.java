package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer, Integer> mapa = new HashMap<>();
		int x = 100000;
		
		
		for (int i = 0; i < 100000; i++) {
			mapa.put(i, x);
			x--;
			System.out.println("indice " + i + " " + mapa.get(i));
		}
		
		System.out.println(mapa.containsKey(0));
	}
}
