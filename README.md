`./gradlew build` fails with strange compile errors in _buildSrc/src/main/kotlin/MyTask.kt_.

After removing `kotlin-dsl` from _buildSrc/build.gradle.kts_'s `plugins { ... }` block, `./gradlew build` succeeds.