
# react-native-tts-for-android

## Getting started

```shell
npm install --save react-native-tts-for-android
```

### Mostly automatic installation

```shell
react-native link react-native-tts-for-android
```

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.duydq.reactandroidtts.RNAndroidTextToSpeechPackage;` to the imports at the top of the file
  - Add `new RNAndroidTextToSpeechPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-tts-for-android'
  	project(':react-native-tts-for-android').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-tts-for-android/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-tts-for-android')
  	```


## Usage

This wrapper library's function uses Promises instead of callbacks. The ".then()" or es2016's `async await`(recommended) keywords should be used. 

### Imports

```js
import AndroidTextToSpeech from 'react-native-tts';
``` 

### Speaking
AndroidTextToSpeech.speack('日本語');


## License

        DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
                    Version 2, December 2004 

 Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this license document, and changing it is allowed as long 
 as the name is changed. 

            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

  0. You just DO WHAT THE FUCK YOU WANT TO.
