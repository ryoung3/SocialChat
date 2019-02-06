package com.ryoung3.socialchat.chatserver;

import java.util.ArrayList;
import java.util.List;

import com.ryoung3.socialchat.users.User;

public class ChatServer {

	List<User> currentUsers = new ArrayList<>();
	
	
	public void addUserToChat(User user){
		currentUsers.add(user);
	}
	
	public List<User> displayUsers(){
		return currentUsers;
	}
}
