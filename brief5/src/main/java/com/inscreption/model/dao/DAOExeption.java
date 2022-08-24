package com.inscreption.model.dao;



public class DAOExeption extends RuntimeException {

	    public DAOExeption( String message ) {
	        super( message );
	    }

	    public DAOExeption( String message, Throwable cause ) {
	        super( message, cause );
	    }

	    public DAOExeption( Throwable cause ) {
	        super( cause );
	    }
	

}