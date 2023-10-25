import kotlin.random.Random

class RandomEmployeeGenerator(var minimumSalary: Int, var maximumSalary: Int) {
    private val names = listOf("Mark", "Matthew", "Lukas", "Henry")

    fun generateEmployee(): Employee {
        return Employee(names.random(), Random.nextInt(from = minimumSalary, until = maximumSalary))
    }
}