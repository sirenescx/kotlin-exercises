import kotlin.math.PI

fun circleArea(radius: Int): Double = 2 * PI * radius

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

fun createUrls(id: Int): List<String> {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    return actions.map { action -> "$prefix/$action/$id" };
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

fun main() {
    println(circleArea(2))
    println(intervalInSeconds(hours = 1, seconds = 25))
    println(intervalInSeconds(minutes = 3))
    val urls = createUrls(2);
    for (url in urls) {
        println(url)
    }
    repeatN(5) { println("Hello, world") }
}