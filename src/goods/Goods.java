package goods;

public class Goods {
		private String name;
		private int countStock;
		private int countSold;
		private int price;
		
		public Goods(){
			
		}
		
		public Goods(String name, int countStock, int countSold, int price){
			this.name = name;
			this.countStock=countStock;
			this.price=price;
			this.countSold=countSold;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCountStock() {
			return countStock;
		}
		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}
		public int getCountSold() {
			return countSold;
		}
		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
}
