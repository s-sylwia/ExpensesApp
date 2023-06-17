package org.example;

import java.util.Scanner;

public class ExpensesApp {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();

        while (true) {
            System.out.println("1. Show all expenses.");
            System.out.println("2. Show expenses from a chosen month.");
            System.out.println("3. Add a new expense.");
            System.out.println("4. Close the application");
            System.out.println("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> expenseManager.displayAllExpenses();
                case 2 -> expenseManager.displayMonthlyExpenses(scanner);
                case 3 -> expenseManager.addExpense(scanner);
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
