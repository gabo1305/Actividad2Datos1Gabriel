package List;

public interface List<T> {
    public abstract void AddTail(T Newinfo);
    public abstract boolean isEmpty();
    public abstract T get(int position);
    public abstract int getLength();
}
