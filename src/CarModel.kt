class CarModel(val name: String, val GPS: Int = 0) {

    init {
        require(name.length <= NAME_LENGTH_LIMIT) {
            "The length of name cannot be exceeded by 5"
        }
    }

    fun move(randomlyMove: RandomlyMove): CarModel {
        if (randomlyMove.judgeMovement()) {
            return CarModel(name, GPS + 1)
        }
        return this
    }

    companion object {
        const val NAME_LENGTH_LIMIT = 5
    }
}