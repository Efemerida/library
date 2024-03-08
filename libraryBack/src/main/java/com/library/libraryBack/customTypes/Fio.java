package com.library.libraryBack.customTypes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Fio {

    String surname;
    String name;
    String patronomic;

    @Override
    public String toString() {
        return surname + " " + name + " " + patronomic;
    }

}
