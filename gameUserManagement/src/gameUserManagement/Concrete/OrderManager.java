package gameUserManagement.Concrete;
import gameUserManagement.Entities.*;
public class OrderManager {
	
	
	public void bargainSale(User user, Game game, Campaign campaign, Order order) {
			System.out.println(game.getGameName()+" oyunu "+user.getFirstName()+" kullanýcýsý tarafýndan, "+game.getPrice()+" yerine indirimli olarak "+(campaign.getDiscount()*game.getPrice())+ "fiyatýna satýn alýnmýþtýr. Sipariþ no: "+order.getOrderId());
			order.setOrderName(game.getGameName());
			order.setOrderPrice(campaign.getDiscount()*game.getPrice());
	}
	
	public void saleWithoutDiscount(User user, Game game,Order order) {
			System.out.println(game.getGameName()+" oyunu "+user.getFirstName()+" kullanýcýsý tarafýndan "+game.getPrice()+" fiyatýna satýn alýnmýþtýr. Sipariþ no: "+order.getOrderId());
	}
}
