package org.xtext.example.mydsl.tests;
import org.junit.jupiter.api.Test;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.quicktheories.WithQuickTheories;
import org.xtext.example.mydsl.jSchema.Model;

import com.google.inject.Inject;

public class TestingTestingTesting implements WithQuickTheories {
	
	@Inject
	ParseHelper<Model> parseHelper;
	
	@Test
	  public void addingTwoPositiveIntegersAlwaysGivesAPositiveInteger(){
	    qt()
	    .forAll(integers().allPositive()
	          , integers().allPositive())
	    .check((i,j) -> i + j > 0); 
	  }
	  
	
	
}