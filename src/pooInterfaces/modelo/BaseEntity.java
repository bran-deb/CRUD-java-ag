package pooInterfaces.modelo;

import java.util.Objects;

public class BaseEntity {
    private static int ultimoId;
    protected Integer id;

    public BaseEntity() {
        this.id = ++BaseEntity.ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity base = (BaseEntity) o;
        return Objects.equals(id, base.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
