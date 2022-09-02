class App {
    fun printHeader() {
        println(
            """
            ============================
            Aplikasi "Apakah saya jomblo"
            ============================
            1. Ya
            2. Tidak
            ============================
            Input jawaban anda (Ya / Tidak)
        """.trimIndent()
        )
    }


    fun run() {
        printHeader()
        println(getUserInput())
    }

    private fun getUserInput(): String? {
        var input: String?
        val possibleInputChoice = listOf("gunting", "batu", "kertas")
        do {
            input = readLine()?.lowercase()
            if (!possibleInputChoice.contains(input)) {
                println("Input Pilihan Hanya Ya dan Tidak")
                println("Input Pilihan anda (Ya / Tidak) : ")
            }
        } while (!possibleInputChoice.contains(input))
        return input
    }

    companion object {
        const val KERTAS = "KERTAS"
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}