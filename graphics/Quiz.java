package graphics;
import java.util.*;
import lib.*;
public class Quiz{
    private String elements[] = {"Aluminium", "Argon", "Arsenic", "Antimony", "Astatine", "Americum", "Beryllium", "Boron", "Bromine", "Barium", "Bismuth", "Berkelium", "Bohrium", "Carbon", "Chlorine", "Calcium", "Chromium", "Cobalt", "Copper", "Cadmium", "Caesium", "Cerium", "Curium", "Californium", "Copernicium", "Copper", "Curium", "Darmstadtium", "Dubnium", "Einsteninium", "Erbium", "Europium", "Fermium", "Flerovium", "Flourine", "Francium", "Gadolinium", "Gallium", "Germanium", "Gold", "Hafnium", "Hassium", "Helium", "Holium", "Hydrogen", "Indium", "Iodine", "Iridium", "Iron", "Krypton", "Lanthanum", "Lawrencium", "Lead", "Lithium", "Livermorium", "Lutetium", "Magnesium", "Manganese", "Meitnerium", "Mendelevium", "Mercury", "Molybdenum", "Neon", "Neptunium", "Nickel", "Niobium", "Nitrogen", "Nobelium", "Osmium", "Oxygen", "Palladium", "Phosphorus", "Platinum", "Plutonium", "Polonium", "Praseodymium", "Protactinium", "Radium", "Radon", "Rhenium", "Roentgenium", "Rutherfordium", "Samarium", "Scandium", "Seaborgium", "Selenium", "Silicon", "Silver", "Sodium", "Strontium", "Sulfur", "Tantalum", "Technetium", "Tellurium", "Terbium", "Thallium", "Thorium", "Thullium", "Tin", "Titanium", "Tungsten", "Ununoctium", "Ununpentium", "Ununseptium", "Ununtrium", "Uranium", "Vanvdium", "Xenon", "Ytterbium", "Yttrium", "Zinc", "Zirconium" };                  //contains the list of elements
    private Props p;                            //used to receive the value of the property of the element
    Scanner s = new Scanner(System.in);         //read input from the user via keyboard
    Random rand = new Random();                 //generate random numbers
    int index;                                  //this is the correct answer
    String values[];                            //this stores the correct and incorrect answers.
    String keys[] = {"Discovery_date", "Discovered_by", "allotropes", "Group", "Period", "Block", "Atomic_Number", "State_at_room_temperature", "Electron_configuration", "Melting_Point", "Boiling_point", "Density", "Relative_atomic_mass"};
    int max, score;
    public Quiz(){
        index = rand.nextInt((elements.length-1));
        values = new String[4];
    }

    public void display(){
        try{
            makeQuiz();
        }
        catch(Exception e){
            System.out.println("ERROR : " + e.getMessage());
            //this is for debug only
            /*e.printStackTrace();
            StackTraceElement stackTrace = e.getStackTrace()[0];
            System.out.println("Unexpected Exception due at " + stackTrace.getLineNumber());
             */
        }
    }

    public void makeQuiz(){
        System.out.println("WELCOME TO THE QUIZ");
        System.out.println("Lets get started!");
        try{
            do{
                p = new Props("data/" + elements[index] + ".element");
                System.out.println("There are " + keys.length + " properties available for the quiz.");
                for(int i = 0; i < keys.length; i++){
                    System.out.println((i+1) + ". " + keys[i]);
                }

                System.out.println("Enter a comma seperated number for the things that you want ot take quiz on : ");

                String key_user[] = s.next().split(",");

                //System.out.print("key_user : ");                 //this is for debug only
                //print(key_user);                                 //this is for debug only

                int keys_user[] = new int[key_user.length];

                for(int i = 0; i < key_user.length; i++){
                    keys_user[i] = Integer.parseInt(key_user[i]);
                    --keys_user[i];
                }

                //System.out.print("keys_user : ");                 //this is for debug only
                //print(keys_user);                                 //this is for debug only

                max = key_user.length;
                int questions, i;
                System.out.print("\f");
                for(questions = max, i = 0; questions > 0; --questions, i++){
                    System.out.println("What is the " + keys[keys_user[i]] + " of?");
                    boolean isCorrect = makeQuestion(keys[keys_user[i]]);
                    if(isCorrect){
                        ++score;
                    }
                    System.out.print("\f");
                }

                makeReport(score, max);
                System.out.print("Do you want to take another quiz?(Y/n) ");
                String in = s.next();
                if(in.equalsIgnoreCase("Y") || in.equalsIgnoreCase("Yes")){
                    continue;
                }
                else{
                    break;
                }
            }while(true);
        }
        catch(Exception e){
            System.out.println("ERROR : " + e.getCause());
            //this is for debug only
            /*e.printStackTrace();
            StackTraceElement stackTrace = e.getStackTrace()[0];
            System.out.println("Unexpected Exception due at " + stackTrace.getLineNumber());
             */
        }
    }

    public void makeReport(double score, double max)throws InterruptedException{
        Thread.sleep(3000);
        System.out.print("\n");
        System.out.println("---------------Your Report-------------------");
        System.out.println("Total number of question opted : " + this.max);
        System.out.println("Total number of correct questions : " + this.score);
        double percentage = score / max * 100;
        System.out.println("Percentage : " + percentage + " %");
    }

    public boolean makeQuestion(String key){
        boolean isCorrect = false;
        try{
            index = rand.nextInt((elements.length-1));
            p = new Props("data/" + elements[index] + ".element");
            String ans_correct = p.getProperty(key);
            //printing correct answer
            System.out.println("The element selected is : " + elements[index]);
            //System.out.println("The correct answer is : " + ans_correct);          //this is for debug only

            generateAnswers(ans_correct, key);
            //now printing the options...
            for(int i = 0; i < values.length; i++){
                System.out.println((i+1) + ".  " + values[i]);
            }

            //get answer
            System.out.print("Enter your answer : ");
            int choice = s.nextInt();
            --choice;
            String ans_user = values[choice]; 
            if(ans_user.equalsIgnoreCase(ans_correct)){
                isCorrect = true;
            }
        }
        catch(Exception e){
            System.out.println("ERROR : " + e.getMessage());
            //this is for debug only to see where error occurs ie. to get the line number of the error
            /*e.printStackTrace();
            StackTraceElement stackTrace = e.getStackTrace()[0];
            System.out.println("Unexpected Exception due at " + stackTrace.getLineNumber());*/
        }
        return isCorrect;
    }

    private void generateAnswers(String ans, String key){
        for(int i = 0; i < values.length-1; i++){
            int temp = rand.nextInt((elements.length-1));
            try{
                p = new Props("data/" + elements[temp] + ".element");
                values[i] = p.getProperty(key);
            }
            catch(Exception e){
                System.out.println("ERROR : " + e.getCause());
            }
        }
        values[3] = ans;

        shuffle(values);
    }

    private void shuffle(String a[]){
        int n = a.length;
        for(int i = 0; i < n; i++){
            int change = i + rand.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private void swap(String a[], int i, int change){
        String temp = a[i];
        a[i] = a[change];
        a[change] = temp;
    }

    //This is the main method.... Rock and Roll!
    public static void main(String args[]){
        Quiz z = new Quiz();
        z.display();

    }

    //this method is for debug only .... actually to print the array during the execution of the program!
    public void print(String x[]){
        System.out.print("{");
        for(int i = 0; i < x.length - 1; i++){
            System.out.print(x[i] + ", ");
        }
        System.out.print(x[x.length-1] + "}" + "\n");
    }

    //this method is for debug only ... actually to print the array during the execution of the program!
    public void print(int x[]){
        System.out.print("{");
        for(int i = 0; i < x.length - 1; i++){
            System.out.print(x[i] + ", ");
        }
        System.out.print(x[x.length-1] + "}" + "\n");
    }
}
