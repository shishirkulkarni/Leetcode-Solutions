package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
	
	public static void main(String[] args) {
		System.out.println(new GenerateParanthesis().generateParenthesis(3));
	}
	
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0)
            return res;
        validate(res, n - 1, n, "(");
        return res;
    }
    
    private void validate(List<String> res, int no, int nc, String cp) {
        if(no == 0 && nc == 0) {
        	res.add(cp);
        	return;
        }
        
        if(no > 0) {
            validate(res, no - 1, nc, cp + "(");
        }
        
        if(nc > 0 && no < nc) {
            validate(res, no, nc - 1, cp + ")");
        }
    }
}
