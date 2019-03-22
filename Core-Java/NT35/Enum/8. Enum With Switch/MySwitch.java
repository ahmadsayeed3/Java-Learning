enum ThreadStatesEnum{
	START, WAITING, RUNNING, DEAD
};

class MySwitch{
	
	private static void usingEnumInSwitch(ThreadStatesEnum th) {
			switch (th){
			case START:
				System.out.println("START thread");
				break;
			case WAITING:
				System.out.println("WAITING thread");
				break;
			case RUNNING:
				System.out.println("RUNNING thread");
				break;
			case DEAD:
				System.out.println("DEAD thread");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}

	public static void main(String...a){
		usingEnumInSwitch(ThreadStatesEnum.START);
		usingEnumInSwitch(ThreadStatesEnum.WAITING);
		usingEnumInSwitch(ThreadStatesEnum.RUNNING);
		usingEnumInSwitch(ThreadStatesEnum.DEAD);
	}

}