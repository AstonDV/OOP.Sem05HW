package Model.Abstracts;

import java.util.Iterator;
import java.util.List;

public abstract class EntitiesGroupIterator<T extends EntitiesGroup<E>, E extends Entity> implements Iterator<E> {
    protected int index;
    protected List<E> eList;

    public EntitiesGroupIterator(T tGroup) {
        this.index = 0;
        this.eList = tGroup.getValues();
    }

    protected abstract List<E> getList();
}