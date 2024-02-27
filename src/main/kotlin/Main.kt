import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var totalCost = 0.0

    // Display welcome message
    println("Welcome to the Tip Calculator!")

    // Start a loop to enter item costs
    while (true) {
        // Prompt user for item cost
        print("Enter the cost of items (enter 0 to finish): $")
        val itemCost = scanner.nextDouble()

        // Check if user wants to finish
        if (itemCost == 0.0) {
            break
        }

        // Add item cost to total
        totalCost += itemCost
    }

    // Calculate taxes, total with taxes, and recommended tip
    val taxRate = 0.025
    val taxes = totalCost * taxRate
    val totalWithTaxes = totalCost + taxes
    val recommendedTip = totalWithTaxes * 0.175

    // Display the summary
    println("\nSummary:")
    println("Total Cost: \$${"%.2f".format(totalCost)}")
    println("Taxes (2.5%): \$${"%.2f".format(taxes)}")
    println("Total with Taxes: \$${"%.2f".format(totalWithTaxes)}")
    println("Recommended 17.5% Tip: \$${"%.2f".format(recommendedTip)}")

    scanner.close()
}
