package com.labjava.ljdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class DAOStore {
		
	@SuppressWarnings("finally")	
	public int recuperarNroFilas(String nombreTabla) throws SQLException{
		 
		Connection oConexion = null;
			
		try{
	
	    	oConexion = ConexionBD.NuevaConexion();
	
	    	oConexion.setAutoCommit(false);
	
			CallableStatement prcProcedimientoAlmacenado = oConexion.prepareCall("{ call crearTablaSP(?,?,?) }");

			prcProcedimientoAlmacenado.setString(1, nombreTabla);
		
			prcProcedimientoAlmacenado.execute();

			oConexion.commit();
			return 0;
		} catch (Exception e) {
			oConexion.rollback();			
			e.printStackTrace();
		} finally {
			oConexion.close();
			return -1;
		} 
		
	}
	
}
