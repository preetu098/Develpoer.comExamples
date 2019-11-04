class ArrangeArra
{
  public static void main(String args[])
  {
     int a[]={2,3,1,6,7,9};
	 System.out.println("List of Element:");
	 for(int i=0;i<a.length;i++)
	 {
	 System.out.print(a[i]+" ");
	 }
	 int temp=0;
	 System.out.println();
	 System.out.println("Sort Element");
	 for(int i=0;i<a.length;i++)
	 {
	   for(int j=i+1;j<a.length;j++)
	   {
	     if(a[i]>a[j])
		 {
		     temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		
	   }
	   System.out.print(a[i]+" ");
	 }
  }
}