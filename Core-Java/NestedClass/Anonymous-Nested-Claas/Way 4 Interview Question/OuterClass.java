// Don't think that Interface is making an object. interface has no method that's why it is demanding method to override
// No compilation.

// This is making an anonymous class.

class OuterClass{


	public static void main(String...a){
		My m = new My(){};
	}

}

interface My{
	// No Method here called "Marker Interface"
}