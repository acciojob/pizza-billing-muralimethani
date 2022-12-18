package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrise;

    private int toppingsPrice;

    private int takeAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheesePrise=80;
        this.takeAwayPrice=20;

        if (isVeg==true){
            this.price=300;
            this.toppingsPrice=70;
        }
        else{
            this.price=400;
            this.toppingsPrice=120;
        }

        this.isToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isCheeseAdded=false;
        this.isBillGenerated=false;
        this.bill = "Base Price Of The Pizza: "+this.price+ "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            // Add cheese
            this.price =this.price+this.cheesePrise;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price = this.price + this.toppingsPrice;
            isToppingsAdded = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if (isTakeAwayAdded==false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here

        if (isBillGenerated==false){
            if(isCheeseAdded==true){
                this.bill=this.bill+ "Extra Cheese Added: "+this.cheesePrise+"\n";
            }
            if(isToppingsAdded==true){
                this.bill = this.bill+ "Extra Toppings Added: "+ this.toppingsPrice+"\n";
            }
            if (isTakeAwayAdded==true){
                this.bill =this.bill+"Paperbag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill = this.bill+"Total Price: "+this.price+"\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
