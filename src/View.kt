class View {

    fun initGame() : List<String> {
        println("경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)")
        val userInputCarList = readLine()
        return trimString(userInputCarList!!).split(',')
    }

    fun startGame() : Int {
        println("시도할 횟수를 입력해 주세요")
        return readLine()!!.toInt()
    }

    private fun trimString(params: String) : String {
        return params.replace(" ", "")
    }
}