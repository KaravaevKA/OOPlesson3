package figures.base;

public interface ICollection<T> {
    void add(T element);
    void getInfoAll();
    T get(int index);
    T remove(int index);
    void add(Figure element);
}
