//package b.method.ex04;

/*
�ڽ��� �¾ ���� ����� �Ű������� �޾Ƽ� � ������
�¾������ ����ϴ� printSeason() �޼��� ����
(��, �ݵ�� switch���� ����ؾ��ϸ� 1~12���� �ƴ� ����
�Է����� ��� "1~12 ������ ���ڸ� �Է��ϼž� �մϴ�."
��� ���ڸ� ����ϵ��� �ؾ��Ѵ�. �׸��� �־��� �޼�����
�ñ״��Ĵ� �������� �ʴ´�.)
��:3,4,5�� / ����:6,7,8�� / ����:9,10,11�� / �ܿ�: 12,1,2��

����� �Ű����� 8
������ �¾�̳׿�
*/

public class ProbEx04{

	public void printSeason(int month){

		String season = "�ܿ�";
		
		if(month>0 && month<13){

		    switch(month){
		    	case 3:
			    case 4:
			    case 5:
			    	season = "��";
			    break;
			    case 6:
			    case 7:
			    case 8:
			    	season = "����";
			    break;
			    case 9:
			    case 10:
			    case 11:
			    	season = "����";
			    default:
	    	}

			System.out.print(season+ "�� �¾�̳׿�");

			 
		}else {
			System.out.print("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		}


	
	}

	public static void main(String[] args){
		int month=Integer.parseInt(args[0]);
		new ProbEx04().printSeason(month);
	}
}
