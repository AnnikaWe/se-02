package se_01;

public class Project {

	String[][] array;

	public Project(String[][] feld) {
		array = feld;
	}

	public boolean isWellSorted(String[] sequence) {
		int zaehler = 0;
	
		//simple_example_10
		
		for(int z = 0; z < sequence.length - 1; z++) {
			for( int y = z+1; y< sequence.length; y++) {
				if(sequence[z].equals(sequence[y])) {
					return false;
				}
			}
		}
		
		
		
		
		int menge = 0;
		

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < sequence.length; j++) {
				if (array[i][0].equals(sequence[j])) {
					for (int k = j + 1; k < sequence.length; k++) {
						if ((array[i][1].equals(sequence[k]))&&!(sequence[j]).equals(sequence[j+1])) {
							zaehler++;
						}
					}
				}
			}
		}

		 int schalter = 0;
			
			for(int c = 0; c < sequence.length; c++) {
				schalter = 0;
				for(int a = 0; a < array.length; a++) {
					for (int b = 0; b < array[0].length; b++) {
						
						if((schalter == 0)&&(sequence[c].equals(array[a][b]))) {
							menge++;
							
							
						} 
						if(sequence[c].equals(array[a][b])){
							schalter =1;
						}
							
						
						
						System.out.println("Sequenz: "+ sequence[c]+"   Array: "+ array[a][b]+ " Menge: "+ menge);
						
					}
				}
				
			}
		
		
		
		if(menge !=sequence.length) {
			return false;
		}
		if (zaehler == array.length) {
			return true;
		}
		
		return false;
		
	}
	

}
