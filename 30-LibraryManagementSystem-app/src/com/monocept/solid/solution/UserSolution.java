package com.monocept.solid.solution;

import java.util.ArrayList;

public class UserSolution {
	



		
		private String name;
		private String userId;
		
		
		
		
		

		
		public UserSolution() {
			super();
		}
		
		public UserSolution(String name, String userId) {
			super();
			this.name = name;
			this.userId = userId;
		}

		@Override
		public String toString() {
			return "UserSolution [name=" + name + ", userId=" + userId + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

}
