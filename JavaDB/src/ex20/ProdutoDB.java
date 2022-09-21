package ex20;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class ProdutoDB {
 
    public Connection ConexaoDB(String dbname,String user,String pass){
       
        Connection conn=null;
       
        try{
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://jelani.db.elephantsql.com:5432/" + dbname,user,pass);
            if(conn!=null){
                System.out.println("Conexão estabelecida com sucesso!");
            }
            else{
                System.out.println("Falha na conexão com o Banco de Dados!");
            }
        }catch (Exception e){
            System.out.println(e);
        }
       
        return conn;
    }
   
    public void InserirUsuarioDB(Produto u){
       
        Connection conn = ConexaoDB("kcadfpag","kcadfpag","gRRQpjOb8ltC6naBkPP23kqkvGaUOl3Z");
       
        Statement statement;
       
        try {
            String query = String.format("insert into tb_usuario (id,ra,nome,curso) values('%s','%s','%s','%s');", u.getId(), u.getNome(), u.getPreco(), u.getQtd());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro incluído com sucesso!");
           
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ListarProdutoDB(){
       
        Connection conn = ConexaoDB("kcadfpag","kcadfpag","gRRQpjOb8ltC6naBkPP23kqkvGaUOl3Z");
       
        Statement statement;
       
        ResultSet rs=null;
       
        try {
            String query= "select * from tb_produto";
           
            statement=conn.createStatement();
           
            rs=statement.executeQuery(query);
           
            while(rs.next()){
                System.out.print(rs.getString("id")+" ");
                System.out.print(rs.getString("nome")+" ");
                System.out.println(rs.getString("preco")+" ");
                System.out.println(rs.getString("qtd"));
            }
 
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
