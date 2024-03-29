package com.nexis.zehra_yildirim

class shoppingList
{
    fun addItem()
    fun displayItems()
    fun deleteItem()
}
fun main()
{
    var choice: Int
        println("** Welcome to Shopping List App ** " + "\n Make your choice : (1-2-3-4) \n " + "1. Add Item \n" + " 2. Display Item \n" + " 3. Delete Item \n" + " 4. Exit")
        print("Your choice is: ")
        choice = readLine()
        when (choice)
        {
            1 -> shoppingList().addItem()
            2 -> shoppingList().displayItems()
            3 -> shoppingList().deleteItem()
            4 -> println("Exiting...")
            else -> println("Please select a valid choice.")
        }

}
