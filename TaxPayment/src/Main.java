
public class Main {

	public static void main(String[] args) 
	{
		Banker dimon = new Banker(1000000);
		dimon.PayTaxes(.35);
		
		System.out.println();
		
		Scientist nye = new Scientist(120000);
		nye.PayTaxes(.20);
		
		System.out.println();
		
		Teacher noctis = new Teacher(36000);
		noctis.PayTaxes(.1);
		dimon.FileTaxReturn();
		
		System.out.println();
		
		nye.FileTaxReturn();
		
		System.out.println();
		
		noctis.FileTaxReturn();
		
		System.out.println();
		
		TaxAuditor craig = new TaxAuditor();
		craig.Audit(nye);
		craig.Audit(noctis);
		craig.Audit(dimon);

	}

}
