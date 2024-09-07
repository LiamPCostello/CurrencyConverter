package uk.lset.CurrencyConverter;

import java.util.ArrayList;
import java.util.Scanner;
// CHANGES: Change ToMenu to elimsante choice

// Main main Switch statement with fromTo methods
// for each currency and their respective Switch statement conversions

public class CurrencyExchangeSystem {

    public static void main(String[] args) {

        System.out.println("*********************** CURRENCY CONVERTER**************************");
        System.out.println("==========================================================================");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        CurrencyExchangeSystem currencyExchangeSystem = new CurrencyExchangeSystem();

        currencyExchangeSystem.displayFromMenu();
        System.out.print("\nPlease select the currency you wish to convert from: ");
        int choice1 = scan.nextInt();

        currencyExchangeSystem.buildOrder(scan);


        currencyExchangeSystem.displayToMenu();
//        System.out.print("\nPlease select the currency you wish to convert to: ");

        int choice2 = scan.nextInt();

    }

    private void buildOrder(Scanner scan) {

        do{
            System.out.print("\nPlease select the currency you wish to convert to: ");
            int option1 = scan.nextInt();
            switch (option1) {

                case 1:
                    gbpConvert(scan, option1);
                    break;

                case 2:
                    eurConvert(scan, option1);
                    break;

                case 3:
                    usdConvert(scan, option1);
                    break;

                case 4:
                    chfConvert(scan, option1);
                    break;

                case 5:
                    rmbConvert(scan, option1);
                    break;
                case 6:
                    System.out.println("Thank you for visiting!");
                default:
                    System.out.println("Invalid input. Try again.");
                    break;

            }


        } while (true);

    }

    private void gbpConvert(Scanner scan, int choice) {
        System.out.print("Please enter your quantity: ");
        int quantity = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have already selected GBP!");
                break;
            case 2:
                System.out.println("Euro (EUR) value of " + quantity + " pounds is " + (quantity * 1.18));
                break;
            case 3:
                System.out.println("Dollar (USD) value of " + quantity + " pounds is " + (quantity * 1.31 ));
                break;
            case 4:
                System.out.println("Swiss Franc (CHF) value of " + quantity + " pounds is " + (quantity * 1.10));
                break;
            case 5:
                System.out.println("Renminbi (RMB) value of " + quantity + " pounds is " + (quantity * 9.31));
                break;
            case 6:
                System.out.println("Thank you for visiting!");
            default:
                System.out.println("Invalid input. Try again.");
                break;
        }
    }

    private void eurConvert(Scanner scan, int choice) {
        System.out.print("Please enter your quantity: ");
        int quantity = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Pound (GBP) value of " + quantity + " pounds is " + (quantity * 0.84));
                break;
            case 2:
                System.out.println("You have already selected EUR!");
                break;
            case 3:
                System.out.println("Dollar (USD) value of " + quantity + " euros is " + (quantity * 1.11 ));
                break;
            case 4:
                System.out.println("Swiss Franc (CHF) value of " + quantity + " pounds is " + (quantity * 0.93));
                break;
            case 5:
                System.out.println("Renminbi (RMB) value of " + quantity + " pounds is " + (quantity * 7.86));
                break;
            case 6:
                System.out.println("Thank you for visiting!");
            default:
                System.out.println("Invalid input. Try again.");
                break;
        }
    }

    private void usdConvert(Scanner scan, int choice) {
        System.out.print("Please enter your quantity: ");
        int quantity = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Pound (GBP) value of " + quantity + " dollars is " + (quantity * 0.76));
                break;
            case 2:
                System.out.println("Dollar (USD) value of " + quantity + " dollars is " + (quantity * 0.90));

                break;
            case 3:
                System.out.println("You have already selected USD!'");
                break;
            case 4:
                System.out.println("Swiss Franc (CHF) value of " + quantity + " dollars is " + (quantity * 0.84));
                break;
            case 5:
                System.out.println("Renminbi (RMB) value of " + quantity + " dollars is " + (quantity * 7.09));
                break;
            case 6:
                System.out.println("Thank you for visiting!");
            default:
                System.out.println("Invalid input. Try again.");
                break;
        }
    }

    private void chfConvert(Scanner scan, int choice) {
        System.out.print("Please enter your quantity: ");
        int quantity = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Pound (GBP) value of " + quantity + " swiss francs is " + (quantity * 0.90));
                break;
            case 2:
                System.out.println("Euro (EUR) value of " + quantity + " swiss francs is " + (quantity * 10.68));
                break;
            case 3:
                System.out.println("Dollar (USD) value of " + quantity + " swiss francs is " + (quantity * 11.84 ));
                break;
            case 4:
                System.out.println("You have already selected CHF!");
                break;
            case 5:
                System.out.println("Renminbi (RMB) value of " + quantity + " swiss francs is " + (quantity * 8.38));
                break;
            case 6:
                System.out.println("Thank you for visiting!");
            default:
                System.out.println("Invalid input. Try again.");
                break;
        }
    }

    private void rmbConvert(Scanner scan, int choice) {
        System.out.print("Please enter your quantity: ");
        int quantity = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Pound (GBP) value of " + quantity + " renminbi is " + (quantity * 0.90));
                break;
            case 2:
                System.out.println("Euro (EUR) value of " + quantity + " renminbi is " + (quantity * 10.68));
                break;
            case 3:
                System.out.println("Dollar (USD) value of " + quantity + " renminbi is " + (quantity * 11.84 ));
                break;
            case 4:
                System.out.println("Swiss Franc (CHF) value of " + quantity + " renminbi is " + (quantity * 8.38));
                break;
            case 5:
                System.out.println("You have already selected RMB!");

                break;
            case 6:
                System.out.println("Thank you for visiting!");
            default:
                System.out.println("Invalid input. Try again.");
                break;
        }
    }
    private FromMenu buildFromMenu() {

        FromMenu fromMenu = new FromMenu();

        ArrayList<Currency> fromMenus = new ArrayList<Currency>();

        Currency gbp = new Currency();
        gbp.setName("1) GBP");
        fromMenus.add(gbp);

        Currency eur = new Currency();
        eur.setName("2) EUR");
        fromMenus.add(eur);

        Currency usd = new Currency();
        usd.setName("3) USD");
        fromMenus.add(usd);

        Currency  chf = new Currency();
        chf.setName("4) CHF");
        fromMenus.add(chf);

        Currency rmb = new Currency();
        rmb.setName("5) RMB");
        fromMenus.add(rmb);

        fromMenu.setFromCurrencies(fromMenus);

        return fromMenu;

    }

    private ToMenu buildToMenu() {

        ToMenu toMenu = new ToMenu();

        ArrayList<Currency> toMenus = new ArrayList<Currency>();

        Currency gbp = new Currency();
        gbp.setName("1) GBP");
        toMenus.add(gbp);

        Currency eur = new Currency();
        eur.setName("2) EUR");
        toMenus.add(eur);

        Currency usd = new Currency();
        eur.setName("3) USD");
        toMenus.add(eur);

        Currency  chf = new Currency();
        chf.setName("4) CHF");
        toMenus.add(chf);

        Currency rmb = new Currency();
        rmb.setName("5) RMB");
        toMenus.add(rmb);

        toMenu.setToCurrencies(toMenus);

        return toMenu;

    }

    private void displayFromMenu() {

        for (Currency currency : buildFromMenu().getFromCurrencies()) {
            System.out.print("              " + currency.getName()) ;
        }
    }

    private void displayToMenu() {

        for (Currency currency : buildToMenu().getToCurrencies()) {
            System.out.print("              " + currency.getName());
        }
    }


    // Convert a currency to another
    public static Double convert(Double amount, Double exchangeValue) {
        Double price;
        price = amount * exchangeValue;
        price = Math.round(price * 100d) / 100d;

        return price;
    }



}
