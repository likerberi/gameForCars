class Controller {
    fun process() {
        val app = View()
        val carList = app.initGame()
        val chanceNumber = app.startGame()
        val gameForCar = Race(convertList(carList), chanceNumber)
        val print = gameForCar.race(RandomlyMove())
        printRounds(print)
    }

    private fun convertList(carList: List<String>) : CarCompare {
        return CarCompare(carList.map { CarModel(it)})
    }
}