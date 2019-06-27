package com.uema.quiz;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerCallableStatement;

import static android.os.StrictMode.*;

public class SQLConnection {

    private final String DBNome = "SmttJuriDB";

    private final String Host = "127.0.0.1";

    private final String Instancia = "DESKTOP-OU6ISV9\\SQLSERVER";

    private final String User = "sql";

    private final String Senha = "1234";

    private boolean StatusConexao = false;

    private Connection Conexao = null;


    @SuppressLint("NewApi")
    public void createConexao(){
        if (android.os.Build.VERSION.SDK_INT > 9){
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            String urlConexao ="jdbc:jtds:sqlserver://127.0.0.1;databaseName=SmttJuriDB;instanceName=DESKTOP-OU6ISV9\\SQLSERVER;user=sql;password:1234;";
            //String urlConexao = "jdbc:sqlserver://localhost:1433;databaseName=SmttJuriDB;user=sql;password=1234";
            Connection Conexao = DriverManager.getConnection(urlConexao);
            if(Conexao != null){
                this.StatusConexao = true;
                System.out.println("Conexao feita com sucesso!");
            }else{
                this.StatusConexao = false;
                System.out.println("Conexao feita com sucesso!");
            }
        }catch (SQLException exSql){
            System.out.println("Erro na Conexão com o Banco de dados: "+exSql.getMessage());
            System.out.println("Numero: " + exSql.getErrorCode());
        }catch (ClassNotFoundException exClass){
            System.out.println("Erro de class: "+ exClass.getMessage());
        }catch (Exception e){
            System.out.println("Erro indefinido: ");
            e.printStackTrace();
        }
    }

}
