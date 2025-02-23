// Kyle Marlia-Conner
// 02/23/2025
// Assignment 10.2

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("Global Tech", 101, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Market", 102, "Japan", "Japanese");

        DomesticDivision domDiv1 = new DomesticDivision("East Coast Sales", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Operations", 202, "California");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
