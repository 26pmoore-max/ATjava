//part A philip moore
//worked on this program with jake

public class PartA {
    public static void main(String[] args) {
        //percent of material 
        double material = 100.0;
        int years = 0;
        
        //while loop says that as long meterial is more than 1% loop again. it stops once 99% has decayed
        while (material > 1.0) {
            material /= 2; //materical is decayed by half life every time it loops
            years += 30; //adds 30 years for each half life
        }
        
        System.out.println("Years required: " + years);
        System.out.printf("Material left: %.2f%%\n", material);
    }
}
