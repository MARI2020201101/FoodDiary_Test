package com.fatsecret.test.persistence;



import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	
	@Autowired
	private DataSource datasource;
	@Test
	public void dsConnectionTest() throws SQLException {
		
		try{
			Connection con = datasource.getConnection();
			log.info("\nconnection : "+con);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

}
