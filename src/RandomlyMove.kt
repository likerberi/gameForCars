class RandomlyMove {
    companion object {
        const val NUMBER_MIN_LIMIT = 0
        const val JUDGE_THE_MOVE = 3
        const val NUMBER_MAX_LIMIT = 9
    }
    val range = (NUMBER_MIN_LIMIT .. NUMBER_MAX_LIMIT)
    fun judgeMovement() : Boolean {
        if(range.random() > JUDGE_THE_MOVE) {
            return true
        }
        return false
    }
}
