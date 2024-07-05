
public class Exeptions {
    public static void main(String[] args) {

        try{
            int ages [] = {12,13,14,15};
            System.out.println("The age of position 4 is: " + ages[4]);
        }catch (Exception e){
            System.out.println("The requested index does not exist");
        }
    }

}
