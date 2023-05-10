package kr.ac.kopo.day15.inter;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("powerOn");

	}

	@Override
	public void powerOff() {
		System.out.println("powerOff");

	}

	@Override
	public void channelUp() {
		System.out.println("channelUp");

	}

	@Override
	public void channelDown() {
		System.out.println("channelDown");

	}

	@Override
	public void volumeUp() {
		System.out.println("volumeUp");

	}

	@Override
	public void volumeDown() {
		System.out.println("volumeDown");

	}

	@Override
	public void mute() {
		System.out.println("mute");

	}

}
