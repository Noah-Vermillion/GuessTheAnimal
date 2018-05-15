
package guesstheanimal;
import java.io.*;

public class GuessTheAnimal {

    public static void main(String[] args) {
        System.out.println("your choices are Dog, Cat, Ferret, Pig, Bee, Ant, Lion, Skunk, Shark, Seaweed, Salmon, Goldfish, Hawk, Butterfly,Squirrel, Chicken ");
        System.out.print("Do you live on land? (y for yes, n for no).\n");
	String str = read();
	if (str.charAt(0) == 'y')
	{
            
            System.out.print("Are you a housepet? (y for yes, n for no).\n");
            str = read();
            if (str.charAt(0) == 'y')
            {

                System.out.print("Do you make a lot of noise? (y for yes, n for no).\n");
                str = read();
                if (str.charAt(0) == 'y')
                {
                        System.out.print("Do you have claws? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                           System.out.print("o you have fur? (y for yes, n for no).\n");
                           str = read();
                           if (str.charAt(0) == 'y')
                           {
                                  write("You are a Cat");
                           }
                           else
                           {
                                 write("you are a ");
                           }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                }
                else
                {
                        System.out.print("Do you Move fast? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }   
                }

            }
            else
            {
                System.out.print("Are you an insect? (y for yes, n for no).\n");
                str = read();
                if (str.charAt(0) == 'y')
                {
                        System.out.print("Do you buzz? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                }
                else
                {
                        System.out.print("Do you live in the wild? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                }
            }
        
	}
        else
        {
            System.out.print("Do you live in water? (y for yes, n for no).\n");
            str = read();
            if (str.charAt(0) == 'y')
            {

                System.out.print("Do you live in the ocean? (y for yes, n for no).\n");
                str = read();
                if (str.charAt(0) == 'y')
                {
                        System.out.print("Are you considerd a predator? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                }
                else
                {
                        System.out.print("Do you live in the river? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }  
                        }
                }

            }
            else
            {
                System.out.print("Do you live in the air? (y for yes, n for no).\n");
                str = read();
                if (str.charAt(0) == 'y')
                {
                        System.out.print("Do you have long wings? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                }
                else
                {
                        System.out.print("Do you live in trees? (y for yes, n for no).\n");
                        str = read();
                        if (str.charAt(0) == 'y')
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                        else
                        {
                            System.out.print("Do you have claws? (y for yes, n for no).\n");
                            str = read();
                            if (str.charAt(0) == 'y')
                            {
                                   write("You are a Cat");
                            }
                            else
                            {
                                  write("you are a Dog");
                            }
                        }
                }
            }
        
        }

    }
///////////////////////////////////////////////////

    public static String read()
    {
        byte [] buffer = new byte[10];
        try
        {
            int numBytes = System.in.read(buffer);
        }
        catch(IOException e)
        {
            System.out.print("Error: " + e);
            System.exit(1);
        }
        String str = new String(buffer);
        int ball = 5;
        return (str);
    }

    public static void write(String str)
    {
        System.out.print(str);
    }

}
