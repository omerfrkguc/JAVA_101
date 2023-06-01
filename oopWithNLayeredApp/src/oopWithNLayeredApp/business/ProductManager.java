package oopWithNLayeredApp.business;

import java.util.List;

import java.util.logging.Logger;

import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;


public class ProductManager {
	
		private ProductDao productDao;
		
		private Logger[]loggers;
		
		public ProductManager(ProductDao productDao,Logger[] loggers) {
			this.productDao = productDao;
			this.loggers = loggers;
		}

		public void add(Product product) throws Exception {//responsive request
			//iş kuralları
			if(product.getUnitPrice()<10) {
				throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
			}
			//HibernateProductDao productDao = new HibernateProductDao();
			productDao.add(product); 
			
			for(Logger logger : loggers) {//[db , mail]
				logger.log(product.getName());
			}
		}
}
