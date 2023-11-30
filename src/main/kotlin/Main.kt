fun main(args: Array<String>) {
    // Shopping at a Vegetable Supermarket
    val vegetableSupermarketFactory: SupermarketFactory = VegetableSupermarketFactory()
    val vegetables: Grocery = vegetableSupermarketFactory.createGrocery()
    val plasticBag: ShoppingBag = vegetableSupermarketFactory.createShoppingBag()

    println("Shopping at Vegetable Supermarket:")
    vegetables.displayProductInfo()
    plasticBag.displayBagInfo()

    // Shopping at a Fruit Supermarket
    val fruitSupermarketFactory: SupermarketFactory = FruitSupermarketFactory()
    val fruits: Grocery = fruitSupermarketFactory.createGrocery()
    val reusableBag: ShoppingBag = fruitSupermarketFactory.createShoppingBag()

    println("Shopping at Fruit Supermarket:")
    fruits.displayProductInfo()
    reusableBag.displayBagInfo()
}