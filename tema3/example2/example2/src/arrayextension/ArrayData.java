package arrayextension;

import java.util.ArrayList;

public class ArrayData<T, S> extends ArrayList<T> {
    
    public ArrayData<S, T> map (MapInterface<T, S> listener) {
        ArrayData<S, T> result = new ArrayData<S, T>();
        for(T item : this) {
            result.add(listener.run(item));
        }
        return result;
    }
    public ArrayData<T, S> filter (FilterInterface<T> listener) {
        ArrayData<T, S> result = new ArrayData<T , S>();
        for(T item : this) {
            if (listener.run(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
