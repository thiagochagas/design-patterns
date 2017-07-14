package br.com.patterns.chain;

public class DefaultFilter implements Filter {

	@Override
	public void doFilter() {
		System.out.println("DefaultFilter");	
	}
}
