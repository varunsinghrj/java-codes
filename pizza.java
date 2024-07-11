import java.util.Scanner;

public class pizza {
    protected int price;
    private Boolean veg;

    protected int extraCheesePrize=100;
    protected int extraToppingsPrize = 150;
    protected int backpackprie=20;

    protected int basePizzaPrice;
    private Boolean isExtraCheeseAdded=false;
    private Boolean isExtraToppingsAdded=false;
    private Boolean isOptedForTakeaway=false;

    Scanner in = new Scanner(System.in);

    public pizza(Boolean veg){
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        System.out.print("Extra cheese (y/n)? =>");
        char ch = in.next().charAt(0);
        switch (ch){
            case('y'):
                isExtraCheeseAdded = true;
                this.price += extraCheesePrize;
                break;
            case('n'):
                isExtraCheeseAdded=false;
                break;
        }
    }
    public void addExtraToppings(){
        System.out.print("want extra toppings (y/n)? =>");
        char ch = in.next().charAt(0);
        switch (ch){
            case('y'):
                isExtraToppingsAdded = true;
                this.price += extraToppingsPrize;
                break;
            case('n'):
                isExtraToppingsAdded=false;
                break;
        }
    }
    public void takeAway(){
        System.out.print("want TakeAway (y/n)? =>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        switch (ch){
            case('y'):
              isOptedForTakeaway = true;
                this.price += backpackprie;
                break;
            case('n'):
                isOptedForTakeaway=false;
                break;
        }
    }
    public void getBill(){
        String bill = " ";
        System.out.println("Pizza :"+basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra Cheese : "+extraCheesePrize+"\n";
        }
        if (isExtraToppingsAdded){
            bill += "Extra Toppings : "+extraToppingsPrize+"\n";
        }
        if (isOptedForTakeaway){
            bill += "Take Away : "+backpackprie;
        }
        bill += "\nTotal Amount : "+this.price+"\n";
        System.out.println(bill);
        System.out.println("....Thanks you !!! Visit Again....");
    }

}
