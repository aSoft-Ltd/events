plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
    id("org.jetbrains.dokka")
    signing
//    id("picortex-publish")
}

kotlin {
    js(IR) { library() }

    sourceSets {
        val main by getting {
            dependencies {
                api(projects.eventsCore)
                api(project.dependencies.platform(kotlinw.bom))
                api(kotlinw.react.core)
            }
        }

        val test by getting {
            dependencies {
                implementation(projects.expectCoroutines)
            }
        }
    }
}

aSoftOSSLibrary(
    version = asoft.versions.root.get(),
    description = "A kotlin multiplatform library"
)