package ex4;

import java.util.*;
import ex3.*;

public class MulticonjuntoSetAdapter<T> implements Set<T> {
    private HashSet<T> elements;

    public MulticonjuntoSetAdapter(Multiconjunto<T> multiconjunto) {
        elements = new HashSet<>();
        for (T element : multiconjunto.getElements()) {
            elements.add(element);
        }
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    @Override
    public boolean add(T t) {
        return elements.add(t);
    }

    @Override
    public Object[] toArray() {
        return elements.toArray();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return elements.addAll(c);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public void clear() {
        elements.clear();
    }


    @Override
    public <T1> T1[] toArray(T1[] a) {
        return elements.toArray(a);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return elements.retainAll(c);
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

}
