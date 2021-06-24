package assesmentOne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import sqlserver2.Person;


public class AuthorDAO {
	private final static Connection connection=SqlServerConnection.getConnection();
	public static List<Book> getbooklist(){
		
		try      {
			        List<Book> l=new ArrayList<Book>();
				    ResultSet rs=connection.createStatement().executeQuery("select *from Book");
				    while(rs.next()) {
				    	Book p=new Book();
				    			p.setsno(rs.getInt(1));
                                p.setbookname(rs.getString(2));
                                
                                p.setAuthorID(rs.getInt(3));
                                p.setPages(rs.getInt(4));
                                p.setPages(rs.getInt(5));
				    	l.add(p);
				    }
				    
				    return l;
				}
				catch(SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
	
	
	public static List<Author> getAuthorlist(){
		
try      {
	        List<Author> l=new ArrayList<Author>();
		    ResultSet rs=connection.createStatement().executeQuery("select *from Author");
		    while(rs.next()) {
		    	Author p=new Author();
		    		p.setAuthorID(	rs.getInt(1));
		    		p.setName(rs.getString(2));
		    	
		    	l.add(p);
		    }
		    
		    return l;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static boolean insert(Book p) {
		try {
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into book values(?,?,?,?,?)");
			preparedStatement.setInt(1, p.getsno());
			preparedStatement.setString(2, p.getbookname());
			preparedStatement.setInt(3, p.getAuthorID());
			preparedStatement.setInt(4, p.getPrice());
			preparedStatement.setInt(5, p.getPages());
			preparedStatement.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	} 

}