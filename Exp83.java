class Exp83{
  interface EventHandler{
    void handleEvent();
  }

  void registerEvent(){
    class LocalEventHandler implements EventHandler{
      public void handleEvent(){
        System.out.println("Event handled by local inner class");
      }
    }

    LocalEventHandler someHandler = new LocalEventHandler();
    someHandler.handleEvent();
  }

  public static void main(String[] args){
    Exp83 event = new Exp83();
    event.registerEvent();

    EventHandler aEvent = new EventHandler(){
      public void handleEvent(){
        System.out.println("Event handled by annonymous inner class");
      }
    };
    aEvent.handleEvent();
  }
}

