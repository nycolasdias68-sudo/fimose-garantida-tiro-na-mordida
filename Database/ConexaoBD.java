package Database;
//BIBLIOTECAS

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBD {

    private static final String URL
            = "jdb:mysql://localhost:3306/banco_OS";

    private static final String USUARIO = "root";

    private static final String SENHA = "";

    public static Connection getConecxao() {
        try {

            Connection conexao = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    SENHA
            );
            return conexao;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao conectar com o banco de dados:\n"
                    + erro.getMessage()
            );
        }
    
    }
}