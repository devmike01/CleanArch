import org.gradle.kotlin.dsl.PluginDependenciesSpecScope
import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec


object Plugins {

    private const val hilt = "dagger.hilt.android.plugin"
    private const val kapt = "kapt"
    private const val jetbrainKotlin = "org.jetbrains.kotlin.android"
    private const val library ="com.android.library"

    fun set(plugins: PluginDependenciesSpec){
        plugins.run{
            id(library)
            id(jetbrainKotlin)
            kotlin(kapt)
            id(hilt)
        }
    }


    fun setDomainIds(plugins: PluginDependenciesSpec){
        plugins.run{
            id(library)
            id(jetbrainKotlin)
            kotlin(kapt)
            id(hilt)
        }
    }

}