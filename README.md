# InstagramRemake1.0
 
* Linguagem de programação utilizada ```Kotlin```
* Ferramenta de desenvolvimento utilizada ```Android Studio```
* Arquitetura do projeto ```MVP```
* Base de dados ```Firebase```
* Android ```5.0 | Lollipop```
* API ```21```

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
 * [Firebase](https://firebase.google.com/)
 * [Butter Knife](https://github.com/JakeWharton/butterknife)
 * [Picasso](https://github.com/square/picasso)
 * [material-intro](https://github.com/heinrichreimer/material-intro)
 * [Android Image Cropper](https://github.com/ArthurHub/Android-Image-Cropper)
 * [CircleImageView](https://github.com/hdodenhof/CircleImageView)
