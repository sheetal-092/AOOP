package practical4Bweek5Postlab1;

import java.util.ArrayList;
import java.util.List;

public interface Bidder {
	void update(String message);
    String getName();  
}


class ConcreteBidder implements Bidder {
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}


abstract class Auctioneer {
    private List<Bidder> bidders = new ArrayList<>();

    public void subscribe(Bidder bidder) {
        bidders.add(bidder);
        System.out.println(bidder.getName() + " subscribed to auction notifications.");
    }

    public void unsubscribe(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println(bidder.getName() + " unsubscribed from auction notifications.");
    }

    protected void notifyBidders(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }

  
    public final void conductAuction() {
        auctionItemAvailable();
        startBidding();
        endBidding();
    }

    protected abstract void auctionItemAvailable();
    protected abstract void startBidding();
    protected abstract void endBidding();
}


class StandardAuction extends Auctioneer {

    @Override
    protected void auctionItemAvailable() {
        System.out.println("Standard auction: Item is available for bidding.");
        notifyBidders("Standard auction: Item available.");
    }

    @Override
    protected void startBidding() {
        System.out.println("Standard auction: Bidding started.");
        notifyBidders("Standard auction: Bidding started.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Standard auction: Bidding ended.");
        notifyBidders("Standard auction: Bidding ended.");
    }
}


class ReserveAuction extends Auctioneer {
    private double reservePrice;

    public ReserveAuction(double reservePrice) {
        this.reservePrice = reservePrice;
    }

    @Override
    protected void auctionItemAvailable() {
        System.out.println("Reserve auction: Item is available for bidding. Reserve price: $" + reservePrice);
        notifyBidders("Reserve auction: Item available, reserve price: $" + reservePrice);
    }

    @Override
    protected void startBidding() {
        System.out.println("Reserve auction: Bidding started.");
        notifyBidders("Reserve auction: Bidding started.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Reserve auction: Bidding ended.");
        notifyBidders("Reserve auction: Bidding ended.");
    }
}
