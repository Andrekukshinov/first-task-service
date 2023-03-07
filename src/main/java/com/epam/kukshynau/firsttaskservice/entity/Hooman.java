package com.epam.kukshynau.firsttaskservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hooman {

    @Id
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hooman hooman)) return false;
        return Objects.equals(getId(), hooman.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
