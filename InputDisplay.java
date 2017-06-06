pakcage stringvars;
import java.util.Scanner;
public class InputDisplay
{  
        public static void main(String args[])
        {
           Scanner user_input = new Scanner( System.in );
           
           /*Scanner - utility or class                       */
           /*user_input - object name                         */
           /*user_input - object name                         */
           /*new Scanner - it's just there...                 */
           /*System.in - tells that this is an input in system*/
           /*https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html */                   
           
           String first_name;
           System.out.print("Enter first name: ");
           first_name = user_input.next();
           
           String last_name;
           System.out.print("Enter last name: ");
           last_name = user_input.next();           
           
           String middle_name;
           System.out.print("Enter middle name: ");
           middle_name = user_input.next();              
           
           full_name = first_name + " " + middle_name + " " + last_name;
           System.out.println("You are " + full_name);
                      
           /*System.out.println("TEXT!");                     */
           /*println - moves to a new line                    */
           /*print - same line                                */         
        }
}
