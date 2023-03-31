import java.util.ArrayList;

public class Server {

    public static ArrayList<String> drinks = new ArrayList<>();
    static {
        drinks.add("apple juice");
        drinks.add("water");
        drinks.add("cola");
        drinks.add("lemonade");
    }


    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 18){
            return false;
        }
        if(guest.getBalance() < 5.00){
            return false;
        }
        if (guest.getSobriety() < 50){
            return false;
        }
        if (guest.isBanned()){
            return false;
        }
        if (guest.getCurrency() != '£'){
            return false;
        }
        if (!servesFavouriteDrink(guest)){
            return false;
        }
        return true;
    }


    public boolean checkID (Guest guest){
        if (guest.getAge() >= 18){
            return true;
        }
        return false;
    }

    public boolean hasEnoughMoney (Guest guest){
        if (guest.getBalance() > 5.00){
            return true;
        }
        return false;
    }

    public boolean guestSobriety (Guest guest){
        if(guest.getSobriety() > 50){
           return true;
        }
        return false;
    }

    public boolean banned(Guest guest){
        if (!guest.isBanned()){
            return false;
        }
        return true;
    }

    public boolean checkCurrency(Guest guest){
        if(guest.getCurrency() == '£') {
            return true;
        }
        return false;
    }

    public boolean servesFavouriteDrink(Guest guest) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("apple juice");
        drinks.add("orange juice");
        drinks.add("cranberry juice");
        drinks.add("water");
        drinks.add("cola");
        drinks.add("lemonade");
        if (drinks.contains(guest.getFavouriteDrink())){
            return true;
        }
        return false;

    }

}



