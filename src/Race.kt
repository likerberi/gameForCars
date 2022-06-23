class Race(var carCompare: CarCompare, var chanceNumber: Int) {
    fun race(randomlyMove: RandomlyMove): Pair<List<CarCompare>, List<CarModel>> {
        val racing = mutableListOf<CarCompare>()
        repeat(chanceNumber) {
            carCompare = carCompare.proceed(randomlyMove)
            racing.add(this.carCompare)
        }
        return racing to findWinner()
    }
    private fun findWinner() : List<CarModel> {
        val winnerGPS = carCompare.checkMaxGPS()
        return carCompare.checkWinners(winnerGPS)
    }
}