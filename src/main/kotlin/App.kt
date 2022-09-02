class App {
    fun printHeader(){
        println("""
            ============================
            Aplikasi "Apakah saya jomblo"
            ============================
        """.trimIndent())
    }

    fun run(){
        printHeader()
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}