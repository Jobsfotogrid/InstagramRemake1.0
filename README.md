# InstagramRemake1.0
 
 UI, Lógica, Animação Gráfica e banco de dados em produção
 
* Linguagem de programação utilizada ```Kotlin```
* Ferramenta de desenvolvimento utilizada ```Android Studio```
* Arquitetura do projeto ```MVP```
* Base de dados ```Firebase | Cloud Firestore```
* Android ```5.0 | Lollipop```
* API ```21```
* AndroidX ```true```
* Android Manifest ```br.com.instagram```
* viewBinding ```true```

Permissões do Android Manisfest:
 ```
 <uses-feature
        android:name="android.hardware.camera"
        android:required="true" />

    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

    <queries>
        <intent>
            <action android:name="android.media.action.IMAGE_CAPTURE" />
        </intent>
    </queries>
 ```
 
 Linhas de implementação adicionadas no Android Manifest:
 ```
 <provider
      android:name="androidx.core.content.FileProvider"
      android:authorities="br.com.instagram.fileprovider"
      android:exported="false"
      android:grantUriPermissions="true">
      <meta-data
          android:name="android.support.FILE_PROVIDER_PATHS"
          android:resource="@xml/file_paths" />
          </provider> 
 ```
 
Bibliotecas de terceiros:

```
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'com.theartofdev.edmodo:android-image-cropper:2.8.0'
    implementation 'androidx.fragment:fragment-ktx:1.4.0'
    implementation 'androidx.camera:camera-camera2:1.0.2'
    implementation 'androidx.camera:camera-lifecycle:1.0.2'
    implementation 'androidx.camera:camera-view:1.0.0-alpha32'

    implementation platform('com.google.firebase:firebase-bom:29.0.3')
    implementation 'com.google.firebase:firebase-auth-ktx'
    implementation 'com.google.firebase:firebase-firestore-ktx'
    implementation 'com.google.firebase:firebase-storage-ktx'
```

 Links úteis:
 * [Add Firebase to your Android project](https://firebase.google.com/docs/android/setup?authuser=0)
 * [Android Image Cropper](https://github.com/ArthurHub/Android-Image-Cropper)
 * [CameraX](https://developer.android.com/jetpack/androidx/releases/camera?hl=pt-br)
 * [CircleImageView](https://github.com/hdodenhof/CircleImageView)
 * [Firebase](https://firebase.google.com/)
 * [Fragment KTX](https://developer.android.com/kotlin/ktx?gclid=Cj0KCQiAqvaNBhDLARIsAH1Pq522ar-HUgnXuNtnt3ZwTPcD0Rx-9OOMLDkJawhcvMJs5q29mUeDVncaAq9ZEALw_wcB&gclsrc=aw.ds)
 * [View Binding](https://developer.android.com/topic/libraries/view-binding#kotlin)
 * [Tiago Aguiar](https://tiagoaguiar.co/)
