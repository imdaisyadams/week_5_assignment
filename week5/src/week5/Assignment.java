//Daisy Murillo July 20, 2020

package week5;

public class Assignment {
	
	static interface Logger {
		void log(String log);
		void error(String error);
	}

	 static class AsteriskLogger implements Logger {
		@Override
		public void log(String log) {
			System.out.println("*** " + log + " ***");	
		}

		@Override
		public void error(String error) {
			System.out.println("*******************\n" + "*** Error: " + error + " ***\n" + "*******************\n");		
		}
		
	}
	
	 static class SpacedLogger implements Logger {
		@Override
		public void log(String log) {
			
			for(int i =0; i < log.length(); i++) {
				String input = log.charAt(i) + " ";
				System.out.print(input);
			}
			System.out.print("\n");
		}

		@Override
		public void error(String error) {
			StringBuilder input = new StringBuilder();
			
			for(int i =0; i < error.length(); i++) {
				input = input.append(error.charAt(i) + " ");
			}
			System.out.println("*******************\n" + "*** ERROR: " + input  + " ***\n" + "*******************\n" );
		}
	
	}

//	public void run() {
//		AsteriskLogger myTest = new AsteriskLogger();
//		myTest.log("hello");
//		myTest.error("bad");
//		
//	}


}