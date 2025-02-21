package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empDAO-mysql")
@Profile({"dev","test","default"})
public class MySqlEmployeeDAO implements IEmployeeDAO{

	@Autowired
	private DataSource ds; // HAS-A Properties


	//SQL Query
	private static final String GET_EMP_QUERY="SELECT EMPNO,ENAME,desg,salary,DEPTNO FROM EMPLOYEE WHERE desg IN(?,?,?) ORDER BY desg";
	private static final String INSERT_EMP_DATA_QUERY="INSERT INTO EMPLOYEE(ENAME,DESG,SALARY,DEPTNO,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?,?)";
	

	//For Checking object is created or not
	public MySqlEmployeeDAO() 
	{
		System.out.println("MySqlEmployeeDAO.MySqlEmployeeDAO()");
	}
	
	//Retrieval Operation on Employee Table
	@Override
	public List<Employee> showEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception 
	{
		//Printing Data Source type
		System.out.println("Connection Datasource is : "+ds.getClass());
		
		//Writing JDBC Code
		List<Employee> list=null;
		
		//Creating Connection and Prepared Statement inside try to close it automatically
		try( Connection con=ds.getConnection();
			 PreparedStatement ps= con.prepareStatement(GET_EMP_QUERY); )
		{
			//Setting data into prepared statement
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			//Execute SQL Query
			try(ResultSet rs=ps.executeQuery())
			{
				//Creating ArrayList Object
				list=new ArrayList<Employee>();
				
				//Process the ResultSet object to List<Employee> object
				while(rs.next())
				{	
					//Creating Employee Object
					Employee emp=new Employee();
					
					//Setting data into employee object
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					
					//Add Employee Class Object to List 
					list.add(emp);
				}
				
			}
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		return list;
	}


	//Inserting Record in to Employee Table
	@Override
	public int insertEmployeeData(Employee emp) throws Exception 
	{
		//For Returning result
		int result=0;
		
		//Creating Connection object
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_EMP_DATA_QUERY);)
		{
			
			//setting value into prepared statement
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getDesg());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());
			ps.setDouble(5, emp.getGrossSalary());
			ps.setDouble(6, emp.getNetSalary());
			
			
			result=ps.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		return result;
	}
	
	
	
	
	

}
