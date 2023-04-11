/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u09656283104
 */
public class TesteJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost:3306/vendas";
            user="root";
            password = " ";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException ex){
                    Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
                    Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectou");
        }

}
