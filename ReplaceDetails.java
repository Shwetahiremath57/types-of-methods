class ReplaceDetails{
    static String names[]={"shweta","pooja","muskan","nisarga","rani","raji","soumya","deepa","anita","laxami"};
	
	static void printAll(){
	    for (int index = 0; index < names.length; index++){
             System.out.println(names[index]);
	
	        }
			System.out.println();
	    }
	static void updateName(String []oldName , String []newName){
        for (int index = 0; index < names.length; index++) {
			
		     for(int index1=0;index1<names.length;index1++){
				 
		    if (oldName.equals(names[index])){
			    names[index]=newName[index1];
			}
	    }
	}
	
}
}