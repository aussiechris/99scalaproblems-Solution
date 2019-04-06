package problems

import scala.annotation.tailrec

object NinetyNine {

  // Find the last element of a list.

  def lastElement[T](list: List[T]): T = {
    list.last
  }

  // Find the last but one element of a list.
  def secondLastElement[T](list: List[T]): T = {
    if (list.length > 1) {
      list(list.length - 2)
    } else throw new NoSuchElementException
  }

  // Find the Kth element of a list.
  def kthElement[T](list: List[T], element: Int): T = {
    if (0 <= element && element < list.length) {
      list(element)
    } else throw new NoSuchElementException

  }

  // Find the number of elements of a list.
  def listLength[T](list: List[T]): Int = {
    list.length
  }

  // Reverse a list.
  def reverseList[T](list: List[T]): List[T] = {
    list.reverse
  }

  // Find out whether a list is a palindrome.
  def isPalindrome[T](list: List[T]): Boolean = {
    list == list.reverse
  }

  // Flatten a nested list structure.
  def flattenList[T](list: List[T]): List[T] = {
    ???
  }

  // Eliminate consecutive duplicates of list elements.
  // If a list contains repeated elements they should be replaced with a single copy of the element.
  // The order of the elements should not be changed.
  def noConsecutiveDupes[T](list: List[T]): List[T] = {
    ???
  }

  // Pack consecutive duplicates of list elements into sublists.
  // If a list contains repeated elements they should be placed in separate sublists.
  def dupePacker[T](list: List[T]): List[List[T]] = {
    ???
  }

  // Run-length encoding of a list.
  // Use the result of dupePacker to implement the so-called run-length encoding data compression method.
  // Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  def encode[T](list: List[T]): List[(Int, T)] = {
    ???
  }

  // Modified run-length encoding
  // Modify the result of encode in such a way that if an element has no duplicates it is simply
  // copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  def modifiedEncode[T](list: List[T]): List[Any] = {
    ???
  }


}
