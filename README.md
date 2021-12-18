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
 
 Permissões do Android Image Cropper no Android Manifest:
 
```
<activity android:name="com.theartofdev.edmodo.cropper.CropImageActivity"
  android:theme="@style/Base.Theme.AppCompat"/>
```
 
 Linhas de implementação adicionadas no Android Manifest:
 ```
 <provider
  android:name="androidx.core.content.FileProvider"
  android:authorities="br.com.instagramremake.fileprovider"
  android:exported="false"
  android:grantUriPermissions="true">
  <meta-data
      android:name="android.support.FILE_PROVIDER_PATHS"
      android:resource="@xml/file_paths" />
</provider>
 ```
 
Bibliotecas de terceiros:

```
implementation 'com.google.android.material:material:1.3.0'

implementation 'com.heinrichreimersoftware:material-intro:2.0.0'

implementation 'de.hdodenhof:circleimageview:3.1.0'

implementation 'com.jakewharton:butterknife:10.0.0'
annotationProcessor 'com.jakewharton:butterknife-compiler:10.0.0'

implementation 'com.theartofdev.edmodo:android-image-cropper:2.8.0'
```

 Links úteis:
 * [Firebase](https://firebase.google.com/)
 * [Butter Knife](https://github.com/JakeWharton/butterknife)
 * [Picasso](https://github.com/square/picasso)
 * [material-intro](https://github.com/heinrichreimer/material-intro)
 * [Android Image Cropper](https://github.com/ArthurHub/Android-Image-Cropper)
 * [CircleImageView](https://github.com/hdodenhof/CircleImageView)
