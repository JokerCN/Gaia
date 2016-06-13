package com.winchampion.exceptions;

import org.springframework.dao.InvalidDataAccessResourceUsageException;

import java.sql.SQLException;

/**
 * Created by super on 2016/6/13.
 */
public class BadSqlGrammerException extends InvalidDataAccessResourceUsageException{

    private String sql;

    public BadSqlGrammerException(String task,String sql,SQLException ex){
        super(task + "; bad SQL grammer [" + sql + "]", ex);
    }

    public SQLException getSQLException(){
        return (SQLException)getCause();
    }

    public String getSql(){
        return sql;
    }

    public BadSqlGrammerException(String msg) {
        super(msg);
    }

    public BadSqlGrammerException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
