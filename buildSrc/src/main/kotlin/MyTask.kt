import org.gradle.api.tasks.*
import org.gradle.api.DefaultTask
import org.gradle.api.file.FileVisitDetails

import java.io.File

open class MyTask : DefaultTask() {
  @TaskAction
  fun run() {
    if (1 + 1 == 3) { // don't run this, just exists to demonstrate the compilation issue
      project.zipTree(File("foo/bar/baz")).visit { details -> println(details) }
    }
    println("success")
  }
}
