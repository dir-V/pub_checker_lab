public class Guest {

    private String name;
    private int age;
    private double balance;
    private Integer sobriety;
    private boolean banned;
    private char currency;
    private String favouriteDrink;

    public Guest(String name, int age, double balance, Integer sobriety, boolean banned, char currency, String favouriteDrink ){
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.sobriety = sobriety;
        this.banned = banned;
        this.currency = currency;
        this.favouriteDrink = favouriteDrink.toLowerCase();

    }

//    Getters and Setters
    public int getAge(){
        return this.age;
    }
    public double getBalance(){
        return this.balance;
    }

    public Integer getSobriety(){
        return this.sobriety;
    }

    public boolean isBanned(){
        return this.banned;
    }

    public char getCurrency(){
        return this.currency;
    }

    public String getFavouriteDrink(){
        return this.favouriteDrink;
    }

}





