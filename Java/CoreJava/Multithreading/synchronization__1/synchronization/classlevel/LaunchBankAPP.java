package thread.synchronization.classlevel;

public class LaunchBankAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank alienAccount=new HSBCBank();
		
//		HSBCBank alien2Account=new HSBCBank(8000);
		
		ATMThread atm=new ATMThread();
		atm.setName("ATM Thread");
		
		
		GooglePayThread googlePay=new GooglePayThread();
		googlePay.setName("GooglePay Thread");
		
//		PhonePeThread phonePe=new PhonePeThread(alienAccount);
//		phonePe.setName("PhonePe Thread");
		
		atm.start();
		googlePay.start();
//		phonePe.start();
		
		

	}

}
