package com.labjava.ljdbc;

import java.sql.SQLException;

public class CrearTablaPorSPMain {

	public static void main(String[] args) {
		
		DAOStore daostore  = new DAOStore();
		
		try {
			daostore.recuperarNroFilas(args[0]);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
