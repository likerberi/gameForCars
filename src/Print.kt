fun printRounds(pair: Pair<List<CarCompare>, List<CarModel>>) {
    println("실행 결과")
    for (carName in pair.first) {
        printCarList(carName)
    }

    val winnerCarNames = pair.second.map { it.name }
    println("최종우승 : ${winnerCarNames.joinToString(",")}")
}

private fun printCarList(carCompare: CarCompare) {
    carCompare.forEach {
        println("${it.name} : ${"-".repeat(it.GPS)}")
    }
    println()
}
