/**
 * 
 */
package abstract1;



/**
 * @author SmPatel
 *
 */
public class InstrumentplayMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//one D array to store 10 objects of sub classes of instrument class
		Instrument[] instru=new Instrument[10];	
		instru[0] =new Piano(); //Assign Piano type of instrument to Instrument reference
		instru[1] =new Flute();  //Assign Flute type of instrument to Instrument reference
		instru[2] =new Guitar(); //Assign Guitar type of instrument to Instrument reference
		instru[3] =new Piano();
		instru[4] =new Flute();
		instru[5] =new Guitar();
		instru[6] =new Piano();
		instru[7] =new Flute();
		instru[8] =new Guitar();
		instru[9] =new Flute();

		String pi = "",fu="",gi="";//display location of subclass object reside inside instrument array
		
		int pcount=0,fcount=0,gcount=0;// three counter are used to count no. of times that subclass object reside inside instrument array
		
		for(int i=0;i<instru.length;i++)
		{
			if (instru[i] instanceof Piano) {
				Piano p = (Piano)instru[i];
				p.play();
				pi=pi+i+" ";
				pcount++;

			}else if (instru[i] instanceof Flute) {
				Flute f = (Flute)instru[i];
				f.play();
				fu=fu+i+" ";
				fcount++;
			}else if (instru[i] instanceof Guitar) {
				Guitar g = (Guitar)instru[i];
				g.play();	
				gi=gi+i+" ";
				gcount++;
			}
		}
		System.out.println("Object Piano Stored at location : "+pi+ "and No. of Piano object is:"+ pcount);
		System.out.println("Object Flute Stored at location : "+fu+"and No. of Flute object is:"+ fcount);
		System.out.println("Object Guitar Stored at location : "+gi+"and No. of Piano object is:"+ gcount);
		
	}

}
