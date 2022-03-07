package new_features;

// <> is called generic and it is used to make objects of specific type when the class is generic. 
public class Generic<A> {
	private A data;

	public Generic(A data) {
		super();
		this.data = data;
	}

	public A getData() {
		return data;
	}

	public void setData(A data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Generic<String> d1 = new Generic<String>("Hello");
		System.out.println(d1.getData());

		Generic<Integer> d2 = new Generic<Integer>(1000);
		// d2.setData("F"); Would have worked had we not made the objects specific
		System.out.println(d2.getData());
	}

}
