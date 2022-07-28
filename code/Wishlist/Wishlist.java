package Wishlist;

import Products.Product;

import java.util.ArrayList;

public class Wishlist {
    private String memberId;
    private ArrayList<Product> wishList = new ArrayList<>();
    public static ArrayList<Wishlist> allWishList = new ArrayList<>(); 

    public Wishlist(String memberId, ArrayList<Product> wishList) {
        this.memberId = memberId;
        this.wishList = wishList;
        allWishList.add(this);
    }

    public String getMemberId() {
        return memberId;
    }

    public ArrayList<Product> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Product> wishList) {
        this.wishList = wishList;
    }
}
