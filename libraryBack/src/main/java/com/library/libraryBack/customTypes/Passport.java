package com.library.libraryBack.customTypes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Passport {

    String series;
    String number;


    @Override
    public String toString() {
        return series + " " + number;
    }
}
