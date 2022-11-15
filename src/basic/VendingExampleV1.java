package basic;

public class VendingExampleV1 {

	public static void main(String[] args) {
		
		// to copy the lines that are selected = (Crtl + alt + arrow down)
		String a1Name = "KitKat";
        String a2Name = "Cheetos";
        String a3Name = "Popcorn";
        String a4Name = "M&M";

        String b1Name = "Redbull";
        String b2Name = "Monster";
        String b3Name = "Ice Coffee";
        String b4Name = "Carabaw";

        int a1Qty = 15;
        int a2Qty = 7;
        int a3Qty = 18;
        int a4Qty = 24;

        int b1Qty = 0;
        int b2Qty = 22;
        int b3Qty = 35;
        int b4Qty = 17;


        // buy something
        boolean pay = false;

        if(b1Qty > 0 && pay == true) {
            System.out.println("Drop a Redbull");
            --b1Qty;
            System.out.println("we have " + b1Qty + " of " + b1Name + " in sctock!");
        } else {
            System.out.println("we either dont have redbull or the pay was not good!");
        }


	}

}
