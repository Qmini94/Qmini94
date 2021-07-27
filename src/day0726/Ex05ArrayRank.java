package day0726;

public class Ex05ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []name= {"이상아","박수홍","김민지","하하"};
		int []java={90,100,89,90};
		int []oracle= {78,100,90,85};
		int []tot=new int[4];
		double []avg=new double[4];
		int []rank=new int[4];
		/*
		 * 	각 학생들의 점수에 총점,평균,등수를 구하여 출력하시오
		 * 
		 * 출력양식
		 * 번호 이름 자바 오라클 총점 평균 등수
		 * 1	이상아 90	78	168		84	4
		 * 
		 */
		for(int i=0;i<name.length;i++)
		{
			tot[i]=java[i]+oracle[i];
			avg[i]=tot[i]/2.0;
		}
		for(int i=0;i<name.length;i++)
		{
			rank[i]=1;
			for(int y=0;y<name.length;y++)
			{
				if(avg[i]<avg[y])
					rank[i]++;
			}
		}
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균\t등수");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+avg[i]+"\t"+rank[i]);
		}
	}

}
