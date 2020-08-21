`./gradlew build` fails with strange compile errors for _buildSrc/src/main/kotlin/MyTask.kt_.

After commenting out `plugins { `kotlin-dsl` }` in _buildSrc/build.gradle.kts_, `./gradlew build` succeeds.