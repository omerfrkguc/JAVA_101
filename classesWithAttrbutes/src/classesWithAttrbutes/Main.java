package classesWithAttrbutes;

public class Main {
		public static void main(String[] args) {
			Product product = new Product();
			product.name = "laptop";
			product.id =1;
			product.desciription="Asus laptop";
			product.price = 5000;
			product.stockAmount =3;
			System.out.println(product.name);
			ProductManager productManager = new ProductManager();
			productManager.Add(product);
		
		}
}
