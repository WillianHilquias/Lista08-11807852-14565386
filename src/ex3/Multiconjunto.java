package ex3;
import java.util.*;

public interface Multiconjunto<T> {
    void add(T element);
    boolean equals(Multiconjunto<T> m);
    void addAll(Multiconjunto<T> m);
    Collection<T> getElements();
}

class ArrayListMulticonjunto<T> implements Multiconjunto<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(Multiconjunto<T> m) {
        return elements.equals(new ArrayList<>(m.getElements()));
    }

    public void addAll(Multiconjunto<T> m) {
        elements.addAll(m.getElements());
    }

    public Collection<T> getElements() {
        return elements;
    }
}

class SetMulticonjunto<T> implements Multiconjunto<T> {
    private Set<T> elements = new HashSet<>();

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(Multiconjunto<T> m) {
        return elements.equals(new HashSet<>(m.getElements()));
    }

    public void addAll(Multiconjunto<T> m) {
        elements.addAll(m.getElements());
    }

    public Collection<T> getElements() {
        return elements;
    }
}

class LinkedListMulticonjunto<T> implements Multiconjunto<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(Multiconjunto<T> m) {
        return elements.equals(new LinkedList<>(m.getElements()));
    }

    public void addAll(Multiconjunto<T> m) {
        elements.addAll(m.getElements());
    }

    public Collection<T> getElements() {
        return elements;
    }
}

class StackMulticonjunto<T> implements Multiconjunto<T> {
    private Stack<T> elements = new Stack<>();

    public void add(T element) {
        elements.push(element);
    }

    public boolean equals(Multiconjunto<T> m) {
        Stack<T> stack = new Stack<>();
        stack.addAll(m.getElements());
        return elements.equals(stack);
    }

    public void addAll(Multiconjunto<T> m) {
        elements.addAll(m.getElements());
    }

    public Collection<T> getElements() {
        return elements;
    }
}
