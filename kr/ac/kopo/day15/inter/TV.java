package kr.ac.kopo.day15.inter;

public interface TV {

	//생략되어있다.
	/*public static final*/ int MAX_VOLUME_SIZE = 50;
	int MIN_VOLUME_SIZE = 0;
	
	//생략되어있다.
	/*public abstract*/ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
}
