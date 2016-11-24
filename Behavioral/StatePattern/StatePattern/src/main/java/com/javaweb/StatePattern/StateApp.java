package com.javaweb.StatePattern;

import org.omg.CORBA.ACTIVITY_COMPLETED;

/**
 * Hello world!
 *
 */
public class StateApp {
	public static void main(String[] args) {
		Station djfm = new RadioDJFM();
		Radio radio = new Radio();
		radio.setStation(djfm);

		for (int i = 0; i < 10; i++) {
			radio.play();
			radio.nextStation();
		}
		
		Human human = new Human();
		human.setState(new Work());
		for(int i = 0; i < 10; i++){
			human.doSomething();
		}
	}
}
//Context
class Human{
	private Activity state;
	public void setState(Activity state){
		this.state = state;
	}
	public void doSomething(){
		state.doSomething(this);
	}
}
//State
interface Activity{
	public void doSomething(Human context);
}

class Work implements Activity{
	public void doSomething(Human context) {
		System.out.println("Working...");
		context.setState(new DayOff());// We can change state of object inside the state
	}
}

class DayOff implements Activity{
	int count = 0;
	public void doSomething(Human context) {
		if(count < 3){
			System.out.println("Relax...");
			count++;
		}else{
			context.setState(new Work());	//States changes states.
		}
		
	}
}

//State------------------------------------------------------------------
interface Station {
	void play();
}

class Radio7 implements Station {

	public void play() {
		System.out.println("Radio 7 ...");
	}
}

class RadioDJFM implements Station {
	public void play() {
		System.out.println("Radio DJ FM ...");
	}
}

class RadioVesti implements Station {
	public void play() {
		System.out.println("Radio Vesti ...");
	}
}

/**
 * Context
 * 
 * @author Andrii Chernysh
 */
class Radio {
	Station station;

	public void setStation(Station station) {
		this.station = station;
	}

	public void nextStation() {				//Context changes states
		if (station instanceof Radio7) {
			setStation(new RadioDJFM());
		} else if (station instanceof RadioDJFM) {
			setStation(new RadioVesti());
		} else if (station instanceof RadioVesti) {
			setStation(new Radio7());
		}
	}

	void play() {
		station.play();
	}
}