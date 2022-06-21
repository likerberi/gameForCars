class RandomlyMove {
    val range = (0..9)
    fun judgeMovement() : Boolean {
        if(range.random() > 3) {
            return true
        }
        return false
    }
}
