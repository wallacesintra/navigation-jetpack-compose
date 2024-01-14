package com.example.lunchtray

import com.example.lunchtray.data.Datasource

enum class SideDish{
    Cauliflower, ThreeBeanChili, MushroomPasta, SpicyBlackBeanSkillet
}

enum class Entree{
    SummerSalad, ButternutSquashSoup, SpicyPotatoes, CoconutRice
}

enum class Accompaniment{
    LunchRoll, MixedBerries,PickledVeggies
}

data class LunchUiState(
    val sideDish: SideDish,
    val entree: Entree,
    val accompaniment: Accompaniment,
    val totalBill: Int
)
