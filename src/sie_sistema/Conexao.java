
package sie_sistema;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
   
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sie_sistema",
                "root",
                "root"
            );
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e);
            return null;
        }
    }
    
    public static void main(String[] args) {
    Connection conn = conectar();

    if (conn != null) {
        System.out.println("Conectado!");
    } else {
        System.out.println("Erro na conexão!");
    }
}
}

