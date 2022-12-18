package crudCliApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class crudCliDemoMain {
    public static void main(String[] args) {
        ArrayList<Laptop> cL= new ArrayList<>();
        Scanner intObj = new Scanner(System.in);
        Scanner stringObj = new Scanner(System.in);
        int value;
        do{

            System.out.println("1. CREATE");
            System.out.println("2. PRINT DATA");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("Enter the choice: ");
            value= intObj.nextInt();
            switch (value){
                case 1:
                    System.out.println("Enter Laptop no : ");
                    int lapId= intObj.nextInt();
                    System.out.println("Enter Laptop name: ");
                    String lapName = stringObj.nextLine();
                    System.out.println("Enter Laptop price :");
                    int lapPrice = intObj.nextInt();
                    cL.add(new Laptop(lapId,lapName,lapPrice));
                    break;
                case 2:
                    Iterator<Laptop> itr = cL.iterator();
                    while (itr.hasNext()){
                        Laptop l1=  itr.next();
                        System.out.println(l1);
                    }
                    break;
                case 3:
                    System.out.println("Enter Lap_id to search");
                    lapId= intObj.nextInt();
                    itr = cL.iterator();
                    while(itr.hasNext()){
                        Laptop l1= itr.next();
                        if(l1.getLapId()==lapId){
                            System.out.println(l1);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Lap_id to Delete");
                    lapId= intObj.nextInt();
                    itr = cL.iterator();
                    while(itr.hasNext()){
                        Laptop l1= itr.next();
                        if(l1.getLapId()==lapId){
                            itr.remove();

                            System.out.println("Data deleted successfully");
                        }
                        else {
                            System.out.println("Data entered is not available");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter Laptop no : ");
                    lapId= intObj.nextInt();
                    System.out.println("Enter Laptop name: ");
                    lapName = stringObj.nextLine();
                    System.out.println("Enter Laptop price :");
                    lapPrice = intObj.nextInt();;
                    ListIterator ltr= cL.listIterator();
                    while(ltr.hasNext()){
                        Laptop l1 = (Laptop) ltr.next();
                        if(l1.getLapId()==lapId){
                            l1.setLapName(lapName);
                            l1.setLapPrice(lapPrice);
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