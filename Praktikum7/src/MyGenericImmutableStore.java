public class MyGenericImmutableStore<T> { // extends Number
	MyGenericImmutableStore(T obj) { this.obj = obj; }
	T obj;
	public T getObject() {
		return this.obj;
	}

	public static void main(String[] args) {
		MyGenericImmutableStore<Integer> intObj = new MyGenericImmutableStore<Integer>(42);
		System.out.println(intObj.getObject());

		/** The hitchhicker's guide to the Galaxy, 1978-1980 **/
		String fourtyTwo = "The answer to the ultimate question of life, the universe, and everything.";
		// instance of String type
		MyGenericImmutableStore<String> stringObj = new MyGenericImmutableStore<String>(fourtyTwo);
		System.out.println(stringObj.getObject());
		//intObj = stringObj; // verursacht einen Fehler
	}
}
