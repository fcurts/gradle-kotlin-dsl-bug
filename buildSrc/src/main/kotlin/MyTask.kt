import org.gradle.api.tasks.*
import org.gradle.api.DefaultTask
import org.gradle.api.file.FileVisitDetails

import java.io.File

open class MyTask : DefaultTask() {
  @TaskAction
  fun foo() {
    val file = File("foo/bar/baz")
    project.zipTree(file).visit { details ->
      println(details)
    }
  }
}
