class Exp82{
  private class Engine{

    void start(){
      System.out.println("Engine started");
    }

    void stop(){
      System.out.println("Engine stopped");
    }

  }

  public void drive(){
    Engine engine = new Engine();
    engine.start();
    engine.stop();
  }

  public static void main(String[] args){
    Exp82 car = new Exp82();
    car.drive();
  }
}
