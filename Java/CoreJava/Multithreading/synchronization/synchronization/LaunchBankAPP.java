package thread.synchronization;

public class LaunchBankAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank alienAccount=new HSBCBank(8000);
		
		ATMThread atm=new ATMThread(alienAccount);
		atm.setName("ATM Thread");
		
		
		GooglePayThread googlePay=new GooglePayThread(alienAccount);
		googlePay.setName("GooglePay Thread");
		
		PhonePeThread phonePe=new PhonePeThread(alienAccount);
		phonePe.setName("PhonePe Thread");
		
		atm.start();
		googlePay.start();
		phonePe.start();
		
		

	}

}
