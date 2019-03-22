class Private{
	//file saving
}

interface Computer{
	abstract private void GUI();
	abstract public void ALU();
	
}


class ComputerReg{
	public void reg(Computer c){
		c.GUI();
		c.ALU();
	}
}

//Making Windows Computer GUI
class Windows implements Computer{
	
	
	public static void main(String...a){
			Windows w = new Windows();
			ComputerReg cr = new ComputerReg();
			cr.reg(w);
	}
	
	public void GUI(){
		//Millions Code of Windows GUI
		System.out.println("Windows GUI");
	}
	
	public void ALU(){
		System.out.println("WIndows CPU Processor");
	}
	
}