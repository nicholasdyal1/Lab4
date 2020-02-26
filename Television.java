/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television {
private final String MANUFACTURER;
private final int SCREEN_SIZE;
private boolean powerOn=false;
private int channel=2;
private int volume=20;
	//constructor that takes string and int
	public Television(String brand, int size) {
		this.MANUFACTURER=brand;
		this.SCREEN_SIZE=size;
	}
	//method to set channel
	public void setChannel(int station) {
		this.channel=station;
	}
	//method to 
	public void power() {
		powerOn=!powerOn;
	}
	public void increaseVolume() {
		volume++;
	}
	public void decreaseVolume() {
		volume--;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public String getManufacturer() {
		return MANUFACTURER;
	}
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
