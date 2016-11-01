import java.util.Scanner; 
 public class guess { 
 	public static void main(String[] args){ 
 		Scanner input=new Scanner(System.in); 
 		String userguess; 
 		String wordtoguess = "RANDOM"; 
 		String capitalletter; 
 		char l1, l2, l3, l4, l5, l6, g1, cl1, cl2, cl3, cl4, cl5, cl6;
 		do { 
 			do{ 
 				System.out.println("Enter your guess"); 
 				userguess = input.nextLine(); 
 				capitalletter = userguess.toUpperCase(); 
 			} while (userguess.length()!=6); 
 		    l1 = wordtoguess.charAt(0); 
 		    l2 = wordtoguess.charAt(1); 
 		    l3 = wordtoguess.charAt(2); 
 		    l4 = wordtoguess.charAt(3); 
 		    l5 = wordtoguess.charAt(4); 
 		    l6 = wordtoguess.charAt(5); 
 		    cl1 = capitalletter.charAt(0); 
 		    cl2 = capitalletter.charAt(1); 
 		    cl3 = capitalletter.charAt(2); 
 		    cl4 = capitalletter.charAt(3); 
 		    cl5 = capitalletter.charAt(4); 
 		    cl6 = capitalletter.charAt(5); 
 		    if (l1==(cl1) && l2==(cl2) && l3==(cl3) && l4==(cl4) && l5==(cl5) && l6==(cl6)) { 
 		        System.out.println("You have guessed the word correctly"); 
 		        break; 
 		    }else if (l1==(cl1) && l2==(cl2) && l3==(cl3) && l4==(cl4) && l5==(cl5)) { 
 				System.out.println("RANDO?"); 
 				break; 
 			}else if (l1==(cl1) && l2==(cl2) && l3==(cl3) && l4==(cl4)) { 
 				System.out.println("RAND??"); 
 				break; 
 			}else if (l1==(cl1) && l2==(cl2) && l3==(cl3)) { 
				System.out.println("RAN???");	
				break; 
 			}else if (l1==(cl1) && l2==(cl2)) { 
 				System.out.println("RA????");	 
 				break; 
 			}else if (l1==(cl1)) { 
 				System.out.println("R?????");	 
 				break; 
 			}else  
 				System.out.println("??????");	 
 				System.out.println(); }
 		while (capitalletter!=wordtoguess); 					
 	 	} 		  
   } 
 
 