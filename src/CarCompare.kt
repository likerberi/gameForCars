class CarCompare (private val cars: List<CarModel>) : List<CarModel> by cars{
    fun checkMaxGPS(): Int {
        return maxBy { it.GPS }.GPS
    }

    fun checkWinners(GPS: Int): List<CarModel> {
        return filter { it.GPS == GPS }
    }

    fun proceed(randomlyMove: RandomlyMove) : CarCompare {
        val movingCars = map { it.move(randomlyMove)}
        return CarCompare(movingCars)
    }
}