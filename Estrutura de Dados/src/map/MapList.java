package map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapList<Key, Element> implements Map<Key, Element> {
	private DNode header;
	private DNode trailer;
	private int size;

	public MapList() {
		header = new DNode();
		trailer = new DNode();
		header.setNext(trailer);
		trailer.setPrev(header);
		size = 0;
	}

	@Override
	public void clear() {
		header.setNext(trailer);
		trailer.setPrev(header);
	}

	@Override
	public boolean containsKey(Object key) {
		DNode aux = header.getNext();
		DNode aux1 = trailer.getPrev();
		for (int i = 0; i <= size; i++) {
			if (i <= size / 2) {
				if (aux.getKey() == key) {
					return true;
				}
				aux = aux.getNext();
			} else if (i > size / 2 && i < size) {
				if (aux1.getKey() == key) {
					return true;
				}
				aux1 = aux1.getPrev();
			}
		}

		return false;
	}

	@Override
	public boolean containsValue(Object element) {
		DNode aux = header.getNext();
		DNode aux1 = header.getPrev();
		for (int i = 0; i <= size; i++) {
			if (i <= size / 2) {
				if (aux.getKey() == element) {
					return true;
				}
				aux = aux.getNext();
			} else if (i > size / 2 && i < size) {
				if (aux1.getKey() == element) {
					return true;
				}
				aux1 = aux1.getPrev();
			}
		}

		return false;
	}

	@Override
	public Set<java.util.Map.Entry<Key, Element>> entrySet() {
		// TODO Ver a especificacao desse metodo.
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Element get(Object key) {
		if (!containsKey(key)) {
			return null;
		}
		DNode aux = header.getNext();
		DNode aux1 = trailer.getPrev();
		for (int i = 0; i <= size; i++) {
			if (i <= size / 2) {
				if (aux.getKey() == key) {
					return (Element) aux.getElement();
				}
				aux = aux.getNext();
			} else if (i > size / 2 && i < size) {
				if (aux1.getKey() == key) {
					return (Element) aux.getElement();
				}
				aux1 = aux1.getPrev();
			}
		}

		return null;
	}

	@Override
	public boolean isEmpty() {
		return (header.getNext() == trailer);
	}

	@Override
	public Set<Key> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Element put(Key key, Element element) {
		if (containsKey(key)) {
			DNode aux = header.getNext();
			DNode aux1 = trailer.getPrev();
			for (int i = 0; i <= size; i++) {
				if (i <= size / 2) {
					if (aux.getKey() == key) {
						Element objeto = (Element) aux.getElement();
						aux.setElement(element);
						return objeto;
					}
					aux = aux.getNext();
				} else if (i > size / 2 && i < size) {
					if (aux1.getKey() == key) {
						aux1.setElement(element);
					}
					aux1 = aux1.getPrev();
				}
			}

		} else {
			DNode second = trailer.getPrev();
			// element, key, next, prev;
			DNode novo = new DNode(element, key, trailer, second);
			second.setNext(novo);
			trailer.setPrev(novo);
		}
		size++;
		// TODO Caso não tenha elemento, retornar null ou o elemento inserido?
		return null;
	}

	@Override
	public void putAll(Map<? extends Key, ? extends Element> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Element remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@SuppressWarnings({ "unchecked", "null" })
	@Override
	public Collection<Element> values() {
		Collection<Element> collectionValues = null;

		DNode aux = header.getNext();
		while(aux!=trailer) {
		collectionValues.add((Element) aux.getElement());
		}

		return collectionValues;
	}

}
