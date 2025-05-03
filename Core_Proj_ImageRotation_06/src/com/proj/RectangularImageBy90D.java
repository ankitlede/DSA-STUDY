package com.proj;

import java.util.ArrayList;

public class RectangularImageBy90D {
	
	
	public static void  retateImage() {
		
		    ArrayList<ArrayList<Integer>> image = new ArrayList<>();

		    image.add(new ArrayList<Integer>() {{
		    	add(1);
		    	add(2);
		    	add(3);
		    	add(4);
		    }});
		    
		    image.add(new ArrayList<Integer>() {{
		    	add(5);
		    	add(6);
		    	add(7);
		    	add(8);
		    }});
		
		    image.add(new ArrayList<Integer>() {{
		    	add(9);
		    	add(10);
		    	add(11);
		    	add(12);
		    }});
		   
		    System.out.println("After Rotation");
		   for(int i = 0 ; i < image.size(); i ++) {
			   for(int j=0; j< image.get(i).size(); j++) {
				 
				   System.out.print(image.get(i).get(j)+"  ");
	   
			   }
			   System.out.println();
		   }
		   
		   // transpose the Image 
		    ArrayList<ArrayList<Integer>> transposeImage = new ArrayList<>();

			   for(int i = 0 ; i <  image.get(0).size(); i ++) { 
				  ArrayList<Integer> row  = new ArrayList<Integer>();
				   for(int j=0; j< image.size(); j++) { 
					   row.add( image.get(j).get(i));
				   }

				   transposeImage.add(row);
			   }
		   

			    System.out.println("  transposeImage  :: ");

			   for(int i = 0 ; i < transposeImage.size(); i ++) {
				   for(int j=0; j< transposeImage.get(i).size(); j++) {
					 
					   System.out.print(transposeImage.get(i).get(j)+"  ");
		   
				   }
				   System.out.println();
			   }
		   
		   
}
	
	
	public static void main(String[] args) {
	
		retateImage();
			
	}
	
}
