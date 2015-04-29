package goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		
		goods.setName("Nikon");
		goods.setCountSold(100);
		goods.setCountStock(200);
		goods.setPrice(200000);
		
		System.out.println("상품이름 : "+goods.getName()+"\n"+
				"재고 : "+goods.getCountStock()
				+"\n"+"가격 : "+goods.getPrice()
				+"\n"+"팔린 : "+goods.getCountSold());
		
		Goods goods2 = new Goods("Nikon2",200,300,100000);
		System.out.println();
		System.out.println("상품이름 : "+goods2.getName()+"\n"+
				"재고 : "+goods2.getCountStock()
				+"\n"+"가격 : "+goods2.getPrice()
				+"\n"+"팔린 : "+goods2.getCountSold());
	}
}
