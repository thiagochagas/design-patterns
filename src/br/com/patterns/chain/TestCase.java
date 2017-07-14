package br.com.patterns.chain;

public class TestCase {
	public static void main(String[] args) {
		
		Filter defaultFilter = new DefaultFilter();
		System.out.println("####################### TestCase: AUTH-CORS FILTER #######################:");
		Filter authCorsFilter = new AuthFilter(new CorsFilter(defaultFilter));
		authCorsFilter.doFilter();
		System.out.println("######################### TestCase: AUTH FILTER ##########################:");
		Filter authFilter = new AuthFilter(defaultFilter);
		authFilter.doFilter();
		System.out.println("######################### TestCase: CORS FILTER ##########################:");
		Filter corsFilter = new CorsFilter(defaultFilter);
		corsFilter.doFilter();
	}
}
