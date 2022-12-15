package CRUDCliApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class CRUDCliDemoMain {
    public static void main(String[] args) {
        ArrayList<Laptop> c= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int value;
        do{
            System.out.println("1. CREATE");
            System.out.println("2. PRINT DATA");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("Enter the choice: ");
            value= sc.nextInt();
            switch (value){
                case 1:
                    System.out.println("Enter Laptop no : ");
                    int Lap_id= sc.nextInt();
                    System.out.println("Enter Laptop name: ");
                    String Lap_name = sc1.nextLine();
                    System.out.println("Enter Laptop price :");
                    int Lap_price = sc.nextInt();
                    c.add(new Laptop(Lap_id,Lap_name,Lap_price));
                    break;
                case 2:
                    Iterator<Laptop> itr = c.iterator();
                    while (itr.hasNext()){
                        Laptop l1=  itr.next();
                        System.out.println(l1);
                    }
                    break;
                case 3:
                    System.out.println("Enter Lap_id to search");
                    Lap_id= sc.nextInt();
                    itr = c.iterator();
                    while(itr.hasNext()){
                        Laptop l1= itr.next();
                        if(l1.getLap_id()==Lap_id){
                            System.out.println(l1);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Lap_id to Delete");
                    Lap_id= sc.nextInt();
                    itr = c.iterator();
                    while(itr.hasNext()){
                        Laptop l1= itr.next();
                        if(l1.getLap_id()==Lap_id){
                            itr.remove();

                            System.out.println("Data deleted successfully");
                        }
                        else {
                            System.out.println("Data entered is not available");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter Lap_id to Update");
                    Lap_id= sc.nextInt();
                    System.out.println("Enter Laptop name: ");
                    Lap_name = sc1.nextLine();
                    System.out.println("Enter Laptop price :");
                    Lap_price = sc.nextInt();
                    ListIterator ltr= c.listIterator();
                    while(ltr.hasNext()){
                        Laptop l1 = (Laptop) ltr.next();
                        if(l1.getLap_id()==Lap_id){
                            l1.setLap_name(Lap_name);
                            l1.setLap_price(Lap_price);
                            System.out.println(l1);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid value");


            }

        } while (value!=0);

    }

}