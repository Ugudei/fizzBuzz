package hello;

class FizzBuzz {

    public String getResult(int num) {
      // System.out.println("Hello world!");
      // int num = 20;
      StringBuilder result = new StringBuilder();
      int lucky = 0;
      int fizzbuzz = 0;
      int buzz = 0;
      int fizz = 0;
      int integers = 0;

      for (int i = 1; i <= num; i++) {
        if (Integer.toString(i).contains("3")) {
          lucky++;
          // System.out.print("lucky" + " ");
          result.append("lucky" + " ");
        }
        else if ( i % 15 == 0) {
          fizzbuzz++;
          // System.out.print("fizzbuzz" + " ");
          result.append("fizzbuzz" + " ");
        } 
        else if ( i % 5 == 0) {
          buzz++;
          result.append("buzz" + " ");
        }
        else if ( i % 3 == 0) {
          fizz++;
          result.append("fizz" + " ");
        }
        else {
          integers++;
          result.append(i + " ");
          
        }
    }
        result.append(" \n" + "fizz" + " : " + fizz);
        result.append(" \n" +"buzz" + " : " + buzz);
        result.append(" \n" +"fizzbuzz" + " : " + fizzbuzz);
        result.append(" \n" +"lucky" + " : " + lucky);
        result.append(" \n" +"integer" + " : " + integers);
        String finalResult = result.toString();
        return finalResult;
  }
}