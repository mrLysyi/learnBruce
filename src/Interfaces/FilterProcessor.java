package Interfaces;

class FilterAdapter implements Processor {
	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	public String name() {
		return filter.name();
	}

	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}

public class FilterProcessor {
	public static String s ="If she weighs the same as a duck, she’s made of wood";
	public static String ss ="0123456789";
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
		System.out.println("----------------------------");
		Apply.process(new Revert(), ss);

	}
}
