
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacakSayi = 7;
		boolean degerVarMi = false;

		for (int i = 0; i < sayilar.length; i++) {

			if (aranacakSayi == sayilar[i]) {

				System.out.println("Aranan Sayi dizinin " + (i + 1) + "elemanı");
				degerVarMi = true;
			} else {
				if (i == (sayilar.length - 1) && degerVarMi==false) { 
						System.out.println("Dizide böyle bir eleman yok;"); 
				}
			}
		}
	}
}
