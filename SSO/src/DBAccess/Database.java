package DBAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class Database {
	PreparedStatement ps;
	ResultSet rs;
	Context c;
	DataSource ds;
	Connection con;
	
	public Database(){
		ps=null;
		rs=null;
		c=null;
		ds=null;
		con=null;
	}
	
	public boolean getRole(String fname){
		try {
			c = new InitialContext();
			ds =(DataSource)c.lookup("java:/Oracle11gDS");			
			con = ds.getConnection();
			if(fname!=null){
			
				ps=con.prepareStatement("SELECT user_id from user_ganesh where user_name=?");
				ps.setString(1, fname);
				
				rs=ps.executeQuery();
				if(rs.next()){
					return true;
				} 
			}	
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return false;
	}
	
	public int getRoleId(String rname){
		try {
			c = new InitialContext();
			ds =(DataSource)c.lookup("java:/Oracle11gDS");
			
			con = ds.getConnection();
			con.setAutoCommit(false);
			if(rname!=null){
			
				ps=con.prepareStatement("SELECT role_id from role_ganesh where role_name=?");
				ps.setString(1, rname);
				
				rs=ps.executeQuery();
				if(rs.next()){
					return rs.getInt(1);
				} 
			}
				
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}		
		return -1;
	}
	
	public int getUserId(String uname){
		try {
			c = new InitialContext();
			ds =(DataSource)c.lookup("java:/Oracle11gDS");
			
			con = ds.getConnection();
			con.setAutoCommit(false);
			if(uname!=null){
			
				ps=con.prepareStatement("SELECT user_id from user_ganesh where user_name=?");
				ps.setString(1, uname);
				
				rs=ps.executeQuery();
				if(rs.next()){
					return rs.getInt(1);
				} 
			}
				
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}		
		return -1;
	}
	
	
	public boolean setRole(String rname){
		try {
			c = new InitialContext();
			ds =(DataSource)c.lookup("java:/Oracle11gDS");
			
			con = ds.getConnection();
			con.setAutoCommit(false);
			if(rname!=null){
			
				ps=con.prepareStatement("INSERT into role_ganesh(role_name) values (?)");
				ps.setString(1, rname);
				
				int i=ps.executeUpdate();
				if(i>0){
					con.commit();
					return true;
				} 
			}
				
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return false;
	}
	
	public HashMap<String, String> getResourceData(){
		
		HashMap<String, String> resources = new HashMap<String, String>();
		
		  
		try {
			c=new InitialContext();
			ds = (DataSource)c.lookup("java:/Oracle11gDS");
			con=ds.getConnection();
			ps=con.prepareStatement("select resource_id, resource_name from resource_ganesh ");
			rs=ps.executeQuery();
			while(rs.next()){
				resources.put(rs.getString(1),rs.getString(2));
			}
				 
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return resources;
	}
	
public ArrayList<String> getResources(String name){
		
	ArrayList<String> resources = new ArrayList<String>();
		
		  
		try {
			c=new InitialContext();
			ds = (DataSource)c.lookup("java:/Oracle11gDS");
			con=ds.getConnection();
			
			ps=con.prepareStatement("select distinct resource_name from resource_ganesh rsrc, user_ganesh usr,user_role_ganesh ur, permission_ganesh perm"+
					" where usr.user_name=? and usr.user_id=ur.user_id and ur.role_id=perm.role_id and perm.resource_id=rsrc.resource_id");
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next()){
				resources.add(rs.getString(1));
			}			 
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return resources;
	}
	
	public boolean updatePermission(int rid,String rsrcIds[]){
		try {
			c = new InitialContext();
			ds =(DataSource)c.lookup("java:/Oracle11gDS");
			
			con = ds.getConnection();
			con.setAutoCommit(false);
			int flag=0;
			
			for(int j=0;j<rsrcIds.length;j++){
				ps=con.prepareStatement("INSERT into permission_ganesh(role_id,resource_id) values (?,?)");
				ps.setInt(1,rid);
				ps.setInt(2, Integer.parseInt(rsrcIds[j]));
				int i=ps.executeUpdate();
				if(!(i>0)){
					flag=1;
					break;
				}
				if(ps!=null){
					ps.close();
				}
			}	

			if(flag==0){
				con.commit();
				return true;
				} 		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return false;
	}
	
	public boolean modifyPermission(int rid,String rsrcIds[]){
		try {
		
			c = new InitialContext();
			ds =(DataSource)c.lookup("java:/Oracle11gDS");
			
			con = ds.getConnection();
			con.setAutoCommit(false);
			int flag=0;
			
			ps=con.prepareStatement("DELETE from permission_ganesh where role_id = ?");
			ps.setInt(1, rid);
			if(ps.executeUpdate()>0){
				con.commit();
				ps.close();
			}
			
			for(int j=0;j<rsrcIds.length;j++){
				ps=con.prepareStatement("INSERT into permission_ganesh(role_id,resource_id) values (?,?)");
				ps.setInt(1,rid);
				ps.setInt(2, Integer.parseInt(rsrcIds[j]));
				int i=ps.executeUpdate();
				if(!(i>0)){
					flag=1;
					break;
				}
				if(ps!=null){
					ps.close();
				}
			}	

			if(flag==0){
				con.commit();
				return true;
				} 		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return false;
	}
	
public HashMap<String, String> getUserData(){
		
		HashMap<String, String> users = new HashMap<String, String>();
		
		  
		try {
			c=new InitialContext();
			ds = (DataSource)c.lookup("java:/Oracle11gDS");
			con=ds.getConnection();
			ps=con.prepareStatement("select user_id, user_name from user_ganesh ");
			rs=ps.executeQuery();
			while(rs.next()){
				//System.out.println("key: "+rs.getInt(1)+"value "+rs.getString(2));
				users.put(rs.getString(1),rs.getString(2));
			}
			//System.out.println("b");
				 
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
	 			if(rs!=null && ps!=null && con!=null && c!=null){
				rs.close();
				ps.close();
				con.close();
				c.close();
			}
		}catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return users;
	}

public HashMap<String, String> getRoleData(){
	
	HashMap<String, String> roles = new HashMap<String, String>();
	
	  
	try {
		c=new InitialContext();
		ds = (DataSource)c.lookup("java:/Oracle11gDS");
		con=ds.getConnection();
		ps=con.prepareStatement("select role_id, role_name from role_ganesh ");
		rs=ps.executeQuery();
		while(rs.next()){
			//System.out.println("key: "+rs.getInt(1)+"value "+rs.getString(2));
			roles.put(rs.getString(1),rs.getString(2));
		}
		//System.out.println("b");
			 
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try{
 			if(rs!=null && ps!=null && con!=null && c!=null){
			rs.close();
			ps.close();
			con.close();
			c.close();
		}
	}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}catch(SQLException e){
			e.printStackTrace();
	}
	}
	return roles;
}



/*public boolean addUsers(ArrayList<String> names){
	try {
		c = new InitialContext();
		ds =(DataSource)c.lookup("java:/Oracle11gDS");
		
		con = ds.getConnection();
		con.setAutoCommit(false);
		int flag=0;
		
		ps=con.prepareStatement("DELETE from user_ganesh");
		if(ps.executeUpdate()>0){
			con.commit();
			ps.close();
		}
		
		
		int length=names.size();
		int i=0;
		while(i<length){
			String name=names.get(i);
			if(!(name.equalsIgnoreCase("Ganesh Agarwal"))){
				ps=con.prepareStatement("INSERT into user_ganesh(user_name) values (?)");
				ps.setString(1,name);
				ps.addBatch();
			}
			i++;
		}		
		int inserted[]=ps.executeBatch();
		for(int index=0;index<inserted.length;index++){
			if(!(inserted[index]>0)){
				flag=1;
				break;
			}
		}
		if(flag==0){
			con.commit();
			return true;
			}
					 		
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try{
 			if(rs!=null && ps!=null && con!=null && c!=null){
			rs.close();
			ps.close();
			con.close();
			c.close();
		}
	}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}catch(SQLException e){
			e.printStackTrace();
	}
	}
	return false;
}*/

public boolean updateUserRole(int uid,String roleIds[]){
	PreparedStatement ps=null;
	ResultSet rs=null;
	Context c=null;
	DataSource ds=null;
	Connection con=null;
	try {
		c = new InitialContext();
		ds =(DataSource)c.lookup("java:/Oracle11gDS");
		
		con = ds.getConnection();
		con.setAutoCommit(false);
		int flag=0;
		ps=con.prepareStatement("DELETE from user_role_ganesh where user_id = ?");
		ps.setInt(1, uid);
		if(ps.executeUpdate()>0){
			con.commit();
			ps.close();
		}
		
		for(int j=0;j<roleIds.length;j++){
			ps=con.prepareStatement("INSERT into user_role_ganesh(user_id,role_id) values (?,?)");
			ps.setInt(1,uid);
			ps.setInt(2, Integer.parseInt(roleIds[j]));
			int i=ps.executeUpdate();
			if(!(i>0)){
				flag=1;
				break;
			}
			if(ps!=null){
				ps.close();
			}
		}	

		if(flag==0){
			con.commit();
			return true;
			} 		
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try{
 			if(rs!=null && ps!=null && con!=null && c!=null){
			rs.close();
			ps.close();
			con.close();
			c.close();
		}
	}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}catch(SQLException e){
			e.printStackTrace();
	}
	}
	return false;
}
}
