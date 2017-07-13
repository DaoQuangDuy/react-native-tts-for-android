
import { NativeModules, NativeEventEmitter, Platform } from 'react-native';

const RNAndroidTextToSpeech = NativeModules.AndroidTextToSpeech;

class AndroidTextToSpeech extends NativeEventEmitter {
	speack(utterance) {
		return RNAndroidTextToSpeech.speack(utterance);
	}
}

export default new AndroidTextToSpeech();
