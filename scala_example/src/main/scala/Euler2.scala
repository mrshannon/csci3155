/*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …

    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

/* answer = 4613732 */

object Euler2 {
  def fibHelper(last2:Long, last1:Long, max:Long) : Long = {
    val next = last2 + last1
    // println("next = "+next)
    if(next > max) {
      0
    } else {
      (if(next % 2 == 0) next else 0) + fibHelper(last1,next,max)
    }
  }

  def fib(max:Long) : Long = {
    fibHelper(0, 1, max)
  }

  lazy val answer = fib(4000000)
}
