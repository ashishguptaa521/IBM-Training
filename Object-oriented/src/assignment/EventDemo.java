package assignment;

class EventImpl implements Event {
	public void perform() {
		System.out.println("First performance.");
	}
}

public class EventDemo {
	class InnerEventImpl implements Event {

		@Override
		public void perform() {
			System.out.println("Second performance.");
		}
	}

	public static class StaticInnerEventImpl implements Event {

		public Object perform;

		@Override
		public void perform() {
			System.out.println("Third performance.");
		}

	}

	public void anotherEvent() {
		class NestedEventImpl implements Event {

			@Override
			public void perform() {
				System.out.println("Fourth performance.");
			}
		}
		;
		new NestedEventImpl().perform();
	}

	public void oneMoreEvent() {
		new Event() {

			public void perform() {
				System.out.println("Fifth performance.");

			}

		}.perform();
	}

	public void oneLastEvent() {
		Event e = () -> System.out.println("Sixth perform.");
		e.perform();
	}

	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();

		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.perform();

		EventDemo.StaticInnerEventImpl se = new EventDemo.StaticInnerEventImpl();
		se.perform();

		ed.anotherEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
	}
}
