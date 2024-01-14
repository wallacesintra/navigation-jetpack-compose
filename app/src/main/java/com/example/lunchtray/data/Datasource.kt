package com.example.lunchtray.data

object Datasource {
    val Entree = listOf<Options>(
        Options("Cauliflower", "Whole cauliflower, brined, roasted, and deep fried", 700, false),
        Options("Three Bean Chili", "Black beans, red beans, kidney beans, slow cooked, topped with onion", 400,false),
        Options("Mushroom Pasta", "Penne pasta, mushrooms, basil, with plum tomatoes cooked in garlic and olive oil", 550, false),
        Options("Spicy Black Bean Skillet","Seasonal vegetables, black beans, house spice blend, served with avocado and quick pickled onions", 550, false)
    )

    val SideDish = listOf<Options>(
        Options("Summer Salad", "Heirloom tomatoes, butter lettuce, peaches, avocado, balsamic dressing",250, false),
        Options("Butternut Squash Soup","Roasted butternut squash, roasted peppers, chili oil",300, false),
        Options("Spicy Potatoes", "Marble potatoes, roasted, and fried in house spice blend",200,false),
        Options("Coconut Rice","Rice, coconut milk, lime, and sugar",150, false)
    )

    val Accompaniment = listOf<Options>(
        Options("Lunch Roll","Fresh baked roll made in house",50, false),
        Options("Mixed Berries","Strawberries, blueberries, raspberries, and huckleberries",100, false),
        Options("Pickled Veggies","Pickled cucumbers and carrots, made in house",50, false)
    )
}