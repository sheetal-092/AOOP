package practical4Bweek5Postlab1;

public class Client {
	public static void main(String[] args) {
        Auctioneer standardAuction = new StandardAuction();
        Auctioneer reserveAuction = new ReserveAuction(100.0);

        Bidder bidder1 = new ConcreteBidder("Bidder1");
        Bidder bidder2 = new ConcreteBidder("Bidder2");

      
        standardAuction.subscribe(bidder1);
        standardAuction.subscribe(bidder2);

       
        System.out.println("\nConducting Standard Auction:");
        standardAuction.conductAuction();

        
        standardAuction.unsubscribe(bidder2);

       
        reserveAuction.subscribe(bidder1);
        reserveAuction.subscribe(bidder2);

       
        System.out.println("\nConducting Reserve Auction:");
        reserveAuction.conductAuction();
    }
}
