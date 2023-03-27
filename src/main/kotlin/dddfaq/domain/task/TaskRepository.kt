package dddfaq.domain.task

interface TaskRepository {
    fun insert(task: Task)
    fun insert(task: Task2)
    fun update(task: Task)
    fun findById(taskId: TaskId): Task
}