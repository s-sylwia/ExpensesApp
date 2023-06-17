package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense> expenses = new ArrayList<>();

    public void displayAllExpenses() {
        expenses.forEach(ExpenseManager::displayExpense);
    }

    private static void displayExpense(Expense expense) {
        System.out.println(expense.getType());
        System.out.println(expense.getDescription());
        System.out.println(expense.getValue());
        System.out.println(expense.getMonth());
    }

    public void displayMonthlyExpenses(Scanner scanner) {
        System.out.println("Which month expenses do you want to display from?");
        int month = Integer.parseInt(scanner.nextLine());

        expenses.stream()
                .filter(expense -> expense.getMonth() == month)
                .forEach(ExpenseManager::displayExpense);
    }

    public void addExpense(Scanner scanner) {
        System.out.println("What do you want to add?");
        String description = scanner.nextLine();
        System.out.println("what type of expense is that?");
        String type = scanner.nextLine();
        System.out.println("how much does it cost?");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("from which month is that expense?");
        int month = Integer.parseInt(scanner.nextLine());

        Expense expense = new Expense(type, description, value, month);
        expenses.add(expense);


    }
}
