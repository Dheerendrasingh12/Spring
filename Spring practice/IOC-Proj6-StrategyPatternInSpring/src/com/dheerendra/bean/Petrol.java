package com.dheerendra.bean;


	public final class Petrol implements Engine {

		public Petrol() {
			System.out.println("PetrolEngine:: 0-param constructor ");
		}
		
		@Override
		public void start() {
			System.out.println("PetrolEngine Started");

		}

		@Override
		public void stop() {
			System.out.println("PetrolEngine Stopped");

		}

	}
