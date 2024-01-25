package com.myshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.OrderDTO;

public class OrderDAO extends DBHelper {
		// 싱글톤
		private static OrderDAO instance = new OrderDAO();
		public static OrderDAO getInstance() {
			return instance;
		}
		private OrderDAO() {}
			
		
		
		// CRUD 메서드
		public void insertOrder(OrderDTO dto) {

			try {
				conn = getConnection();
				
				//3단계
				psmt = conn.prepareStatement(SQL.INSERT_ORDER);
				psmt.setInt(1, dto.getOrderNo());
				psmt.setString(2, dto.getOrderId());
				psmt.setInt(3, dto.getOrderProduct());
				psmt.setInt(4, dto.getOrderCount());
				
				//4단계
				psmt.executeUpdate();
				
				//5단계
				//6단계
				close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public OrderDAO selectOrder(int orderNo) {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
		public List<OrderDTO> selectOrders(String custID) {
			
			List<OrderDTO> orders = new ArrayList<>();
			
			try {
				conn = getConnection();
				
				//3단계
				psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
				psmt.setString(1, custID);
				
				//4단계
				rs = psmt.executeQuery();
				
				//5단계
				while(rs.next()) {
					
					OrderDTO order = new OrderDTO();
					
					order.setOrderNo(rs.getInt(1));
					order.setOrderId(rs.getString(2));
					order.setOrderProduct(rs.getInt(3));
					order.setOrderCount(rs.getInt(4));
					order.setOrderDate(rs.getString(5));
					order.setProdName(rs.getString(6));
					order.setPrice(rs.getInt(7));
					order.setCompany(rs.getString(8));
					
					orders.add(order);
					
				}
				
				//6단계
				close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return orders;
		}
		
		public void updateOrder(OrderDAO dto) {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public void deleteOrder(int orderNo) {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
}
