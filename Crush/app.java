public class App {

	public static void main(String[] args) {
		
	int row,col;
		for(row=1;row<=3;row++) {
			for(col=1;col<=18;col++) {
				
				if((col>=5-row && col<=6+row) || (col>=14-row && col<=15+row)) {
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
		for(row=0;row <9;row++) {
			for(col=1;col<=18;col++) {
				if(col>=row+1 && col<=18-row) {
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("====================");
		try {
			System.out.println("");


			System.out.println("It's like a polaroid love");
			Thread.sleep(1000);
			System.out.println("Love, that old-fashioned feeling");
			Thread.sleep(1600);
			System.out.println("But my heart is racing");
			Thread.sleep(1400);
			System.out.println("Why am I like this?");
			Thread.sleep(1400);

			System.out.println("");

			System.out.println("It's like a polaroid love");
			Thread.sleep(1400);
			System.out.println("It's not going my way");
			Thread.sleep(1600);
			System.out.println("I don't even have any trendy filter");
			Thread.sleep(1300);
			System.out.println("But I love that vibe");
			Thread.sleep(1600);
			System.out.println("*(Yeah, yeah, yeah, yeah)*");
			Thread.sleep(1300);

			System.out.println(" ");

			System.out.println("Here is my heart for you");
			Thread.sleep(1600);
			System.out.println("You have to engrave it without correcting it later");
			Thread.sleep(1300);
			System.out.println("It's getting clearer");
			Thread.sleep(1600);
			System.out.println("That this heart in the only one in the world");
			Thread.sleep(1300);

			System.out.println(" ");

			System.out.println("Unknowingly, when you call my name");
			Thread.sleep(1600);
			System.out.println("Heartbreakingly, my heart is pounding");
			Thread.sleep(1300);

			System.out.println("");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();

		}

		System.out.println("====================");
		try {

			System.out.println("");
			
			System.out.println("Hi Diana if makikita mo itong part na ito");
			Thread.sleep(1000);
			System.out.println("may ginawa lang akong short na tula para sayo");
			Thread.sleep(1600);

			System.out.println(" ");

			System.out.println("Diana Nicole Danga, napaka gandang pangalan para sa magandang babae,");
			Thread.sleep(1400);
			System.out.println("Ika'y mahirap abutin, pero aking sisikapin,");
			Thread.sleep(1400);
			System.out.println("Talino mo ay walang ka kupas kupas ang galing,");
			Thread.sleep(1400);

			System.out.println(" ");

			System.out.println("Lagi kitang iniisip.");
			Thread.sleep(1600);
			System.out.println("Sa aking pagtulog,");
			Thread.sleep(1300);
			System.out.println("Sa aking panaginip,");
			Thread.sleep(1600);
			System.out.println("Ikaw ang lagi kong naaalala.");
			Thread.sleep(1300);

			System.out.println(" ");

			System.out.println("Magdamag, buong araw, umaasa akong ");
			Thread.sleep(1600);
			System.out.println("maayos ang iyong kalagayan,");
			Thread.sleep(1300);
			System.out.println("Sana ako ay iniisip mo rin.");
			Thread.sleep(1600);

			System.out.println(" ");

			System.out.println("Bawat minuto, bawat segundo ng araw, ikaw ang laman ng aking isip.");
			Thread.sleep(1600);
			System.out.println("lahat ng sinasabi ko ay totoo");
			Thread.sleep(1300);
			System.out.println("Lahat iyon ay dahil...gusto kita");
			Thread.sleep(1600);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }  
}
