import java.util.*;


class moviesite{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Durai's Theatre where all the movies are available");
         System.out.println(" ");
         System.out.print("Enter the number of tickets you want to book : ");
         Boolean flag = true;
         while(flag){
             
         

         System.out.println("Kindly select the Location where you want to see the movie");
          System.out.println(" ");
         System.out.println("For chennai select 1\nFor bangalore select 2\nFor hyderabad select 3");
         System.out.print("Enter the option : ");
         int location = sc.nextInt();
         System.out.println(" ");
         System.out.println("Select you're desired movie");
         System.out.println("Select 1 for LEO\nSelect 2 for Spiderman\nSelect 3 for Avengers");
         System.out.print("Enter the option : ");
         int movie = sc.nextInt();
         System.out.println();
         
        switch (location){
            case 1 : {
                    if(movie == 1){
                        System.out.println("You have selected chennai and the movie is LEO");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    if(movie == 2){
                        System.out.println("You have selected chennai and the movie is Spiderman");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    if(movie == 3){
                        System.out.println("You have selected chennai and the movie is Avengers");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    break;
            }
            case 2 : {
                    if(movie == 1){
                        System.out.println("You have selected Bangalore and the movie is LEO");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    
                    if(movie == 2){
                        System.out.println("You have selected Bangalore and the movie is Spiderman");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    if(movie == 3){
                        System.out.println("You have selected Bangalore and the movie is Avengers");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    break;
            }

            case 3 : {
                    if(movie == 1){
                        System.out.println("You have selected Hyderabad and the movie is LEO");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    
                    if(movie == 2){
                        System.out.println("You have selected Hyderabad and the movie is Spiderman");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }else{
                            System.out.println("Your movie is not confirmed");
                        }
                    }
                    if(movie == 3){
                        System.out.println("You have selected Hyderabad and the movie is Avengers");
                        System.out.print("Select 1 for Yes and 2 for No : ");
                        int confirm = sc.nextInt();
                        if(confirm == 1){
                            System.out.print("Enter your name : ");
                            String name = sc.next();    
                            System.out.println();
                            System.out.print("Enter your number : ");
                            long number = sc.nextLong();
                            System.out.println("Your movie is confirmed and your name is " + name + " and your number is " + number);
                            System.out.print("Do you wish to continue : 1 for YES and 2 for NO : ");
                            int choice = sc.nextInt();
                            if(choice == 1){
                                continue;
                            }else{
                                flag = false;
                                return;
                            }
                        }
                        else{
                            System.out.println("Your movie is not confirmed");
                        }
                       
                    }
        }

        
    }
         }
}
}