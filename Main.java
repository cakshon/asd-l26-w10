public class Main{
    public static void main(String [] args){
        System.out.println("hi");
        int [] data ={5, 7, -3, 6, 1};
        System.out.println("Selection Sort:");
        selectionSort(data);

    }

    public static void selectionSort(int [] data){
        for(int a=0; a<=data.length-2;a++){
            int smallest=data[a+1];
            int iSmallest=a+1;
            for(int b=a+1;b<=data.length-1;b++){
                if(data[b]<smallest){
                    smallest=data[b];
                    iSmallest=b;
                }
            }
            if(smallest<data[a]){
                int temp=data[a];
                data[a]=data[iSmallest];
                data[iSmallest]=temp;
            }
        }
        for(int d:data){
            System.out.print(d+" ");
        }
    }

    public static void bubleSort(int [] data){
        for(int a=data.length-1;a>0;a--){
            for(int b=0;b<a;b++){
                if(data[b+1]>data[b]){
                    int temp = data[b];
                    data[b]= data[b+1];
                    data[b+1] =temp;
                }
            }
        }
    for(int d:data){
        System.out.print(d+" ");
    }

    }
}
