# ExpensesApp

This is a simple expenses management application.

## Description

ExpensesApp is a Java application that allows users to manage their expenses. It provides basic functionality for adding and displaying expenses.

## Classes

The application consists of the following main classes:

- **Main**: The entry point of the application. It initializes and starts the ExpensesApp.
- **ExpensesApp**: The core logic of the application. It handles user interactions and manages the expenses.
- **Expense**: A data model class representing an expense. It encapsulates the type, description, value, and month of the expense.
- **ExpenseManager**: A class responsible for managing the expenses. It provides methods for adding expenses, displaying all expenses, and displaying expenses for a specific month.

## Getting Started

To run the application, follow these steps:

1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Run the `Main` class located in the `org.example` package.

## Usage

Once the application is running, you can use the following options:

- **Add Expense**: Enter the details of the expense (description, type, value, month) to add it to the list of expenses.
- **Display All Expenses**: View all the expenses stored in the application.
- **Display Monthly Expenses**: Enter the month number to display the expenses specific to that month.

## Classes

### ExpenseManager

The `ExpenseManager` class is responsible for managing the expenses. It provides the following methods:

- **displayAllExpenses()**: Displays all the expenses stored in the application.
- **displayMonthlyExpenses(Scanner scanner)**: Prompts the user for a month and displays the expenses for that month.
- **addExpense(Scanner scanner)**: Prompts the user to enter the details of a new expense and adds it to the list of expenses.

## Version

1.0

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

Feel free to customize the README as per your requirements.
