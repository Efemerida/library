package com.library.libraryBack.customTypes;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Objects;

public class PassportType implements UserType<Passport> {
    @Override
    public int getSqlType() {
        return Types.VARCHAR;
    }

    @Override
    public Class<Passport> returnedClass() {
        return Passport.class;
    }

    @Override
    public boolean equals(Passport passport, Passport j1) {
        return false;
    }

    @Override
    public int hashCode(Passport passport) {
        return 0;
    }

    @Override
    public Passport nullSafeGet(ResultSet resultSet, int i, SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws SQLException {
        Passport passport = new Passport();
        String passportValue = resultSet.getString(i);
        passport.setSeries(passportValue.split(",")[0]);
        passport.setNumber(passportValue.split(",")[1]);
        return passport;
    }

    @Override
    public void nullSafeSet(PreparedStatement preparedStatement, Passport passport, int i, SharedSessionContractImplementor sharedSessionContractImplementor) throws SQLException {
        if (Objects.isNull(passport))
            preparedStatement.setNull(i, Types.VARCHAR);
        else {
            preparedStatement.setString(i, passport.getSeries() + " " + passport.getNumber());
        }
    }

    @Override
    public Passport deepCopy(Passport passport) {
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Passport passport) {
        return null;
    }

    @Override
    public Passport assemble(Serializable serializable, Object o) {
        return null;
    }
}
