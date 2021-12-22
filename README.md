# InstagramRemake1.0 
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
    
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    
```

Imagens do projeto

![Screenshot_20211221-205409_Instagram](https://user-images.githubusercontent.com/59364674/147013463-2006961e-f227-469e-a804-ac8328bb4776.jpg)
![Screenshot_20211221-205443_Instagram](https://user-images.githubusercontent.com/59364674/147013466-02bacbc6-30df-47b6-8943-190094380552.jpg)
![Screenshot_20211221-205452_Instagram](https://user-images.githubusercontent.com/59364674/147013468-012c1b96-19c1-4ffb-93ec-7fba741aa2ab.jpg)
![Screenshot_20211221-205510_Instagram](https://user-images.githubusercontent.com/59364674/147013478-69818c4e-d12a-4f75-b91e-ed519a38eda0.jpg)
![Screenshot_20211221-205528_Instagram](https://user-images.githubusercontent.com/59364674/147013481-a8ac5275-adee-4f19-ac79-f0a35c1eeb57.jpg)
![Screenshot_20211221-205534_Instagram](https://user-images.githubusercontent.com/59364674/147013492-97fae943-e562-486c-9dee-d478d9262dae.jpg)
![Screenshot_20211221-205542_Instagram](https://user-images.githubusercontent.com/59364674/147013499-9b483e11-8458-4a02-8c35-284025c16ac0.jpg)
![Screenshot_20211221-205608_Instagram](https://user-images.githubusercontent.com/59364674/147013504-9317cd75-be8d-44fc-8e26-40158621b48a.jpg)
![Screenshot_20211221-205630_Instagram](https://user-images.githubusercontent.com/59364674/147013505-15d0b2d8-d925-4f72-b092-c4b75a2b64a4.jpg)

 Links úteis:
 * [Add Firebase to your Android project](https://firebase.google.com/docs/android/setup?authuser=0)
 * [Android Image Cropper](https://github.com/ArthurHub/Android-Image-Cropper)
 * [CameraX](https://developer.android.com/jetpack/androidx/releases/camera?hl=pt-br)
 * [CircleImageView](https://github.com/hdodenhof/CircleImageView)
 * [Firebase](https://firebase.google.com/)
 * [Fragment KTX](https://developer.android.com/kotlin/ktx?gclid=Cj0KCQiAqvaNBhDLARIsAH1Pq522ar-HUgnXuNtnt3ZwTPcD0Rx-9OOMLDkJawhcvMJs5q29mUeDVncaAq9ZEALw_wcB&gclsrc=aw.ds)
 * [Glide](https://github.com/bumptech/glide)
 * [View Binding](https://developer.android.com/topic/libraries/view-binding#kotlin)
 * [Tiago Aguiar](https://tiagoaguiar.co/)
