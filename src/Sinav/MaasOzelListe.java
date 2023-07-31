package Sinav;

public class MaasOzelListe {
	double[]maasDizi;
	int boyut=0;
	
	public void add(double maas) {
		double[]tmp;
		if(maasDizi==null) {
			maasDizi=new double[1];
			maasDizi[0]=maas;
		}else {
			tmp=new double[boyut +1];
			for (int i=0; i<boyut;i++) 
				tmp[i]=maasDizi;
				tmp[boyut]=maas;
				maasDizi=tmp;
		}
			boyut++;
		
	}
		public double[] getList() {
			return maasDizi;
		
	}

}
