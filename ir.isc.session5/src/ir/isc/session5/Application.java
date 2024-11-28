package ir.isc.session5;



public class Application {

	public Application() {
		
	}

	public static void main(String[] args){
		
		
			System.out.println(ProductService.ShowAvailableProducts());
		
			try {
			var products = ProductService.GetName("Nokia");
			System.out.println(products);
			} catch (NoProductFoundException e) {
				System.out.println("Coud not find such a product");
			}
			
		
			var products1 = ProductService.GetCategory(Category.CLOTHE);
			System.out.println(products1);
			
			
			try {
			var products2 = ProductService.GetNameAndCategory(Category.DIGITAL, "Samsung TV");
			System.out.println(products2);
			} catch (NoProductFoundException e) {
			System.out.println("Coud not find such a product");
			}
		
		
	}

}
