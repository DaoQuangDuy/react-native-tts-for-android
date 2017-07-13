
package com.echo.reactandroidtts;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.io.IOException;
import java.net.URLEncoder;


import android.media.MediaPlayer;
import android.media.AudioManager;

public class RNAndroidTextToSpeechModule extends ReactContextBaseJavaModule {


	public RNAndroidTextToSpeechModule(ReactApplicationContext reactContext) {
		super(reactContext);
	}

	public String getUrl(String text) {
		text.trim();
		String data = null;
		String[] words = text.split("\\s");
		if(words.length > 1){
			data = words[0];
			for(int i = 1; i< words.length; i++){
				data = data + "%20"+ words[i];
			}
		} else {
			data = text;
		}
		String format = "http://translate.google.com/translate_tts?ie=UTF-8&tl=ja&q=%s&client=tw-ob";
		// String textEncoded = URLEncoder.encode(text);
		String url = String.format(format, data);
		return url;
	}

	@ReactMethod
	public void speack(String text) {
		try {
			MediaPlayer mediaPlayer = new MediaPlayer();
			mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
			mediaPlayer.setDataSource(getUrl(text));
			mediaPlayer.prepare();
			mediaPlayer.start();
		} catch (IOException e) {
			
		}

	}

	@Override
	public String getName() {
		return "AndroidTextToSpeech";
	}
}