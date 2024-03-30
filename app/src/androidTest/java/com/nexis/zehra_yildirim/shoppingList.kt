package com.nexis.zehra_yildirim

open class Item(val name: String, val price: Double)

class Food(name: String, price: Double, val weight: Double) : Item(name, price)

class Cloth(name: String, price: Double, val type: String) : Item(name, price)

class shoppingList
{
    val items = mutableListOf<Item>()
    fun addItem()
    {
        print("Enter the item type you want to add (1 for Food, 2 for Cloth): ")
        val choice = readLine()?.toIntOrNull() ?: 0
        when (choice)
        {
            1 ->
            {
                println("Enter the item name you want add:")
                val foodName = readLine().orEmpty()
                println("Enter the item price you want add:")
                val foodPrice = readLine()?.toDoubleOrNull() ?: 0.0
                println("Enter the food weight:")
                val foodWeight = readLine()?.toDoubleOrNull() ?: 0.0
                items.add(Food(foodName, foodPrice, foodWeight))
                println("${foodName}" + " is added successfully!")
            }
             2 ->
            {
                println("Enter the item name you want add:")
                val clothName = readLine().orEmpty()
                println("Enter the item price you want add:")
                val clothPrice = readLine()?.toDoubleOrNull() ?: 0.0
                println("Enter the type")
                val clothType = readLine().orEmpty()
                items.add(Cloth(clothName, clothPrice, clothType))
                println("${clothName}" + " is added successfully!")
            }
         else -> println("Please select a valid number.")
        }
    }
    fun displayItems()
    fun deleteItem()
}
fun main()
{
        var choice: Int
        println("** Welcome to Shopping List App ** " + "\n Make your choice : (1-2-3-4) \n " + "1. Add Item \n" + " 2. Display Item \n" + " 3. Delete Item \n" + " 4. Exit")
        print("Your choice is: ")
        choice = readLine()?.toIntOrNull() ?: 0
        when (choice)
        {
            1 -> shoppingList().addItem()
            2 -> shoppingList().displayItems()
            3 -> shoppingList().deleteItem()
            4 -> println("Exiting...")
            else -> println("Please select a valid choice.")
        }

}
