// Abstract Factory interface
interface SupermarketFactory {
    fun createGrocery(): Grocery
    fun createShoppingBag(): ShoppingBag
}