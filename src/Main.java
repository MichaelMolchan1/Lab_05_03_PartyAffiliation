public class Main {
    public static void main(String[] args) {
        String politicalParty = "green";
        if (politicalParty.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (politicalParty.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (politicalParty.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person!");
        }
        else
        {
            System.out.println("I don't know what the " + politicalParty + " party is.");
        }
    }
}