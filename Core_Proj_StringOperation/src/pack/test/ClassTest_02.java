package pack.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassTest_02 {
	
	
	public static void main(String[] args) {
		
		/** List of  voucher Number **/
		
    List<String> vsno = new ArrayList<String>();
     
    for (int i = 1; i <= 10; i++) {
        vsno.add(String.format("VSNO%04d", i));
    }
      
  System.out.println(vsno);
    
  /**  tree of Columns  type wise **/
 
  Map<String, List<String>>  columnsList = new TreeMap<String, List<String>>();
  columnsList.put("D", List.of("Cash Discount","Corporate Discount","Exchange"));
  columnsList.put("P", List.of("Cash Discount","Corporate Discount","Exchange"));
 
  System.out.println(columnsList);

    /** columns Data **/

  Map<String, Map<String, Map<String , Double>>> discountMap = new HashMap<>();

  // Add data to the map
  discountMap.put("VSNO0001", Map.of(
      "D" , Map.of("Cash Discount", 9524.0000),
      "P", Map.of("Cash Discount", 47619.0000)
  ));
  discountMap.put("VSNO0002", Map.of(
      "D", Map.of("Cash Discount", 9524.0000),
      "P", Map.of("Cash Discount", 47619.0000)
  ));
  
  discountMap.put("VSNO0003", Map.of(
		    "D", Map.of( "Cash Discount", 1718.0000, "Exchange", 1145.0000),
		    "P", Map.of(  "Cash Discount", 9733.0000, "Exchange", 6489.0000 )
		));
		discountMap.put("VSNO0004", Map.of(
		    "D", Map.of("Cash Discount", 9524.0000 ),
		    "P", Map.of( "Cash Discount", 47619.0000)
		));
		discountMap.put("VSNO0005", Map.of( 
				"P", Map.of("Cash Discount", 11628.0000)
		));
		discountMap.put("VSNO0006", Map.of(
				"D", Map.of("Corporate Discount", 0.0000 ),
		        "P", Map.of("Corporate Discount", 1550.0000 )
		));

		 // Creating a TreeMap with a custom comparator for descending order
        TreeMap<String, Map<String, Map<String , Double>>> sortedDiscountMap = 
                new TreeMap<>(Comparator.naturalOrder());
        sortedDiscountMap.putAll(discountMap);
		System.out.println("sortedDiscountMap :: :: ");
        sortedDiscountMap.forEach((invoice, discountsByType) -> {
            System.out.println("Invoice: " + invoice);
            discountsByType.forEach((type, discountsByCategory) -> {
                System.out.println("\tType: " + type);
                discountsByCategory.forEach((category, amount) -> {
                    System.out.println("\t\t" + category + ": " + amount);
                });
            });
        });
		

           /**  Column Wise Data Logic  **/

  
 /** Retrieve voucher Number here **/  
  for (int i = 0; i < vsno.size(); i++) {
      String voucherNumber = vsno.get(i);
      System.out.println("Voucher Number: " + voucherNumber);
      
      for (Map.Entry<String, List<String>> entry : columnsList.entrySet()) {  /**   Data Like  {D=[Cash, Corporate, Exchange], P=[Cash, Corporate, Exchange]}   **/
          String discountType = entry.getKey();  
          List<String> discountCategory = entry.getValue();
          
       //   System.out.println("Key: " + discountType);
          for (String value : discountCategory) {

     
        	  if (sortedDiscountMap.containsKey(voucherNumber) && sortedDiscountMap.get(voucherNumber).containsKey(discountType)) {
        		    
        		  
        		    Map<String, Map<String, Double>>  SchemeType= discountMap.get(voucherNumber);
        		    
                    for (String categoryKey : SchemeType.keySet()) {
                    	 
     	
                        System.out.println("  Category: " + categoryKey);

                        Map<String, Double> columnName = SchemeType.get(categoryKey);
            		   System.out.println("columnName ::: "+columnName);

                        
                        for (String itemKey : columnName.keySet()) {
                            //System.out.println("    Item: " + itemKey);
                        }
                    }
        		  
        		  
        		  
          	    Double discountValue = sortedDiscountMap.get(voucherNumber).get(discountType).get(value);
          	    System.out.println(discountValue);
          	    
            }
          
          
          
          }
               
          /** Retrieve the inner map from Column Data**/
		
        
           
          
      }    /**   Scheme Type wise columns forLoop   **/
         
      
  } /** Voucher forLoop**/
    
	
		
		
		
		
		
		
		
		
		
		
	}  /** Main**/

}
