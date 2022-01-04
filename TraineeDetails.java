class TraineeDetails{
    static String names[]={"Shweta","Muskan","Pooji","Nisarga","Rani","Deepa","Soumya","Radhika","Manjula","Laxami"};
	
	static void printAll(){
	    for (int index = 0; index < names.length; index++){
             System.out.print(names[index]+"\t");
	
	        }
			System.out.println();
	    }
	static void updateName(String oldName , String newName){
        for (int index = 0; index < names.length; index++) {
		    if (oldName.equals(names[index])){
			    names[index]=newName;
			}
	    }
	}
}