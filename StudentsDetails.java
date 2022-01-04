class StudentsDetails{
    static String names[]={null,null,null,null,null,null,null,null,null,null};
	
	static void printAll(){
	    for (int index = 0; index < names.length; index++){
             System.out.println(names[index]);
	
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
	static void number(int element, String num1){
		names[element]=num1;
	}
}