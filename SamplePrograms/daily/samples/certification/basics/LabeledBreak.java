package daily.samples.certification.basics;

public class LabeledBreak {

	public static void main(String[] args) {
		
		System.out.println("Hello java11");
        int[][] list= {{1,13},{5,2},{2,2}};
        int search=2;
        int positionX=-1;
        int positionY=-1;
        
        PARENT_LOOP:for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list[i].length;j++)
            {
                if(list[i][j]==search)
                {
                    positionX=i;
                    positionY=j;
//                    break; //answer: 2,0
//                    break PARENT_LOOP; //answer: 1,1
                    continue; //answer: 2,1
                }
            }
        }
        if(positionX==-1 ||positionY==-1)
        {
            System.out.println("Value"+search+"not found");
         
        }
        else
        {
            System.out.println("Value"+search+"found at" +positionX+","+ positionY);
        }
	}

}
