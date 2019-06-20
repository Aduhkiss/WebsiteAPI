package club.infinitygames.websiteapi;

import club.infinitygames.websiteapi.entity.User;

public class Main {
	/*
	 * Main class only here for testing purposes
	 */
	
	public static void main(String[] args) {
//		try {
//			System.out.println(WebsiteAPI.get().getUserAsJson("MrBeefSteak"));
//		} catch (Exception e) {
//			System.out.println("An error has occured!");
//			e.printStackTrace();
//		}
		
		String name = "MrBeefSteak";
		User me = null;
		try {
			me = WebsiteAPI.get().getUser(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Rank of " + name + ": " + me.getGroupName());
	}
}
