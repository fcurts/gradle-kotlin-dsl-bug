plugins {
  `kotlin-dsl`
  kotlin("jvm") version "1.3.72"
}

dependencies {
  api(gradleApi())
}

repositories {
	mavenCentral()
	gradlePluginPortal()
}