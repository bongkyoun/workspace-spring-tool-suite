package com.itwill.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;




public class UserDaoImpl implements UserDao {
	private DataSource dataSource;

	public UserDaoImpl() {
		System.out.println("#### UserDaoImpl() : 디폴트생성자 호출  ");
	}
	


	public void setDataSource(DataSource dataSource) {
		System.out.println("#### UserDaoImpl : setDataSource("+dataSource+") 호출 ");
		this.dataSource = dataSource;
	}



	@Override
	public int create(User user) throws Exception {
		System.out.println("#### UserDaoImpl : create() 호출  ");
		return 0;
	}

	
	@Override
	public int update(User user) throws Exception {
		System.out.println("#### UserDaoImpl : update() 호출  ");
		return 0;
	}

	
	@Override
	public int remove(String userId) throws Exception {
		System.out.println("#### UserDaoImpl : remove() 호출  ");
		return 0;
	}
	
	
	@Override
	public User findUser(String userId) throws Exception {
		System.out.println("#### UserDaoImpl : findUser() 호출  ");
		return null;
	}
	
	public ArrayList<User> findUserList() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<User> findUserList = new ArrayList<User>();
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(UserSQL.USER_SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				findUserList.add(new User(	rs.getString("userid"),
											rs.getString("password"), 
											rs.getString("name"),
											rs.getString("email")));

			}
		} finally {
			/*
			 * 예외발생과 관계없이 반듯시 실행되는 코드
			 */
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
		return findUserList;
	}
	
	@Override
	public boolean existedUser(String userId)throws Exception{
		System.out.println("#### UserDaoImpl : existedUser() 호출  ");
		return true;
	}
	
}














