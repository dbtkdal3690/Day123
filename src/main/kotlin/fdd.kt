/*
==
 */

fun main() {
    println("==프로그램 시작==")
    print("숫자(띄어쓰기로 구분) :")
    var numbers = readLine()!!.trim().split(" ").map { it.toInt() }.toMutableList()


    bubbleSort(numbers)


    print("올림차순 결과 :")
    printNumbers(numbers)
    println()
    print("내림차순 결과 :")
    printNumbersReversed(numbers)
    println()
    println("==프로그램 종료==")
}

fun bubbleSort(numbers: MutableList<Int>){

    var raiseCount =0
    var maxDepth = numbers.size - 1
    for (depth in maxDepth downTo 1) {
        print("raiseCount : ${++raiseCount}")
        for ( i in 0 until depth) {
            println("numbers[$i] vs numbers[${i+1}]")

            if ( numbers[i] > numbers[i+1]) {
                numbers[i] = numbers[i + 1].also { numbers[i+1] = numbers[i]}
            }

        }
    }
}



fun printNumbers(numbers: List<Int>) {
    numbers.forEach{
        print("$it")
    }
}


fun printNumbersReversed(numbers: List<Int>) {
    numbers.withIndex().reversed().forEach{
        print("${it.value}")
    }

    println()

}
