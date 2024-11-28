package ir.isc.session5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductService {
		
		 static Product product1 = new Product("Nokia Phone", "1000000", true, Category.DIGITAL);
		 static Product product2 = new Product("Tshirt", "500000", false, Category.CLOTHE);
		 static Product product3 = new Product("Samsung TV", "5000000", true, Category.DIGITAL);
		 static Product product4 = new Product("Pants", "700000", false, Category.CLOTHE);
		 static Product product5 = new Product("Carpet", "3000000", true, Category.HOME);
		 static Product product6 = new Product("Candle", "300000", true, Category.HOME);
		 static Product product7 = new Product("Apple Phone", "1000000", false, Category.DIGITAL);
		 static Product product8 = new Product("Scarf", "1000000", true, Category.CLOTHE);
		
		 static List<Product> products = List.of(product1, product2, product3, product4, product5, product6, product7, product8);
		
		
		public static List<Product> ShowAvailableProducts(){
			return products;	    
		}
		
		public static List<Product> GetName(String name) throws NoProductFoundException{
			List<Product> FindByName = products.stream()
												.filter(t -> t.name().equals(name))
												.collect(Collectors.toList());
			if (FindByName.size() == 0 ) {
				throw new NoProductFoundException("There isn't any product available by this name");
			}
			return FindByName;
		}
		
		public static List<Product> GetCategory(Category category){
			List<Product> FindByCategory = products.stream()
												.filter(t -> t.category().equals(category))
												.collect(Collectors.toList());
					
			return FindByCategory;
		}
		
		
		public static List<Product> GetNameAndCategory(Category category, String name) throws NoProductFoundException{
			List<Product> FindByNameAndCategory = products.stream()
												.filter(t -> t.category().equals(category) && t.name().equals(name))
												.collect(Collectors.toList());
			if (FindByNameAndCategory.size() == 0 ) {
				throw new NoProductFoundException("There isn't any product available by this name");
			}		
			
			return FindByNameAndCategory;
				
	}		
}
		
		
	


