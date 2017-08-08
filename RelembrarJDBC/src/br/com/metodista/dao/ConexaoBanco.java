/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.metodista.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Icaro
 */
public class ConexaoBanco {

    public Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS="
                    + "(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=system)))",
                     "system", "110897");
            System.out.println("Conectou");
        } catch (SQLException sql) {
            System.out.println("ERRO DE CONEXÃO "+sql);
        } catch (ClassNotFoundException erro) {
            System.out.println("ERRO DE DRIVER");
        }
        return conn;
    }

    public void desconectar(Connection conn) {
        try {
            if(conn!=null && !conn.isClosed()){
            conn.close();
            System.out.println("Desconectou");
            }
        } catch (SQLException sql) {
            System.out.println("ERRO DE CONEXÃO");
        }
    }

}
