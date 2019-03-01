package com.ryoung3.socialchat.chatserver;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import com.ryoung3.socialchat.users.User;

public class ChatServer {

	private int port;
	List<User> currentUsers = new ArrayList<>();
	
	public ChatServer(int port) {
		this.port = port;
	}
	
	public void execute() {
		try(ServerSocket serverSocket = new ServerSocket(port)){
			System.out.println("Chat server is listening on port " + port);
		}
		catch(IOException ex) {
			System.out.println("Error in the server: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void addUserToChat(User user){
		currentUsers.add(user);
	}
	
	public List<User> displayUsers(){
		return currentUsers;
	}
}
