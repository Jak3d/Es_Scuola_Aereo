package Centro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int KgAereo;
		int nMin;
		Errore Errore1 = new Errore();
		
		
		
		persona persona1 = new persona(51, 62, "Carlo");
		//persona1.setNome("Carlo");
		//persona1.setPeso(62);
		System.out.println(" Nome persona 1 |" + persona1.getNome());
		System.out.println("\n Peso persona 1 | " + persona1.getPeso());
		System.out.println("\n Età persona 1  | " + persona1.getAge());
		
		persona persona2 = new persona(44, 79, "Mario");
		//persona2.setNome("Mario");
		//ersona2.setPeso(79);
		System.out.println("\n Nome persona 2 |" + persona2.getNome());
		System.out.println("\n Peso persona 2 |" + persona2.getPeso());
		System.out.println("\n Età persona 2  | " + persona2.getAge());
		
		persona minore1 = new persona(12, 51, "Steve");
		//minore1.setNome("Steve");
		//minore1.setPeso(51);
		System.out.println("\n Nome minore 1  |" + minore1.getNome());
		System.out.println("\n Peso minore 1  |" + minore1.getPeso());
		System.out.println("\n Età minore 1   |" + minore1.getAge());
		
		persona minore2 = new persona(8,27, "Festo");
		//minore2.setNome("Festo");
		//minore2.setPeso(27);
		System.out.println("\n Nome minore 2  |" + minore2.getNome());
		System.out.println("\n Peso minore 2  |" + minore2.getPeso());
		System.out.println("\n Età minore 2   |" + minore2.getAge());
	
		persona minore3 = new persona(11, 42, "Antony");
		//minore3.setNome("Antony");
		//minore3.setPeso(42);
		System.out.println("\n Nome minore 3  |" + minore3.getNome());
		System.out.println("\n Peso minore 3  |" + minore3.getPeso());
		System.out.println("\n Età minore 3   |" + minore3.getAge());
		
		persona minore4 = new persona(16, 31, "Puea");
		//minore4.setNome("Peua");
		//minore4.setPeso(31);
		System.out.println("\n Nome minore 4  |" + minore4.getNome());
		System.out.println("\n Peso minore 4  |" + minore4.getPeso());
		System.out.println("\n Età minore 4   |" + minore4.getAge());
		
		valigia valigia1 = new valigia(10, "Carlo");
		System.out.println("\n Peso valigia 1   |" + valigia1.getPeso());
		
		valigia valigia2 = new valigia(15, "Mario");
		System.out.println("\n Peso valigia 2   |" + valigia2.getPeso());


		valigia valigia3 = new valigia(11, "Steve");
		System.out.println("\n Peso valigia 3   |" + valigia3.getPeso());


		valigia valigia4 = new valigia(7, "Festo");
		System.out.println("\n Peso valigia 4   |" + valigia4.getPeso());


		valigia valigia5 = new valigia(9, "Antony");
		System.out.println("\n Peso valigia 5   |" + valigia5.getPeso());


		valigia valigia6 = new valigia(2, "Puea");
		System.out.println("\n Peso valigia 6   |" + valigia6.getPeso());


		KgAereo = persona1.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

		}
		KgAereo = KgAereo + valigia1.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 KgAereo = KgAereo - valigia1.getPeso();
		}
		KgAereo = KgAereo + persona2.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 
		}
		KgAereo = KgAereo + valigia2.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 KgAereo = KgAereo - valigia2.getPeso();
		}
		KgAereo = KgAereo + minore1.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

		}
		KgAereo = KgAereo + valigia3.getPeso();
		nMin = 1;
		if (KgAereo > 300) {
				KgAereo = KgAereo - valigia3.getPeso();
		}

		if (nMin > 3) {
			Errore1.infoBox("Numero minori superiore al massimo consentito", "Operazione Fallita");
			System.out.println("\n Peso Rimosso");

		}
		KgAereo = KgAereo + minore2.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

		}
		nMin = nMin + 1;
		if (nMin > 3) {
			Errore1.infoBox("Numero minori superiore al massimo consentito", "Operazione Fallita");
			System.out.println("\n Peso Rimosso");

		}
		KgAereo = KgAereo + valigia4.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 KgAereo = KgAereo - valigia4.getPeso();
		}
		
		
		KgAereo = KgAereo + minore3.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

		}
		KgAereo = KgAereo + valigia5.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 KgAereo = KgAereo - valigia5.getPeso();
		}
		nMin = nMin + 1;
		if (nMin > 3) {
			Errore1.infoBox("Numero minori superiore al massimo consentito", "Operazione Fallita");
			System.out.println("\n Peso Rimosso");

		}
		
		KgAereo = KgAereo + minore4.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 KgAereo = KgAereo - minore4.getPeso();
		}
		KgAereo = KgAereo + valigia6.getPeso();
		if (KgAereo > 300) {
			 Errore1.infoBox("Peso Eccessivo", "Operazione Fallita");
				System.out.println("\n Peso Rimosso");

			 KgAereo = KgAereo - valigia6.getPeso();
		}
		nMin = nMin + 1;
		if (nMin > 3) {
			Errore1.infoBox("Numero minori superiore al massimo consentito", "Operazione Fallita");
			System.out.println("\n Peso Rimosso");

			nMin = nMin - 1;
			KgAereo = KgAereo - minore4.getPeso();
		}
		
		System.out.println(" \n Peso Aereo finale = " + KgAereo);
		



		
		
		 
		
		
		
	} 

}
