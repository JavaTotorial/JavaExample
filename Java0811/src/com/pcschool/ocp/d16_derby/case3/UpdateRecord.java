package com.pcschool.ocp.d16_derby.case3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:derby://localhost:1527/APP";
		String username = "app";
		String password = "app";

		String sql = "SELECT * FROM book WHERE id = 2";

		// 建立資料庫鏈接
		try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
				Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stat.executeQuery(sql);) {
			if (rs.last()) { // 將游標指向該筆紀錄
				rs.updateInt("price", 350);
//		 		rs.cancelRowUpdates(); // 取消更新
				rs.updateRow(); // 一定要加入才可修改實體資料表
				rs.deleteRow(); // 一定要加入才可刪除實體資料表
				System.out.println("Update Sucess");
			} else {
				System.out.println("Update Error");
			}
		} catch (Exception e) {

		}
	}
}
