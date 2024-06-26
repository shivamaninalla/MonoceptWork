package com.monocept.model;

import java.util.Comparator;

public class InsurancePolicyComparator {
	
	public static class InsurancePolicyByName implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy arg0, InsurancePolicy arg1) {
			
			return arg0.getHolderName().compareTo(arg1.getHolderName());
		}}
	
	public static class InsurancePolicyByAmount implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy arg0, InsurancePolicy arg1) {
			
			return (int) (arg0.getAmount()-arg1.getAmount());
		}
		
	}
	
	public static class InsurancePolicyByCreationDate implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy arg0, InsurancePolicy arg1) {

			return arg0.getCreationDate().compareTo(arg1.getCreationDate());
		}
		
	}

}
