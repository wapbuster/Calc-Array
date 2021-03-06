package com.indus.training.core;
/**
 * 
 * @author sunnyhith
 *
 */
public interface ICalc {
	/**
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */	
	public double addition(double param1, double param2);

	/**
	 * 
	 * @param param1
	 * @param param2
	 * @param param3
	 * @return
	 */
	public double addition(double param1, double param2, double param3);
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	/*public double addition(double[] param);
	*/  // remove comments here as well as in Calc.java to use calculation by arrays. 
	
	/**
	 * 
	 * @param params
	 * @return
	 */
	public double addition(double ... param);
	
	/**
	 * Description:
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 * 
	 */
	public double subtract(double param1, double param2);

	/**
	 * Description:
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 * 
	 */
	public double multiply(double param1, double param2);

	/**
	 * Description:
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 * 
	 */
	public double division(double param1, double param2);
	
	

}

