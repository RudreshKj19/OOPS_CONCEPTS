package com.rc.compositionaggregation1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login("rudreshkj123@gmail.com","PaSword321!");
		Instagram insta = new Instagram("rudresh_2k4",721,903,login);
		insta.displayProfileDetails();
		System.out.println();
//		insta.login.loginDetails();
		
		
		insta.uploadPost(new Post(20,2.3));
		
		if(insta.post!=null)
			insta.post.displayPostDetails();
		else
			System.out.println("Not Uploaded Any Posts");
		
	}

}
