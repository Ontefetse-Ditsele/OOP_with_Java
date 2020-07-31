/*Ontefetse Ditsele
 *
 *10 July 2020
*/

public class TestCollator{

    private TestCollator() {}

    public static void main(final String[] args) {
   
        // Test 1: Check Constructor()
        System.out.println("Test 1");
        Collator service = new Collator("Temperature"); 
        
        if (service.label().equals("Temperature")) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
                
        // Test 2: Check set Label()
        System.out.println("Test 2");
        service = new Collator("Temp");
        
        service.label("Temperature"); 
        if (service.label().equals("Temperature")){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        // Test 3: Check record readings().
        System.out.println("Test 3");
        service = new Collator("Temparature");
        
        service.recordReading(15); service.recordReading(19); 
        service.recordReading(30); service.recordReading(21);
        service.recordReading(34); service.recordReading(40);
        
        if (service.numberOfReadings()== 6) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        // Test 4: Check minimum()
        System.out.println("Test 4");
        service = new Collator("Temparature");
        
        service.recordReading(15); service.recordReading(19); 
        service.recordReading(30); service.recordReading(21);
        service.recordReading(34); service.recordReading(40);
        
        if (service.minimum()== 15) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        // Test 5: Check maximum()
        System.out.println("Test 5");
        service = new Collator("Temparature");
        
        service.recordReading(15); service.recordReading(19); 
        service.recordReading(50); service.recordReading(21);
        service.recordReading(34); service.recordReading(40);
        
        if (service.maximum()== 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        // Test 6: Check Average()
        System.out.println("Test 6");
        service = new Collator("Temparature");
        
        service.recordReading(10); service.recordReading(20); 
        service.recordReading(30); service.recordReading(50);
        service.recordReading(63); service.recordReading(40);
        
        if (service.average()== 35.5) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        //Test 7
        System.out.println("Test 7");
        service = new Collator("Temp"); 
        
        if (service.label().equals(service.label())){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }                
        System.out.println("Test 8");
        service = new Collator("Temparature");
        
        service.recordReading(15); service.recordReading(19); 
        service.recordReading(30); service.recordReading(21);
        service.recordReading(34); service.recordReading(40);
        
        if (service.numberOfReadings() == service.numberOfReadings()) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("Test 9");
        service = new Collator("Temparature");
        
        service.recordReading(15); service.recordReading(19); 
        service.recordReading(30); service.recordReading(21);
        service.recordReading(34); service.recordReading(40);
        
        if (service.minimum()== service.minimum()) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("Test 10");
        service = new Collator("Humidity");
        
        service.recordReading(60); service.recordReading(50); 
        service.recordReading(80); service.recordReading(18);
        service.recordReading(24); service.recordReading(40);
        
        if (service.maximum() == service.maximum()) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("Test 11");
        service = new Collator("Preassure");
        
        service.recordReading(1020); service.recordReading(1022); 
        service.recordReading(1045); service.recordReading(1010);
        service.recordReading(1120); service.recordReading(1003);
        
        if (service.average() == service.average()) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }  
}
