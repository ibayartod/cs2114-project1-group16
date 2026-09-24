package bookworm;

import java.util.ArrayList;

public class User
{

    private String username;

    private int id;

    private double balance;

    private ArrayList<Media> checkedOut;

    public User(String username, int id)
    {
        this.username = username;
        this.id = id;
        this.balance = 0.0;
        this.checkedOut = new ArrayList<Media>();
    }


    public String getUsername()
    {
        return username;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }


    public int getId()
    {
        return id;
    }


    public double getBalance()
    {
        return balance;
    }


    // Directly sets the fine balance to a specific amount.
    public void setBalance(double balance)
    {
        this.balance = balance;
    }


    // Adjusts the current balance up or down by the given amount.
    // Positive amount adds to what's owed; negative amount reduces it (e.g.
    // after a payment).
    public void changeBalance(double amount)
    {
        this.balance += amount;
    }


    public ArrayList<Media> getCheckedOut()
    {
        return checkedOut;
    }


    public void checkOut(Media media)
    {
        checkedOut.add(media);
    }


    public void returnMedia(Media media)
    {
        checkedOut.remove(media);
    }


    public boolean hasCheckedOut(Media media)
    {
        return checkedOut.contains(media);
    }

}
