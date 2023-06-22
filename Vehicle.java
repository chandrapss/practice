public interface Vehicle{
void start();
}

class Bike implements Vehicle{
    public void start(){
    System.out.println("Bike Has Been Started");
}
}