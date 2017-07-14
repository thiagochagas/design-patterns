package br.com.patterns.chain;

public class CorsFilter implements Filter {

	private Filter delegate = new DefaultFilter();
	
	public CorsFilter(Filter delegate) {
		this.delegate = delegate;
	}

	@Override
	public void doFilter() {
		System.out.println("CorsFilter");
		delegate.doFilter();		
	}

	
}
