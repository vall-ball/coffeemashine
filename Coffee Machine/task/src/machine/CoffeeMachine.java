package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEnd = false;
        String action;
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
        int choiceOfCoffee;
        int addingSupplies;

        while (!isEnd) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
            switch (action) {
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(disposableCups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    if (scanner.hasNextInt()) {
                    choiceOfCoffee = Integer.parseInt(scanner.nextLine());
                    if (choiceOfCoffee == 1) {
                        if (water >= 250 && coffeeBeans >= 16 && disposableCups != 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            coffeeBeans -= 16;
                            disposableCups--;
                            money += 4;
                        } else {
                            System.out.println("Sorry, not enough water!");
                            /*if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            }
                            if (coffeeBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            if (disposableCups == 0) {
                                System.out.println("Sorry, not enough disposable cups!");
                            }*/
                        }
                    } else if (choiceOfCoffee == 2) {
                        if (water >= 350 && coffeeBeans >= 20 && disposableCups != 0 && milk >= 75) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            coffeeBeans -= 20;
                            disposableCups--;
                            milk -= 75;
                            money += 7;
                        } else {
                            System.out.println("Sorry, not enough water!");
                           /*if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            }
                            if (coffeeBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            if (disposableCups == 0) {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            }*/
                        }
                    } else {
                        if (water >= 200 && coffeeBeans >= 12 && disposableCups != 0 && milk >= 100) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            coffeeBeans -= 12;
                            disposableCups--;
                            milk -= 100;
                            money += 6;
                        } else {
                           /* if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            }
                            if (coffeeBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            if (disposableCups == 0) {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            }*/
                            System.out.println("Sorry, not enough water!");
                        }
                    }


                    } else {
                        String back = scanner.next();
                        break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    addingSupplies = Integer.parseInt(scanner.nextLine());
                    water += addingSupplies;
                    System.out.println("Write how many ml of milk do you want to add:");
                    addingSupplies = Integer.parseInt(scanner.nextLine());
                    milk += addingSupplies;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    addingSupplies = Integer.parseInt(scanner.nextLine());
                    coffeeBeans += addingSupplies;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    addingSupplies = Integer.parseInt(scanner.nextLine());
                    disposableCups += addingSupplies;
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;

                case "exit":
                    isEnd = true;
                    break;
            }
        }
    }
}
   /* static public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }

    static public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");


    }

}
    /*public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int possibleCups = water / 200;
        if (possibleCups > milk / 50) {
            possibleCups = milk / 50;
        }
        if (possibleCups > coffeeBeans / 15) {
            possibleCups = coffeeBeans / 15;
        }

        if (possibleCups < cups) {
            System.out.println("No, I can make only" + possibleCups + " cup(s) of coffee");
        } else if (possibleCups == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (possibleCups - cups) + " more than that)");
        }

        int money = 550;
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");

        System.out.println("Write action (buy, fill, take):");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        switch (action) {
            case "buy":
                buy(money, water, milk, coffeeBeans, disposableCups);
                break;
            case "fill":
                fill(money, water, milk, coffeeBeans, disposableCups);
                break;
            case "take":
                take(money, water, milk, coffeeBeans, disposableCups);
                break;
        }
    }

    public static void buy(int money, int water, int milk, int coffeeBeans, int disposableCups) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            money += 4;
            water -= 250;
            coffeeBeans -= 16;
            disposableCups --;
        } else if (choice == 2) {
            money += 7;
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            disposableCups --;
        } else {
            money += 6;
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            disposableCups --;
        }
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void fill (int money, int water, int milk, int coffeeBeans, int disposableCups) {
        System.out.println("Write how many ml of water do you want to add:");
        Scanner scanner = new Scanner(System.in);
        int addingWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int addingMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addingBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addingCups = scanner.nextInt();

        System.out.println("The coffee machine has:");
        System.out.println(water + addingWater + " of water");
        System.out.println(milk + addingMilk + " of milk");
        System.out.println(coffeeBeans + addingBeans + " of coffee beans");
        System.out.println(disposableCups + addingCups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void take (int money, int water, int milk, int coffeeBeans, int disposableCups) {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }
}*/
