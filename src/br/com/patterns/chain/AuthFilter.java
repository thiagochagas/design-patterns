package br.com.patterns.chain;

public class AuthFilter implements Filter {

private Filter delegate;
	
	public AuthFilter(Filter delegate) {
		this.delegate = delegate;
	}	
	
	@Override
	public void doFilter() {
		System.out.println("AuthFilter");
		delegate.doFilter();		
	}
}
