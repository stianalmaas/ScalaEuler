package com.stianalmaas.euler

/**
 * Created by IntelliJ IDEA.
 * User: stian.almaas
 * Date: 16.mai.2010
 * Time: 23:12:06
 * To change this template use File | Settings | File Templates.
 */

object Problem2 {
  def generateFibonacci(limit : Int) : List[Int] = {
    var fib : List[int] = List(1, 2)
    var i = 1
    while (fib(i) + fib(i-1) < limit) {
      fib = fib ::: List(fib(i) + fib(i-1))
      i += 1
    }
    fib
  }

  def main(args : Array[String]) = {
    val fib = generateFibonacci(4000000)
    println(fib)
    println (fib.filter(i=>i%2==0).foldLeft(0){_+_})
  }
}