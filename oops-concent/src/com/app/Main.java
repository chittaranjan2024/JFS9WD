package com.app;

 interface Playable {

	 int a=100;//constant public final int a=100
	
	void play();//abstract method    abstract void play()
	default void playCheck() //Java 8 feature
	{
		System.out.println("This is playcheck feature");
		sample();
	}
	default void playCheck1() //Java 8 feature
	{
		System.out.println("This is playcheck feature");
		sample();
	}
	
	static void test()//Java 8 feature
	{
		System.out.println("This is a static method");
		
	}
	
	private void sample()
	{
		System.out.println("This is a static method");
	}
	
	
}
 
 
 class PlayableImplentation1 implements Playable
 {

	@Override
	public void play() {
		
		System.out.println("Implementation1 of Playable");
		
	}
	 
 }
 
 
 class PlayableImplentation2 implements Playable
 {

	@Override
	public void play() {
		
		System.out.println("Implementation2 of Playable");
		
	}
	 
 }
 
 class Test extends PlayableImplentation2
 {
	 
 }
 
 public class Main
 {
	 public static void main(String args[])
	 {
		 PlayableImplentation1 implentation1=new PlayableImplentation1();
		 implentation1.play();
		 implentation1.playCheck();
		 
		 
		 PlayableImplentation2 implentation2=new PlayableImplentation2();
		 implentation2.play();
		 implentation2.playCheck();
		 
		 
		 Playable playable=new PlayableImplentation2();
		 playable.play();
		 playable.playCheck();
		 
		 Playable.test();
	 }
 }
 
 
