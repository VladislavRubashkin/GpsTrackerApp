# GpsTrackerApp

Приложение "Трекер" с реализованными функциями по созданию трека пройденного пути. Так же реализовано стандартное добавление, чтение, редактирование и удаление 
каждого трека из списка элементов БД.

**Технологии:**
- Kotlin
- Navigation
- Coroutines
- Room
- Dagger2
- WorkManager
- Preference
- OpenStreetMaps

**Дополнительно:**
- Clean-architecture
- MVVM
- XML(верстка)
- LiveData
- ViewBinding
- Git

**Зависимости:**

    implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'

    implementation 'androidx.navigation:navigation-fragment-ktx:2.6.0' //2.5.3
    implementation 'androidx.navigation:navigation-ui-ktx:2.6.0'        //2.5.3
    implementation 'androidx.fragment:fragment-ktx:1.6.1'

    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"

    implementation "androidx.room:room-runtime:2.5.2"
    implementation "androidx.room:room-ktx:2.5.2"
    kapt "androidx.room:room-compiler:2.5.2"

    implementation 'com.google.dagger:dagger:2.35.1'
    kapt 'com.google.dagger:dagger-compiler:2.35.1'

    implementation 'androidx.preference:preference:1.2.1'
    implementation 'androidx.preference:preference-ktx:1.2.0'

    implementation 'org.osmdroid:osmdroid-android:6.1.10'
    implementation 'com.github.MKergall:osmbonuspack:6.7.0'

    implementation 'com.google.android.gms:play-services-location:21.0.1'

    implementation 'androidx.work:work-runtime-ktx:2.8.1'
