package com.ricston.blog.sample.model.dao.postgre
 
import groovy.sql.Sql
 
import javax.sql.DataSource
 
import com.ricston.blog.sample.model.dao.SimpleUserDAO
import com.ricston.blog.sample.model.data.SimpleUser

// TODO: Finish implementation
 
class PostgreSimpleUserDAO implements SimpleUserDAO {
	private Sql sql
 
	public PostgreSimpleUserDAO(DataSource dataSource) {
		sql = new Sql(dataSource)
	}
 
	/**
	 *
	 * @param email
	 * @return the SimpleUser with the given email
	 */
	public SimpleUser findSimpleUserByEmail(String email) {
		sql.firstRow """SELECT * FROM Simpleuser WHERE email = $email"""
	}
}
