# Chareem_CameraX

add setting provider in manifest and file_paths.xml in xml path to enable share image

#in manifest
  <provider
      android:name="androidx.core.content.FileProvider"
      android:authorities="${applicationId}.provider"
      android:exported="false"
      android:grantUriPermissions="true">
      <meta-data
          android:name="android.support.FILE_PROVIDER_PATHS"
          android:resource="@xml/file_paths"/>
  </provider>
  
#in xml
<paths xmlns:android="http://schemas.android.com/apk/res/android">
    <external-media-path name="media" android:path="@{string/app_name}/" path="." />
    <files-path name="files" path="."/>
</paths>

add Apllication file and add this code to logging camera x error

class MainApplication : Application(), CameraXConfig.Provider {
    override fun getCameraXConfig(): CameraXConfig {
        return CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig())
            .setMinimumLoggingLevel(Log.ERROR).build()
    }
}
