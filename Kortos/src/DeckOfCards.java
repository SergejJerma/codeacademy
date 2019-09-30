import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeckOfCards {

	private ArrayList<Korta> deck = new ArrayList<>();
	private int casino;
	private int as;
	private static int indKortu = 0;
	Scanner sc = new Scanner(System.in);
	
	public void sukurtiKalade() {
		for (Suit s : Suit.values()) {
		
			for (Rank r : Rank.values()) {
				Korta korta = new Korta();
				korta.setRank(r.get());
				korta.setSuit(s.get());	
				deck.add(korta);
				
			}
		}
	}
	
	public void atspausdintiKalade() {
		 {
		for(Korta a : deck) {
			System.out.println(a);
		}
		}

	}
	
    public void sumaisytiKalade() {
        Collections.shuffle(deck);
          }
    
    public void zaistiBJ () {
    		boolean zaisti = true;
    		casino = 0;
    		as = 0;
    		casino = imtiKortas(2);
    		as = imtiKortas(2);
       		System.out.println("Casino turi: "+casino +"\n"+ "Jusu kortu suma: " + as);
    		while (zaisti) {
    			if (as > 21) {
    				System.out.println("Tu pralaimejai"+ "\n");
    				zaisti = false;
    				break;
    			} 
    			System.out.println("[1] - imti korta, [2] - sustoti");
    			int temp = sc.nextInt();
    			switch (temp) {
				case 1: 
					as += imtiKortas(1);
					System.out.println("Jusu kortu suma: " + as + "\n");
					break;
				case 2: 
					if (casino < 17) {
					casino += imtiKortas(1);
					zaisti = false;
					} else zaisti = false;
					break;	
				default:
					break;
				}
    	
    		}
    		if (as > casino) {
    			System.out.println("Tu laimejai\n" + "Casino turi: " + casino);
    		} else if (casino > 21) {
    			System.out.println("Tu laimejai\n" + "Casino turi: " + casino);
    		} else {
    			System.out.println("Tu pralaimejai\n" + "Casino turi: " + casino);
    			zaisti = false;
    		}
 
    	}
    			
    public int imtiKortas(int k) {
       	int kortuReiksme = 0;
       	int temp = 0;
    	for (int i = 0 + indKortu; i < k + indKortu; i++) {
    		temp = deck.get(i).getRank();
    		kortuReiksme += temp;
    	}
    	
       	indKortu += k;
    	return kortuReiksme;
    }
    
    }


