class Application {


    fun initGame() {
        println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)")
        var userInputCarList = readLine()
        // check 5, or Error
        println("시도할 횟수를 입력해 주세요")
        var userInputChanceNumber = readLine()!!.toInt()
    }

}