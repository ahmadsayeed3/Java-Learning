class Vineet implements Runnable{
    
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is playing");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
     System.out.println("Won't reach here because i am going to suspend it");
    }
}

class Javed implements Runnable{
    
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is playing");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    System.out.println("Won't reach here because i am going to suspend it");
    
    }
}

class RunProgram2{
    
    
    public static void main(String...a){
        
        RunProgram friends = new RunProgram("Ducat Group");
        
        Thread t2 = new Thread( friends, new Javed(), "Business Man" );
        Thread t3 = new Thread( friends, new Vineet(), "NotePad++" );
        
        t2.start(); t3.start();
     

        
        
        
        try{
            Thread.sleep(1000);
        }catch(Exception e ){
            System.out.println(e);
        }
        
        
       System.out.println(Thread.currentThread().getName());
       friends.stop();
    }
}
