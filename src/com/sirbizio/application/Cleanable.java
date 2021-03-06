package com.sirbizio.application;

/**
 * Interface that is implementable by class that have clean
 * up resources
 * @author fabrizio
 *
 */
public interface Cleanable {

	/**Releases the object's resources*/
	void cleanUp();
	
}
