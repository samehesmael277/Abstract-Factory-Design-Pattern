// Concrete Factory 1: Vegetable Supermarket
class VegetableSupermarketFactory : SupermarketFactory {
    override fun createGrocery(): Grocery {
        return Vegetables()
    }

    override fun createShoppingBag(): ShoppingBag {
        return PlasticBag()
    }
}

// Concrete Factory 2: Fruit Supermarket
class FruitSupermarketFactory : SupermarketFactory {
    override fun createGrocery(): Grocery {
        return Fruits()
    }

    override fun createShoppingBag(): ShoppingBag {
        return ReusableBag()
    }
}