package conexoes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * @author Diego Barbosa da Silva
 */
public class ConexaoMySql {

    private boolean status = false;
    private String mensagem = "";   //variavel que vai informar o status da conexao
    private Connection con = null;  //variavel para conexao
    private Statement statement;
    private ResultSet resultSet;

    public ConexaoMySql() {
    }

    /**
     * Método para carregar as configurações do properties.
     * @return properties
     */
    private static Properties loadProperties() {
        Properties properties = new Properties();
        FileInputStream caminho = null;
        String distro = System.getProperty("os.name");
        String path = System.getProperty("user.home");
        if (distro.equals("Linux")) {
            try {
                caminho = new FileInputStream(path + "/VendasProjeto/db.properties");
                properties.load(caminho);
                return properties;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Arquivo properties não encontrado.");
            }
        } else {
            try {
                caminho = new FileInputStream("C:/VendasProjeto/db.properties");
                properties.load(caminho);
                return properties;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Arquivo properties não encontrado.");
            }
        }
        return null;
    }

    /**
     * Abre uma conexao com o banco
     *
     * @return Connection
     */
    public Connection conectar() {
        try {
            //Driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Properties properties = loadProperties();
            final String urlBanco = properties.getProperty("banco.url");
            final String userBanco = properties.getProperty("banco.usuario");
            final String passwordBanco = properties.getProperty("banco.senha");
            this.setCon((Connection) DriverManager.getConnection(urlBanco, userBanco, passwordBanco));
            this.status = true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.getCon();
    }

    /**
     * Executa consultas SQL
     *
     * @param pSQL
     * @return int
     */
    public boolean executarSQL(String pSQL) {
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.setResultSet(getStatement().executeQuery(pSQL));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public boolean executarUpdateDeleteSQL(String pSQL) {
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());
            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(pSQL);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Executa insert SQL
     *
     * @param pSQL
     * @return boolean
     */
    public int insertSQL(String pSQL) {
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());
            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);
            //consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            //recupera o ultimo id inserido
            while (this.resultSet.next()) {
                status = this.resultSet.getInt(1);
            }
            //retorna o ultimo id inserido
            return status;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return status;
        }
    }

    /**
     * encerra a conexão corrente
     *
     * @return boolean
     */
    public boolean fecharConexao() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public boolean isStatus() {
        return this.status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Statement getStatement() {
        return statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
}
