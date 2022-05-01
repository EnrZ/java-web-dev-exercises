package exercises.technology;

import java.util.Objects;

public abstract class AbstractEntity {
    private int id;
    private static int nextId = 1;

    public AbstractEntity(){
    id = nextId;
    nextId++;

    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

