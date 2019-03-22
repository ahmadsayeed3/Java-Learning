interface Computer{
	abstract public void GUI();
	abstract public void ALU();
	
}

interface CPUProcessor{
	abstract public void ALU(int x);
}

class ComputerReg{
	public void reg(Computer c){
		c.GUI();
		c.ALU();
	}
	
	public void CPUReg(CPUProcessor cp){
		cp.ALU(10);
	}
}

//Making Windows Computer GUI
class Windows implements Computer, CPUProcessor{
	
	static int x = 10;
	
	public static void main(String...a){
			Windows w = new Windows();
			ComputerReg cr = new ComputerReg();
			cr.reg(w);
			cr.CPUReg(w);
	}
	
	public void GUI(){
		//Millions Code of Windows GUI
		System.out.println("Windows GUI");
	}
	
	public void ALU(){
		System.out.println("WIndows CPU Processor");
	}
	
	public void ALU(int x){
		System.out.println( x + " X WIndows CPU Processor");
	}
	
}