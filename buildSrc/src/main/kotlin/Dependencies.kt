object Versions{
    const val COROUTINE_FLOW ="1.6.0"
    const val KTX_CORE ="1.7.0"
    const val hilt ="2.39.1"
}

object Deps {

    val sharedKapts = arrayListOf("com.google.dagger:hilt-compiler:${Versions.hilt}")

    val sharedApis = listOf<String>(
        "com.google.dagger:hilt-android:${Versions.hilt}",
        "androidx.core:core-ktx:${Versions.KTX_CORE}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE_FLOW}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE_FLOW}"
    )

    val appLibs = listOf<String>(
        "androidx.appcompat:appcompat:1.4.1",
        "com.google.android.material:material:1.5.0",
        "androidx.constraintlayout:constraintlayout:2.1.3",
        "androidx.navigation:navigation-fragment-ktx:2.4.0",
        "androidx.navigation:navigation-ui-ktx:2.4.0",
        "androidx.core:core-ktx:1.7.0",
        "com.google.accompanist:accompanist-navigation-animation:0.18.0",
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.9")


    val domainLibs = listOf<String>(

    )

    val dataLibs = listOf<String>(
        "com.google.code.gson:gson:2.9.0",
        "com.squareup.retrofit2:retrofit:2.9.0",
        ":domain"
    )

}





/*

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.4.0'
    implementation 'androidx.navigation:navigation-ui-ktx:2.4.0'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
 */