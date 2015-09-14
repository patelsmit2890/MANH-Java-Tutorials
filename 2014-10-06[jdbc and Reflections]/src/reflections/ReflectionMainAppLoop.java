/**
 * 
 */
package reflections;

import java.awt.image.SampleModel;
import java.lang.reflect.Method;

/**
 * @author SmPatel
 *
 */
public class ReflectionMainAppLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method[] methods=AppTest.class.getMethods();
		
		for(Method method:methods)
		{
			System.out.println(method.getName());
		}

	}

}
