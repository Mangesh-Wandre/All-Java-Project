package com.java.Interface;

class Phone
{
	void Call()
	{
		System.out.println("Calling Opration Performed");
	}
	void SMS()
	{
		System.out.println("SMS Sending Opration Performed");
	}
}
interface Icamera
{
	void click();
	void Record();
}
interface MediaPlayer
{
	void play();
	void stop();
	void pause();
}


public class Demo_Interface extends Phone implements Icamera,MediaPlayer {
	public void click()
	{
		System.out.println("Photo Click Opration Performed");
	}
	public void Record()
	{
		System.out.println("Video Recording Opration Performed");
	}
	public void play()
	{
		System.out.println("Music Play Opration Performed");
	}
	public void stop()
	{
		System.out.println("Music Stop Opration Performed");
	}
	public void pause()
	{
		System.out.println("Music Pause Opration Performed");
	}
	
	
	
	public static void main(String[] args) 
	{
		Phone P=new Demo_Interface();
		P.Call();
		P.SMS();
		Icamera C=new Demo_Interface();
		MediaPlayer M=new Demo_Interface();
		C.click();
		C.Record();
	
		M.pause();
		M.stop();
		M.play();
	}

}
