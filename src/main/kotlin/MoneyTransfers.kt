import java.util.Scanner

fun main() {
    println("Введите сумму перевода")
    val scanner = Scanner(System.`in`)
    val amount = scanner.nextInt()
    val transferFee = 0.75  //0.75% комиссия за перевод
    val minTransferFee = 35 //минимальная комиссия за перевод в рублях
    var userFee = amount * transferFee / 100   //комиссия пользователя

    if (userFee <= minTransferFee) {
        userFee = minTransferFee.toDouble()
    }

    val totalMessage = "Комиссия за перевод: $userFee рублей"
    println(totalMessage)
}