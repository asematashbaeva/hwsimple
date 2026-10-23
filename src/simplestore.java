import java.util.Scanner;

        public class simplestore
        {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                int phonePrice = 300;
                int laptopPrice = 800;
                int tvPrice = 600;
                int headphonesPrice = 50;
                int chargerPrice = 20;

                int phoneQty = 0;
                int laptopQty = 0;
                int tvQty = 0;
                int headphonesQty = 0;
                int chargerQty = 0;

                double subtotal = 0;
                int itemsPurchased = 0;
                int choice = 0;

                while (choice != 6) {
                    System.out.println("\n===== MY STORE =====");
                    System.out.println("1. Phone - $" + phonePrice);
                    System.out.println("2. Laptop - $" + laptopPrice);
                    System.out.println("3. Television - $" + tvPrice);
                    System.out.println("4. Headphones - $" + headphonesPrice);
                    System.out.println("5. Charger - $" + chargerPrice);
                    System.out.println("6. Checkout");
                    System.out.print("Choose a product: ");

                    choice = input.nextInt();

                    if (choice == 6) {
                        break;
                    }

                    if (choice < 1 || choice > 6) {
                        System.out.println("Invalid option.");
                        System.out.println("Please choose a number from 1 to 6.");
                        continue;
                    }

                    String productName = "";
                    int price = 0;

                    if (choice == 1) {
                        productName = "Phone";
                        price = phonePrice;
                    } else if (choice == 2) {
                        productName = "Laptop";
                        price = laptopPrice;
                    } else if (choice == 3) {
                        productName = "Television";
                        price = tvPrice;
                    } else if (choice == 4) {
                        productName = "Headphones";
                        price = headphonesPrice;
                    } else if (choice == 5) {
                        productName = "Charger";
                        price = chargerPrice;
                    }

                    System.out.println("You selected: " + productName);
                    System.out.println("Price: $" + price);
                    System.out.print("Enter quantity: ");

                    int quantity = input.nextInt();

                    if (quantity <= 0) {
                        System.out.println("Invalid quantity.");
                        System.out.println("Quantity must be greater than 0.");
                        continue;
                    }

                    double itemCost = price * quantity;
                    double itemDiscount = 0;

                    if (quantity >= 5) {
                        itemDiscount = itemCost * 0.05;
                    }

                    subtotal = subtotal + itemCost - itemDiscount;
                    itemsPurchased = itemsPurchased + quantity;

                    if (choice == 1) {
                        phoneQty = phoneQty + quantity;
                    } else if (choice == 2) {
                        laptopQty = laptopQty + quantity;
                    } else if (choice == 3) {
                        tvQty = tvQty + quantity;
                    } else if (choice == 4) {
                        headphonesQty = headphonesQty + quantity;
                    } else if (choice == 5) {
                        chargerQty = chargerQty + quantity;
                    }

                    System.out.println(quantity + " x $" + price + " = $" + itemCost);

                    if (itemDiscount > 0) {
                        System.out.println("Quantity discount: $" + itemDiscount);
                    }

                    System.out.println("Added to cart!");
                    System.out.println("Current total: $" + subtotal);
                }

                System.out.println("\n===== CHECKOUT =====");
                System.out.println("Items purchased: " + itemsPurchased);
                System.out.println("Subtotal: $" + subtotal);

                double discount = 0;

                if (subtotal >= 200) {
                    discount = subtotal * 0.15;
                } else if (subtotal >= 100) {
                    discount = subtotal * 0.10;
                }

                double finalTotal = subtotal - discount;

                System.out.println("Discount: $" + discount);
                System.out.println("Final total: $" + finalTotal);

                double payment = 0;

                while (payment < finalTotal) {
                    System.out.print("Enter payment amount: $");
                    payment = input.nextDouble();

                    if (payment < finalTotal) {
                        System.out.println("Insufficient payment.");
                        System.out.println(
                                "You still need to pay: $" + (finalTotal - payment)
                        );
                    }
                }

                double change = payment - finalTotal;

                System.out.println("Payment successful!");
                System.out.println("Change: $" + change);

                System.out.println("\n===== ITEMS PURCHASED =====");
                System.out.println("Phone: " + phoneQty);
                System.out.println("Laptop: " + laptopQty);
                System.out.println("Television: " + tvQty);
                System.out.println("Headphones: " + headphonesQty);
                System.out.println("Charger: " + chargerQty);

                String mostPurchased = "Phone";
                int highestQty = phoneQty;

                if (laptopQty > highestQty) {
                    highestQty = laptopQty;
                    mostPurchased = "Laptop";
                }

                if (tvQty > highestQty) {
                    highestQty = tvQty;
                    mostPurchased = "Television";
                }

                if (headphonesQty > highestQty) {
                    highestQty = headphonesQty;
                    mostPurchased = "Headphones";
                }

                if (chargerQty > highestQty) {
                    highestQty = chargerQty;
                    mostPurchased = "Charger";
                }

                if (itemsPurchased > 0) {
                    System.out.println("Most purchased product: " + mostPurchased);
                    System.out.println("Quantity: " + highestQty);
                }

                System.out.println("\n========================");
                System.out.println("       MY STORE");
                System.out.println("========================");
                System.out.println("Items purchased: " + itemsPurchased);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Discount: $" + discount);
                System.out.println("Final total: $" + finalTotal);
                System.out.println("Payment: $" + payment);
                System.out.println("Change: $" + change);
                System.out.println("========================");

                if (itemsPurchased >= 10) {
                    System.out.println(
                            "You earned a $10 coupon for your next visit!"
                    );
                }

                System.out.println("Thank you for shopping!");
                System.out.println("========================");


            }
        }


