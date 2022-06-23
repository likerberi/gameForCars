import java.io.IOException

object Main {

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val controller = Controller()
        controller.process()
    }
}
