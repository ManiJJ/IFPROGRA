
public class If3 {
	public static void main(String args[]){

		for(int i=0;i<=50;i++)
		{
			 if((i%3==0)&&(i%5==0)){
				System.out.println("TF");
				
			 }			
			else if(i%3==0){
				System.out.println("T "+i);
			}else if(i%5==0){
				System.out.println("F "+i);
			}
		}
	}
}


