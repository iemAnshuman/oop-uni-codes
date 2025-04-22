class Player {
    protected String name;
    protected int age;
    protected String position;
    
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    
    public void play() {
        System.out.println(name + " is playing.");
    }
    
    public void train() {
        System.out.println(name + " is training.");
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}

class Cricket_Player extends Player {
    private String battingStyle;
    
    public Cricket_Player(String name, int age, String position, String battingStyle) {
        super(name, age, position);
        this.battingStyle = battingStyle;
    }
    
    @Override
    public void play() {
        System.out.println(name + " is playing cricket.");
    }
    
    @Override
    public void train() {
        System.out.println(name + " is training for cricket.");
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sport: Cricket");
        System.out.println("Batting Style: " + battingStyle);
    }
}

class Football_Player extends Player {
    private String preferredFoot;
    
    public Football_Player(String name, int age, String position, String preferredFoot) {
        super(name, age, position);
        this.preferredFoot = preferredFoot;
    }
    
    @Override
    public void play() {
        System.out.println(name + " is playing football.");
    }
    
    @Override
    public void train() {
        System.out.println(name + " is training for football.");
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sport: Football");
        System.out.println("Preferred Foot: " + preferredFoot);
    }
}

class Hockey_Player extends Player {
    private String specialSkill;
    
    public Hockey_Player(String name, int age, String position, String specialSkill) {
        super(name, age, position);
        this.specialSkill = specialSkill;
    }
    
    @Override
    public void play() {
        System.out.println(name + " is playing hockey.");
    }
    
    @Override
    public void train() {
        System.out.println(name + " is training for hockey.");
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sport: Hockey");
        System.out.println("Special Skill: " + specialSkill);
    }
}

public class Exp52 {
    public static void main(String[] args) {
        Cricket_Player cricketPlayer = new Cricket_Player("Virat Kohli", 32, "Batsman", "Right-handed");
        Football_Player footballPlayer = new Football_Player("Lionel Messi", 34, "Forward", "Left");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan Chand", 42, "Center forward", "Dribbling");
        
        System.out.println("----- Cricket Player Details -----");
        cricketPlayer.displayDetails();
        cricketPlayer.play();
        cricketPlayer.train();
        
        System.out.println("\n----- Football Player Details -----");
        footballPlayer.displayDetails();
        footballPlayer.play();
        footballPlayer.train();
        
        System.out.println("\n----- Hockey Player Details -----");
        hockeyPlayer.displayDetails();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}