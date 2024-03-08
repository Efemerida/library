package com.library.libraryBack.customTypes;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Objects;

public class FioType implements UserType<Fio> {


    @Override
    public int getSqlType() {
        return Types.OTHER;
    }

    @Override
    public Class<Fio> returnedClass() {
        return Fio.class;
    }

    @Override
    public boolean equals(Fio fio, Fio j1) {
        return false;
    }

    @Override
    public int hashCode(Fio fio) {
        return 0;
    }

    @Override
    public Fio nullSafeGet(ResultSet rs, int position,
                           SharedSessionContractImplementor session, Object owner) throws SQLException {
        Fio fio = new Fio();
        System.out.println("sss " + rs.getString(position));
        String fioValue = rs.getString(position);
        fio.setSurname(fioValue.split(",")[0]);
        fio.setName(fioValue.split(",")[1]);
        fio.setPatronomic(fioValue.split(",")[2]);

        return fio;
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Fio value, int index,
                            SharedSessionContractImplementor session) throws SQLException {

        if (Objects.isNull(value))
            st.setNull(index, Types.VARCHAR);
        else {
            st.setString(index, value.getSurname() + " " + value.getName() + " " + value.getPatronomic());
        }
    }

    @Override
    public Fio deepCopy(Fio fio) {
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Fio fio) {
        return null;
    }

    @Override
    public Fio assemble(Serializable serializable, Object o) {
        return null;
    }
}
