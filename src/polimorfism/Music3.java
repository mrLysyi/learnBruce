package polimorfism;

import java.util.Random;

enum Note{
	LOW_C, MID_C, HIGH_C
}

class Instrument{
	public static void run(){
		System.out.println("Instrument test");
	}
	void play(Note n){System.out.println("Instrument.play " + n);}
	Object what(){return "Instrument";}
	
	@Override public	String toString(){
		return "str";
	}
	
	void adjust(){System.out.println("Adjusting Instrument");}
	
}
class Wind extends Instrument{
	void play(Note n){System.out.println("Wind.play " + n);}
	String what(){return "Wind";}
	void adjust(){System.out.println("Adjusting Wind");}
	
}

class Percussion extends Instrument{
	void play(Note n){System.out.println("Percursion.play " + n);}
	String what(){return "Percursion";}
	void adjust(){System.out.println("Adjusting Percursion");}
}
class Stringed extends Instrument{
	void play(Note n){System.out.println("Stringed.play " + n);}
	String what(){return "Stringed";}
	void adjust(){System.out.println("Adjusting Percursion");}
}

class Brass extends Wind{
	void play(Note n){System.out.println("Brass.play " + n);}
	void adjust(){System.out.println("Adjusting Brass");}	
}

class Woodwind extends Wind{
	void play(Note n){System.out.println("Woodwind.play " + n);}
	void adjust(){System.out.println("Adjusting Woodwind");}	
}

class InstrumentFactory{
	Random rand = new Random(47);
	public Instrument next(){
	
	switch(rand.nextInt(6)){
	default:
		case 0: return new Wind() ;
		case 1:	return new Percussion();   
		case 2:	return new Brass();
		case 3:	return new Woodwind();
		case 4:	return new Stringed();
	}
}
}

public class Music3 {
public static void tune(Instrument i){
	i.play(Note.MID_C);		
}
public static void tuneAll(Instrument[] e) {
for(Instrument i : e)
	tune(i);
}


public static void main (String[] args){
	InstrumentFactory gen = new InstrumentFactory();
	Instrument[] orchestra = {
			gen.next(),
			gen.next(),
			gen.next(),
			gen.next(),
			gen.next()
			};
			tuneAll(orchestra);	
			System.out.println("Exercide output:");
//			Wind wind = new Wind();
////			System.out.println(wind.what());
//			System.out.println(orchestra[1].toString());
			
	
}
}
