package commons;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Calculator {
   
   private static Logger log = LogManager.getLogger(Calculator.class);
   
   public int diff(int a, int b) {
	   
      log.info("두 숫자의 차이를 구했습니다...");
      
      return Math.abs(a- b);
   }
}