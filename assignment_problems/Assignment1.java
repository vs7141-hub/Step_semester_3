package assignment_problems;
public class Assignment1 {
    
    public static void checkVotingEligibility(int age) {
        boolean isEligible = age >= 18;
        
        if (isEligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkVotingEligibility(20);
        checkVotingEligibility(16);
    }
}
