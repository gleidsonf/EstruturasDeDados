package lista.lde.completa1;

public interface LDE<Tipo> {
	void insertLast(Tipo obj);

	void insertFirst(Tipo obj);

	Tipo removeFirst();

	Tipo removeLast();

	Tipo first();

	Tipo last();

	int size();

	boolean isEmpty();
}
