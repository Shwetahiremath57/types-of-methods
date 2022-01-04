class ReplaceDetailsTester{
    static String oldName[]={"shweta","pooja","muskan","nisarga","rani","raji","soumya","deepa","anita","laxami"};
	static String newName[]={"hubli","bijapur","dharwad","bagalkot","aaaa","bbbbb","ccccc","dddddd","eeeee","bangalore"};
	
	public static void main(String[] args){
	TraineeDetails.printAll();
		
		System.out.println("*******************************************************************************");
		
		for (int index=0; index<oldName.length; index++){
		
        for (int index1 = 0; index1 < oldName.length; index1++) {
		 TraineeDetails.updateName(oldName[index],newName[index1]);
		}
		
	 }   TraineeDetails.printAll();
	}
}