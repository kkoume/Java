package com.myshop.dao;


import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper {
		// 싱글톤
		private static ProductDAO instance = new ProductDAO();
		public static ProductDAO getInstance() {
			return instance;
		}
		private ProductDAO() {}
		
		
		
		// CRUD 메서드
		public void insertProduct(ProductDAO dto) {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public ProductDAO selectProduct(int prodNo) {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
		public List<ProductDAO> selectProducts() {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
		public void updateProduct(ProductDAO dto) {

			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public void deleteProduct(int prodNo) {
			
			try {
				//3단계
				//4단계
				//5단계
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
}
